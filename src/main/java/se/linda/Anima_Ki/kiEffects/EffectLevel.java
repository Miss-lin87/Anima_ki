package se.linda.Anima_Ki.kiEffects;

import lombok.Data;

@Data
public class EffectLevel {
    private int level;
    private int primaryCost;
    private int secondaryCost;
    private int mkCost;
    private int maintainCost;
    private int levelNeed;

    public EffectLevel(int level,int primaryCost, int secondaryCost, int mkCost, int maintainCost, int levelNeed) {
        this.level = level;
        this.primaryCost = primaryCost;
        this.secondaryCost = secondaryCost;
        this.mkCost = mkCost;
        this.maintainCost = maintainCost;
        this.levelNeed = levelNeed;
    }

    public Integer[] getCosts() {
        return new Integer[]{level, primaryCost, secondaryCost, mkCost, maintainCost, levelNeed};
    }

    public String getID() {
        return String.valueOf(level);
    }
}
