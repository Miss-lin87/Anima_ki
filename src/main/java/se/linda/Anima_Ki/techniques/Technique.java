package se.linda.Anima_Ki.techniques;

import lombok.Data;
import se.linda.Anima_Ki.enums.Stats;

import java.util.List;
import java.util.Map;

@Data
public class Technique {
    private SelectedEffect primaryEffect;
    private final List<SelectedEffect> secondaryEffects;
    private final Map<Stats, Integer> costMap;
    private final int totalCost;

    public Technique(SelectedEffect primaryEffect, List<SelectedEffect> secondaryEffects,
                     Map<Stats, Integer> costMap) {
        this.primaryEffect = primaryEffect;
        this.secondaryEffects = secondaryEffects;
        this.costMap = costMap;
        this.totalCost = getFinalCost();
    }

    public Map<Stats, Integer> getCostMap() {
        costMap.putAll(primaryEffect.getCostDistrubution());
        for (SelectedEffect E : secondaryEffects) {
            for (Stats S : E.getCostDistrubution().keySet()) {
                if (costMap.get(S) == null) {
                    costMap.put(S, E.getCostDistrubution().get(S));
                } else {
                    costMap.put(S, costMap.get(S) + E.getCostDistrubution().get(S));
                }
            }
        }
        return costMap;
    }

    public int getFinalCost() {
        int finalCost = primaryEffect.getLevel().getMkCost();
        for (SelectedEffect E : secondaryEffects) {
            finalCost += E.getLevel().getMkCost();
        }
        return finalCost;
    }
}