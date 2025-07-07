package se.linda.Anima_Ki.ValidatorsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import se.linda.Anima_Ki.Player;
import se.linda.Anima_Ki.Validators.ValidMKCost;
import se.linda.Anima_Ki.mocks.SelectedEffects;
import se.linda.Anima_Ki.techniques.SelectedEffect;
import se.linda.Anima_Ki.techniques.Technique;

import java.util.HashMap;
import java.util.List;

public class ValidMKCostTest {
    private ValidMKCost valid = new ValidMKCost(new Player(5));
    private List<SelectedEffect> selectedEffects = List.of(SelectedEffects.effect2, SelectedEffects.effect3);
    private Technique technique = new Technique(SelectedEffects.effect1, selectedEffects, new HashMap<>());
    private Errors errors = new BeanPropertyBindingResult(technique, "technique");

    @Test
    public void validMKCostTest() {
        int expectedCost = 6; // 1 + 2 + 3 from effect2 and effect3
        valid.validate(technique, errors);
        Assertions.assertTrue(errors.hasErrors());
        System.out.println(errors.getFieldError("totalCost"));
    }
}