package se.linda.Anima_Ki.Functions;

import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.KiEffects.DisplayEffect;
import se.linda.Anima_Ki.Techniques.TechniqueMaker;

import java.util.List;
import java.util.Map;

public interface Calculations {

    default int cost(TechniqueMaker technique) {
        int mainCost = technique.getPrimaryDisplayEffect().getLevels().get(technique.getPrimaryEffectLevel()).getPrimaryCost();
        int secoundCost = 0;
        for (Map.Entry<DisplayEffect, Integer> E : technique.getSecondaryEffects().entrySet()) {
            secoundCost += E.getKey().getLevels().get(E.getValue()).getSecondaryCost();
        }
        return mainCost+secoundCost;
    }

    private int primaryCost(TechniqueMaker technique) {
        return technique.getPrimaryDisplayEffect().getLevels().get(technique.getPrimaryEffectLevel()).getPrimaryCost();
    }

    private int secondaryCost(Map<DisplayEffect, Integer> secondaryEffects) {
        int cost = 0;
        for (Map.Entry<DisplayEffect, Integer> E : secondaryEffects.entrySet()) {
            cost += E.getKey().getLevels().get(E.getValue()).getSecondaryCost();
        }
        return cost;
    }

    private int statsCost(List<Stats> usedStats) {
        int cost = 0;
        for (Stats stat : usedStats) {

        }
        return cost;
    }
}