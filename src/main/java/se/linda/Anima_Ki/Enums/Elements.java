package se.linda.Anima_Ki.Enums;

public enum Elements {
    FIRE("Fire"),
    WATER("Water"),
    EARTH("Earth"),
    AIR("Air"),
    LIGHT("Light"),
    DARKNESS("Darkness"),
    TIME("Time"),
    SPACE("Space");

    private final String name;

    Elements(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
