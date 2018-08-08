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
        assertEquals("II", convertor.generate(2));
        assertEquals("III", convertor.generate(3));
        assertEquals("IV", convertor.generate(4));
    }

    @Test
    public void cantEnterNumberBelow1(){
        assertEquals("Please only enter numbers between 1 - 3999", convertor.generate(0));
    }

    @Test
    public void cantEnterNumberAbove3999(){
        assertEquals("Please only enter numbers between 1 - 3999", convertor.generate(4000));
    }
}