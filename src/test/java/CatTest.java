import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;


    @Test
    public void catGetSound(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals("Ошибка", "Мяу", actual);
    }

    @Test
    public void catGetFoodPredatorEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
}

