package se.linda.Anima_Ki.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
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
    private Effect effect = new EffectMaker().test();
    private List<Stats> statsList = new ArrayList<>();

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
    public ModelAndView testing(){
        return new ModelAndView("test");
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