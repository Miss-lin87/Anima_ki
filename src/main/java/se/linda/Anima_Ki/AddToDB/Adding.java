package se.linda.Anima_Ki.AddToDB;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import se.linda.Anima_Ki.database.GetData;
import se.linda.Anima_Ki.kiEffects.Effect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Adding {
    private GetData getData;
    private Gson gson;

    @Autowired
    public Adding(GetData getData) {
        this.getData = getData;
        this.gson = new Gson();
    }

    private Effect getEffectData(String fileName) {
        JsonObject temp = new JsonObject();
        try {
            temp = gson.fromJson(new JsonReader(new FileReader("src/main/java/se/linda/Anima_Ki/TemplateEffects/" + fileName + ".json")), JsonObject.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return gson.fromJson(temp, Effect.class);
    }

    public void addEffectToDB(String fileName) {
        getData.addEffect(getEffectData(fileName));
    }
}