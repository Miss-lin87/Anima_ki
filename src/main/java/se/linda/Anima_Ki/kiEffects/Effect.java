package se.linda.Anima_Ki.kiEffects;

import lombok.Data;
import se.linda.Anima_Ki.enums.Elements;
import se.linda.Anima_Ki.enums.Stats;

import java.util.List;
import java.util.Map;

@Data
public class Effect {
    private String EffectName;
    private Map<Integer, EffectLevel> Levels;
    private Stats PrimaryStat;
    private Map<Stats,Integer> SecondaryStats;
    private List<Elements> Elements;

    public Effect() {
    }

    public Effect(String effectName , Map<Integer, EffectLevel> levels,
                  Stats primaryStat, Map<Stats, Integer> secondaryStats, List<Elements> elements) {
        this.EffectName = effectName;
        this.Levels = levels;
        this.PrimaryStat = primaryStat;
        this.SecondaryStats = secondaryStats;
        this.Elements = elements;
    }

    public EffectLevel[] getLevelArray() {
        return Levels.values().toArray(new EffectLevel[0]);
    }
}