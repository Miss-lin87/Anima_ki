package se.linda.Anima_Ki.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import se.linda.Anima_Ki.Enums.EffectCategories;
import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.KiEffects.DisplayEffect;
import se.linda.Anima_Ki.KiEffects.EffectLevel;
import se.linda.Anima_Ki.KiEffects.EffectMaker;

import java.io.FileNotFoundException;

@RestController
public class EffectController implements WebMvcConfigurer {

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
        DisplayEffect temp = new EffectMaker().test();
        ModelAndView modelAndView = new ModelAndView("EffectBox");
        modelAndView.addObject("EffectName", "Test Effect");
        modelAndView.addObject("EffectCategories", EffectCategories.values());
        modelAndView.addObject("EffectLevels", temp.getLevelArray());
        modelAndView.addObject("Stats", Stats.values());
        return modelAndView;
    }
}