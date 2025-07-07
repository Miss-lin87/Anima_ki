package se.linda.Anima_Ki.techniques;

import lombok.Data;
import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.kiEffects.Effect;
import se.linda.Anima_Ki.kiEffects.EffectLevel;

import java.util.Map;

@Data
public class SelectedEffect {
    private final String name;
    private final Effect effect;
    private final EffectLevel level;
    private final boolean primary;
    private final Map<Stats, Integer> costDistrubution;

    public SelectedEffect(String name, Effect effect ,int level , boolean primary, Map<Stats, Integer> costDistrubution) {
        this.name = name;
        this.effect = effect;
        this.level = effect.getLevels().get(level);
        this.primary = primary;
        this.costDistrubution = costDistrubution;
    }
}