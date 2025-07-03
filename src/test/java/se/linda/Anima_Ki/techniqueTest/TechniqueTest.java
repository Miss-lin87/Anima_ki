package se.linda.Anima_Ki.techniqueTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;
import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.mocks.SelectedEffects;
import se.linda.Anima_Ki.techniques.SelectedEffect;
import se.linda.Anima_Ki.techniques.Technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class TechniqueTest implements SelectedEffects {
    private final List<SelectedEffect> secondEffects = new ArrayList<>();
    private final Map<Stats, Integer> expected = new HashMap<>();

    @BeforeEach
    public void init() {
        secondEffects.clear();
        expected.clear();
    }

    @Test
    public void addZeroTest() {
        expected.putAll(Map.of(Stats.DEXTERITY, 1, Stats.POWER, 1, Stats.AGILITY, 1));
        Technique tech = new Technique(effect1, secondEffects);
        Assertions.assertEquals(expected, tech.getTotalCost());
    }

    @Test
    public void addOneTest() {
        expected.putAll(Map.of(Stats.DEXTERITY, 3, Stats.POWER, 3, Stats.AGILITY, 3));
        secondEffects.add(effect2);
        Technique tech = new Technique(effect1, secondEffects);
        Assertions.assertEquals(expected, tech.getTotalCost());
    }

    @Test
    public void addTwoTest() {
        expected.putAll(Map.of(Stats.DEXTERITY, 6, Stats.POWER, 6, Stats.AGILITY, 6));
        secondEffects.addAll(List.of(effect2, effect3));
        Technique tech = new Technique(effect1, secondEffects);
        Assertions.assertEquals(expected, tech.getTotalCost());
    }

    @Test
    public void addThreeTest() {
        expected.putAll(Map.of(Stats.DEXTERITY, 10, Stats.POWER, 10, Stats.AGILITY, 10));
        secondEffects.addAll(List.of(effect2, effect3, effect4));
        Technique tech = new Technique(effect1, secondEffects);
        Assertions.assertEquals(expected, tech.getTotalCost());
    }
}