package se.linda.Anima_Ki.Enums;

public enum EffectCategories {
    PRIMARY("Primary Cost"),
    SECONDARY("Secondary Cost"),
    MKCOST("MK Cost"),
    MAINTAIN("Maintainance Cost"),
    LEVEL("Level Required");

    private final String name;

    EffectCategories(String name) {
        this.name = name;
    }
}
