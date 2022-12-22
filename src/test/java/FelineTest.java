import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    public Feline feline;
    @Before
    public void beforeTest(){
        feline = new Feline();
    }

    @Test
    public void felineEatMeatReturnList() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkValueFeline() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.getFood("Хищник"));
    }

    @Test
    public void getFamilyFeline() {
        Assert.assertEquals("Ошибка","Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensReturnOne() {
        int getKittens = 1;
        int actual = feline.getKittens();
        Assert.assertEquals("Ошибка",getKittens, actual);
    }
    @Test
    public void getKittensCount() {
        int kittensCount = 1;
        int actual = feline.getKittens();
        Assert.assertEquals("Ошибка",kittensCount, actual);
    }

}

