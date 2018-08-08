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
    public void canConvertGivenNumberIntoRomanNumeral(){
        assertEquals("I", convertor.generate(1));
        assertEquals("II", convertor.generate(2));
        assertEquals("III", convertor.generate(3));
        assertEquals("IV", convertor.generate(4));
        assertEquals("V", convertor.generate(5));
        assertEquals("VI", convertor.generate(6));
        assertEquals("VII", convertor.generate(7));
        assertEquals("VIII", convertor.generate(8));
        assertEquals("IX", convertor.generate(9));
        assertEquals("X", convertor.generate(10));
        assertEquals("XI", convertor.generate(11));
        assertEquals("XII", convertor.generate(12));
        assertEquals("XIII", convertor.generate(13));
        assertEquals("XIV", convertor.generate(14));
        assertEquals("XV", convertor.generate(15));
        assertEquals("XVI", convertor.generate(16));
        assertEquals("XVII", convertor.generate(17));
        assertEquals("XVIII", convertor.generate(18));
        assertEquals("XIX", convertor.generate(19));
        assertEquals("XX", convertor.generate(20));
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