package se.linda.Anima_Ki.enums;

public enum Stats {
    STRENGTH("Strength"),
    DEXTERITY("Dexterity"),
    AGILITY("Agility"),
    CONSTITUTION("Constitution"),
    INTELLIGENCE("Intelligence"),
    POWER("Power"),
    WILLPOWER("Willpower"),
    PERCEPTION("Perception");

    private final String name;

    Stats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
