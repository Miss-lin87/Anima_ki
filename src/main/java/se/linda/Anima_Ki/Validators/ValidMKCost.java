package se.linda.Anima_Ki.Validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import se.linda.Anima_Ki.Player;
import se.linda.Anima_Ki.techniques.Technique;

public class ValidMKCost implements Validator {
    private Player player;

    public ValidMKCost(Player player) {
        this.player = player;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Technique.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Technique tech = (Technique) target;
        if (tech.getFinalCost() > player.getMKPoints()) {
            errors.rejectValue("totalCost", "insufficient.MKPoints", "Not enough MK Points to perform this technique.");
        }
    }

    @Override
    public Errors validateObject(Object target) {
        return Validator.super.validateObject(target);
    }
}