package se.linda.Anima_Ki.techniques;

import lombok.Data;
import se.linda.Anima_Ki.enums.Stats;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Technique {
    private SelectedEffect primaryEffect;
    private final List<SelectedEffect> secondaryEffects;
    private final Map<Stats, Integer> totalCost;

    public Technique(SelectedEffect primaryEffect, List<SelectedEffect> secondaryEffects) {
        this.primaryEffect = primaryEffect;
        this.secondaryEffects = secondaryEffects;
        this.totalCost = new HashMap<>();
    }

    public Map<Stats, Integer> getTotalCost() {
        totalCost.putAll(primaryEffect.getCostDistrubution());
        for (SelectedEffect E : secondaryEffects) {
            for (Stats S : E.getCostDistrubution().keySet()) {
                if (totalCost.get(S) == null) {
                    totalCost.put(S, E.getCostDistrubution().get(S));
                } else {
                    totalCost.put(S, totalCost.get(S) + E.getCostDistrubution().get(S));
                }
            }
        }
        return totalCost;
    }
}