package se.linda.Anima_Ki.controllers;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import se.linda.Anima_Ki.AddToDB.Adding;
import se.linda.Anima_Ki.database.GetData;
import se.linda.Anima_Ki.enums.EffectCategories;
import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.kiEffects.Effect;
import se.linda.Anima_Ki.kiEffects.EffectMaker;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class EffectController implements WebMvcConfigurer {
    private Effect effect;
    private List<Stats> statsList;
    private GetData getData;
    private MongoCollection<Document> effectCollection;

    @Autowired
    public EffectController(GetData getData, EffectMaker effectMaker, MongoCollection<Document> effectCollection) {
        this.effect = effectMaker.test();
        this.statsList = new ArrayList<>();
        this.getData = getData;
        this.effectCollection = effectCollection;
    }

    private void setStatsList() {
        statsList.add(effect.getPrimaryStat());
        for (Map.Entry<Stats, Integer> E : effect.getSecondaryStats().entrySet()) {
            statsList.add(E.getKey());
        }
    }

    @GetMapping("/")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("Effect");
        modelAndView.addObject("EffectName", "Test Effect");
        modelAndView.addObject("EffectCategories", EffectCategories.values());
        return modelAndView;
    }

    @GetMapping("/t")
    public void testing() {
        System.out.println(getData.getEffect("Counterattack Ability"));
    }

    @GetMapping("/me")
    public ModelAndView mine() throws FileNotFoundException {
        Effect temp = new EffectMaker().test();
        ModelAndView modelAndView = new ModelAndView("EffectBox");
        modelAndView.addObject("EffectName", "Test Effect");
        modelAndView.addObject("EffectCategories", EffectCategories.values());
        modelAndView.addObject("EffectLevels", temp.getLevelArray());
        setStatsList();
        modelAndView.addObject("Stats", statsList);
        return modelAndView;
    }

}