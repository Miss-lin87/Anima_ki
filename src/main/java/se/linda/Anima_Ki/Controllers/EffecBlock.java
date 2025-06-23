package se.linda.Anima_Ki.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import se.linda.Anima_Ki.Enums.EffectCategories;

@RestController
public class EffecBlock {

    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView("Effect.html");
        modelAndView.addObject("EffectName", "Test Effect");
        modelAndView.addObject("EffectCategories", EffectCategories.values());
        return modelAndView;
    }
}
