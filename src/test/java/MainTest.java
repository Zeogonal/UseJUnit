
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testOne(){
        Main.nameSearch("Phil");
        Main.nameSearch("Fox");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void testTwo(){
        Main.nameSearch("Persi");
        Main.nameSearch("Toren");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void testThree(){
        Assertions.assertFalse(Main.nameSearch("х"));
        Main.name = "end";
    }
    @Test
    public void testFour(){
        Assertions.assertFalse(Main.nameSearch(String.valueOf(123)));
        Main.name = "end";
    }

}