package se.linda.Anima_Ki.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.linda.Anima_Ki.kiEffects.EffectMaker;

@Configuration
class DatabaseConfig {

    @Bean
    public EffectMaker effectMaker() {
        return new EffectMaker();
    }

    @Bean
    public String ConnectionStrig() {
        return "mongodb+srv://LindaEk:qVEO4e2RpnqvX0PU@animadata.pnlatwk.mongodb.net/?retryWrites=true&w=majority&appName=AnimaData";
    }

    @Bean
    public MongoDatabase mongoDatabase(MongoClient mongoClient) {
        return mongoClient.getDatabase("Anima_Ki");
    }

    @Bean
    public MongoClient mongoClient(String ConnectionString) {
        return MongoClients.create(ConnectionString);
    }

    @Bean
    public GetData getData(MongoDatabase data) {
        return new GetData(data);
    }
}
