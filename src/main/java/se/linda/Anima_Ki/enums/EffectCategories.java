package se.linda.Anima_Ki.enums;

public enum EffectCategories {
    LEVEL("Level"),
    PRIMARY("Primary Cost"),
    SECONDARY("Secondary Cost"),
    MKCOST("MK Cost"),
    MAINTAIN("Maintainance Cost"),
    LEVELNEED("Level Required");

    private final String name;

    EffectCategories(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
