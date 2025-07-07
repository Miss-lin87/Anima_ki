package se.linda.Anima_Ki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.linda.Anima_Ki.Validators.ValidMKCost;
import se.linda.Anima_Ki.database.GetData;
import se.linda.Anima_Ki.enums.Stats;
import se.linda.Anima_Ki.kiEffects.Effect;
import se.linda.Anima_Ki.kiEffects.EffectMaker;
import se.linda.Anima_Ki.techniques.SelectedEffect;
import se.linda.Anima_Ki.techniques.Technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AnimaKiApplication {
	private EffectMaker maker = new EffectMaker();
	private SelectedEffect effect1 = new SelectedEffect(
			"Effect1",
			maker.test(),
			1,
			true,
			new HashMap<>(Map.of(Stats.AGILITY, 1,
					Stats.DEXTERITY, 1,
					Stats.POWER, 1)));

	private SelectedEffect effect2 = new SelectedEffect(
			"Effect2",
			maker.test(),
			1,
			true,
			new HashMap<>(Map.of(Stats.AGILITY, 2,
					Stats.DEXTERITY, 2,
					Stats.POWER, 2)));
	private SelectedEffect effect3 = new SelectedEffect(
			"Effect3",
			maker.test(),
			1,
			true,
			new HashMap<>(Map.of(Stats.AGILITY, 3,
					Stats.DEXTERITY, 3,
					Stats.POWER, 3)));
	private List<SelectedEffect> secondary = new ArrayList<>();


	public static void main(String[] args) {
		/*AnimaKiApplication main = new AnimaKiApplication();
		main.secondary.add(main.effect2);
		main.secondary.add(main.effect3);
		Technique tech1 = new Technique(main.effect1, main.secondary);
		System.out.println(tech1);
		System.out.println(tech1.getTotalCost());
		main.secondary.clear();
		main.secondary.add(main.effect2);
		main.secondary.add(main.effect3);
		Technique tech = new Technique(main.effect1, main.secondary);
		System.out.println(tech);
		System.out.println(tech.getTotalCost());*/
		//SpringApplication.run(AnimaKiApplication.class, args);
	}
}