import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)

public class ParameterizedTest {
    public Feline feline;
    @Before
    public void beforeTest(){
        feline = new Feline();}
    private String animalKind;
    private List expected;

    public ParameterizedTest(String animalKind, List expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getListFood() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getListFoodFeline() throws Exception {
        Assert.assertEquals(expected, feline.getFood(animalKind));
    }
}