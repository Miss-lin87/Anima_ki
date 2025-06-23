package se.linda.Anima_Ki.Techniques;

import se.linda.Anima_Ki.Functions.Calculations;

import java.util.List;

public class Technique implements Calculations {
    private SelectedEffect primaryEffect;
    private List<SelectedEffect> secondaryEffects;

    public Technique(SelectedEffect primaryEffect, List<SelectedEffect> secoundEffects) {
        this.primaryEffect = primaryEffect;
        this.secondaryEffects = secoundEffects;
    }
}
