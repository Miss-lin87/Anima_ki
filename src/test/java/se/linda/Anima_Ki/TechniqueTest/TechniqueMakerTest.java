package se.linda.Anima_Ki.TechniqueTest;

import org.junit.jupiter.api.Test;
import se.linda.Anima_Ki.KiEffects.EffectLevel;

import java.util.Map;

public class TechniqueMakerTest {
    Map<Integer, EffectLevel> mockMap = Map.of(
            1, new EffectLevel(1,1,2,3,4,0),
            2, new EffectLevel(2,2,3,4,5,0),
            3, new EffectLevel(3,3,4,5,6,0),
            4, new EffectLevel(4,4,5,6,7,0));
//    Effect mock = new Effect(
//            "Test1",
//            mockMap,
//            Mockito.mock(Stats.class),
//            Mockito.mock(Map.class),
//            Mockito.mock(ArrayList.class));
//    Effect mock2 = new Effect(
//            "Test2",
//            mockMap,
//            Mockito.mock(Stats.class),
//            Mockito.mock(Map.class),
//            Mockito.mock(ArrayList.class));

    @Test
    public void testCost() {
//        assertAll(
//                () -> assertEquals(6, new TechniqueMaker("test", mock,4,Map.of(mock,1)).cost()),
//                () -> assertEquals(3,new TechniqueMaker("test", mock,1,Map.of(mock,1)).cost()),
//                () -> assertEquals(5, new TechniqueMaker("test", mock,3,Map.of(mock,1)).cost()),
//                () -> assertEquals(9, new TechniqueMaker("test", mock,4,Map.of(mock,4)).cost()),
//                () -> assertEquals(9, new TechniqueMaker("test", mock,4,Map.of(mock,1, mock2,2)).cost()),
//                () -> assertEquals(14, new TechniqueMaker("test", mock,4,Map.of(mock,4, mock2,4)).cost())
//        );
    }
}