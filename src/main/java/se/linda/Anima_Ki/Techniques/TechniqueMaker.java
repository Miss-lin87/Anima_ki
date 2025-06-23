package se.linda.Anima_Ki.Techniques;

import lombok.Data;
import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.Functions.Calculations;
import se.linda.Anima_Ki.KiEffects.DisplayEffect;

import java.util.List;
import java.util.Map;

@Data
public class TechniqueMaker implements Calculations {
    private String TechniqueName;
    private DisplayEffect primaryDisplayEffect;
    private int primaryEffectLevel;
    private Map<DisplayEffect,Integer> secondaryEffects;
    private List<Stats> statUsed;

    public TechniqueMaker() {
    }

    public TechniqueMaker(String techniqueName, DisplayEffect primaryDisplayEffect, int primaryEffectLevel,
                          Map<DisplayEffect, Integer> secondaryEffects, List<Stats> statUsed) {
        this.TechniqueName = techniqueName;
        this.primaryDisplayEffect = primaryDisplayEffect;
        this.primaryEffectLevel = primaryEffectLevel;
        this.secondaryEffects = secondaryEffects;
        this.statUsed = statUsed;
    }

    public int cost() {
        return cost(this);
    }
}