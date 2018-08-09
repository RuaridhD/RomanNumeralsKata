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
        assertEquals("XXI", convertor.generate(21));
        assertEquals("XXII", convertor.generate(22));
        assertEquals("XXIII", convertor.generate(23));
        assertEquals("XXIV", convertor.generate(24));
        assertEquals("XXV", convertor.generate(25));
        assertEquals("XXVI", convertor.generate(26));
        assertEquals("XXVII", convertor.generate(27));
        assertEquals("XXVIII", convertor.generate(28));
        assertEquals("XXIX", convertor.generate(29));
        assertEquals("XXX", convertor.generate(30));
        assertEquals("XL", convertor.generate(40));
        assertEquals("L", convertor.generate(50));
        assertEquals("XC", convertor.generate(90));
        assertEquals("C", convertor.generate(100));
        assertEquals("CD", convertor.generate(400));
        assertEquals("D", convertor.generate(500));
        assertEquals("CM", convertor.generate(900));
        assertEquals("M", convertor.generate(1000));
    }

    @Test
    public void cantEnterNumberBelow1(){
        assertEquals("Please only enter numbers between 1 - 3999", convertor.generate(0));
    }

    @Test
    public void cantEnterNumberAbove3999(){
        assertEquals("Please only enter numbers between 1 - 3999", convertor.generate(4000));
    }

    @Test
    public void canConvertRandomEdgeCases(){
        assertEquals("MMMCMXCIX", convertor.generate(3999));
        assertEquals("MMM", convertor.generate(3000));
        assertEquals("MMCDL", convertor.generate(2450));
        assertEquals("MDCCLXXXIII", convertor.generate(1783));
        assertEquals("MI", convertor.generate(1001));

    }
}