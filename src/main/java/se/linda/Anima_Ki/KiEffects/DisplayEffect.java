package se.linda.Anima_Ki.KiEffects;

import lombok.Data;
import se.linda.Anima_Ki.Enums.Elements;
import se.linda.Anima_Ki.Enums.Stats;

import java.util.List;
import java.util.Map;

@Data
public class DisplayEffect {
    private String EffectName;
    private Map<Integer, EffectLevel> Levels;
    private Stats PrimaryStat;
    private Map<Stats,Integer> SecondaryStats;
    private List<Elements> Elements;

    public DisplayEffect() {
    }

    public DisplayEffect(String effectName , Map<Integer, EffectLevel> levels,
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