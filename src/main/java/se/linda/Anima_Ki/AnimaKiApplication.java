package se.linda.Anima_Ki;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.linda.Anima_Ki.Enums.Stats;
import se.linda.Anima_Ki.KiEffects.EffectMaker;
import se.linda.Anima_Ki.Techniques.TechniqueMaker;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AnimaKiApplication {

	public static void main(String[] args) throws FileNotFoundException {
		EffectMaker effectM = new EffectMaker();
		effectM.test();
		System.out.print("Cost: ");
		effectM.getCost(effectM.test(), 4, false);
		TechniqueMaker maker = new TechniqueMaker(
				"TestTech",
				effectM.test(),
				3,
				Map.of(effectM.test(),1),
				List.of(Stats.DEXTERITY, Stats.POWER));
		System.out.println("Cost: " + maker.cost());
		//SpringApplication.run(AnimaKiApplication.class, args);
	}

}
