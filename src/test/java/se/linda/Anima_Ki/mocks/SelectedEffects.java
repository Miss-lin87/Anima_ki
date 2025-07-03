package se.linda.Anima_Ki.mocks;

import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.kiEffects.EffectMaker;
import se.linda.Anima_Ki.techniques.SelectedEffect;

import java.util.HashMap;
import java.util.Map;

public interface SelectedEffects {
    EffectMaker maker = new EffectMaker();
    SelectedEffect effect1 = new SelectedEffect(
            "Effect1",
            maker.test(),
            true,
            new HashMap<>(Map.of(Stats.AGILITY, 1,
                    Stats.DEXTERITY, 1,
                    Stats.POWER, 1))
    );

    SelectedEffect effect2 = new SelectedEffect(
            "Effect2",
            maker.test(),
            true,
            new HashMap<>(Map.of(Stats.AGILITY, 2,
                    Stats.DEXTERITY, 2,
                    Stats.POWER, 2))
    );

    SelectedEffect effect3 = new SelectedEffect(
            "Effect3",
            maker.test(),
            true,
            new HashMap<>(Map.of(Stats.AGILITY, 3,
                    Stats.DEXTERITY, 3,
                    Stats.POWER, 3))
    );

    SelectedEffect effect4 = new SelectedEffect(
            "Effect4",
            maker.test(),
            true,
            new HashMap<>(Map.of(Stats.AGILITY,4,
                    Stats.DEXTERITY, 4,
                    Stats.POWER, 4))
    );

    SelectedEffect effect5 = new SelectedEffect(
            "Effect5",
            maker.test(),
            true,
            new HashMap<>(Map.of(
                    Stats.AGILITY, 5,
                    Stats.DEXTERITY, 5,
                    Stats.POWER, 5
            ))
    );
}