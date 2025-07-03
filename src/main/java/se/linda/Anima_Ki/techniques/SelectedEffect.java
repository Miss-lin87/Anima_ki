package se.linda.Anima_Ki.techniques;

import lombok.Data;
import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.kiEffects.Effect;
import java.util.Map;

@Data
public class SelectedEffect {
    private final String name;
    private final Effect effect;
    private final boolean primary;
    private final Map<Stats, Integer> costDistrubution;

    public SelectedEffect(String name, Effect effect, boolean primary, Map<Stats, Integer> costDistrubution) {
        this.name = name;
        this.effect = effect;
        this.primary = primary;
        this.costDistrubution = costDistrubution;
    }
}