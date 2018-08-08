import classes.Convertor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertorTest {

    Convertor convertor;

    @Before
    public void before(){
        convertor = new Convertor();
    }

    @Test
    public void canConvert(){
        assertEquals("I", convertor.generate(1));
    }
}