package se.linda.Anima_Ki.KiEffects;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class EffectMaker {
    private final Gson gson = new Gson();

    public EffectMaker() {
    }

    public DisplayEffect test() throws FileNotFoundException {
        File file = new File("src/main/java/se/linda/Anima_Ki/TemplateEffect.json");
        return gson.fromJson(new JsonReader(new FileReader(file)), DisplayEffect.class);
    }

    public void getCost(DisplayEffect displayEffect, int level, boolean primary) {
        switch (primary) {
            case true -> System.out.println(displayEffect.getLevels().get(level).getPrimaryCost());
            case false -> System.out.println(displayEffect.getLevels().get(level).getSecondaryCost());
        }
    }
}
