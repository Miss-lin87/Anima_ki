package se.linda.Anima_Ki.kiEffects;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class EffectMaker {
    private final Gson gson = new Gson();

    public EffectMaker() {
    }

    public Effect test() {
        Effect temp;
        try {
            File file = new File("src/main/java/se/linda/Anima_Ki/TemplateEffect.json");
            temp = gson.fromJson(new JsonReader(new FileReader(file)), Effect.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return temp;
    }

    public void getCost(Effect effect, int level, boolean primary) {
        switch (primary) {
            case true -> System.out.println(effect.getLevels().get(level).getPrimaryCost());
            case false -> System.out.println(effect.getLevels().get(level).getSecondaryCost());
        }
    }
}