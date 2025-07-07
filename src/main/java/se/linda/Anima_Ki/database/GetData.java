package se.linda.Anima_Ki.database;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import se.linda.Anima_Ki.kiEffects.Effect;

@Service
public class GetData {
    private MongoDatabase databse;

    @Autowired
    public GetData(MongoDatabase database) {
        this.databse = database;
    }

    @Bean
    public MongoCollection<Document> EffectsCollection() {
        return databse.getCollection("Effects");
    }

    public Effect getEffect(String effectName) {
        MongoCollection<Document> collection = EffectsCollection();
        for (Document doc : collection.find()) {
            if (doc.get("EffectName").equals(effectName)) {
                return new Gson().fromJson(doc.toJson(), Effect.class);
            }
        }
        return null;
    }

    public void addEffect(Effect effect) {
        MongoCollection<Document> collection = EffectsCollection();
        Document doc = Document.parse(new Gson().toJson(effect));
        collection.insertOne(doc);
    }
}