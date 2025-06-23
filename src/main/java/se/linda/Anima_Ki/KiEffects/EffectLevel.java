package se.linda.Anima_Ki.KiEffects;

import lombok.Data;

@Data
public class EffectLevel {
    private int primaryCost;
    private int secondaryCost;
    private int mkCost;
    private int maintainCost;

    public EffectLevel(int primaryCost, int secondaryCost, int mkCost, int maintainCost) {
        this.primaryCost = primaryCost;
        this.secondaryCost = secondaryCost;
        this.mkCost = mkCost;
        this.maintainCost = maintainCost;
    }
}
