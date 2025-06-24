package se.linda.Anima_Ki;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.linda.Anima_Ki.Database.Connect;
import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.KiEffects.EffectMaker;
import se.linda.Anima_Ki.Techniques.TechniqueMaker;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AnimaKiApplication implements Connect {

	public static void main(String[] args) {
		SpringApplication.run(AnimaKiApplication.class, args);
	}

}
