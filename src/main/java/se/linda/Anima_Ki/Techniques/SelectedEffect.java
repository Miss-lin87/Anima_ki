package se.linda.Anima_Ki.Techniques;

import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.KiEffects.DisplayEffect;
import java.util.Map;

public class SelectedEffect {
    private final DisplayEffect effect;
    private final boolean primary;
    private final Map<Stats, Integer> costDistrubution;

    public SelectedEffect(DisplayEffect effect, boolean primary, Map<Stats, Integer> costDistrubution) {
        this.effect = effect;
        this.primary = primary;
        this.costDistrubution = costDistrubution;
    }
}
