package org.example.Classes;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void additionTest(){
        CalculatorClass c=new CalculatorClass(5,6);
        int result=c.add();
        Assert.assertEquals(11,result);

        CalculatorClass c2=new CalculatorClass(-3,6);
        int result2=c2.add();
        Assert.assertEquals(3,result2);
    }
    @Test
    public void subtractionTest(){
        CalculatorClass c=new CalculatorClass(5,6);
        int result=c.sub();
        Assert.assertEquals(-1,result);

        CalculatorClass c2=new CalculatorClass(-3,6);
        int result2=c2.sub();
        Assert.assertEquals(-9,result2);
    }
    @Test
    public void multiplicationTest(){
        CalculatorClass c=new CalculatorClass(5,6);
        int result=c.mul();
        Assert.assertEquals(30,result);

        CalculatorClass c2=new CalculatorClass(-3,6);
        int result2=c2.mul();
        Assert.assertEquals(-18,result2);
    }
    @Test
    public void divisionTest(){
        CalculatorClass c=new CalculatorClass(5,6);
        int result=c.div();
        Assert.assertEquals(0,result);

        CalculatorClass c2=new CalculatorClass(-5,6);
        int result2=c2.div();
        Assert.assertEquals(0,result2);

        CalculatorClass c3=new CalculatorClass(10,2);
        int result3=c3.div();
        Assert.assertEquals(5,result3);

        CalculatorClass c4=new CalculatorClass(-10,-5);
        int result4=c4.div();
        Assert.assertEquals(2,result4);
    }
}
