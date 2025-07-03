package se.linda.Anima_Ki.database;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import se.linda.Anima_Ki.Constants;

public interface Connect extends Constants {
    ConnectionString connectionString = new ConnectionString(login);

    default MongoDatabase getDB() {
        try {
            MongoClient mongoClient = MongoClients.create(connectionString);
            MongoDatabase temp = mongoClient.getDatabase("Anima_Ki");
            mongoClient.close();
            return temp;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}