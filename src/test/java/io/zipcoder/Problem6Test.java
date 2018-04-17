package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void testConversion1(){
        Problem6 problem6 = new Problem6();
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion2(){
        Problem6 problem6 = new Problem6();
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion3(){
        Problem6 problem6 = new Problem6();
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion4(){
        Problem6 problem6 = new Problem6();
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion5(){
        Problem6 problem6 = new Problem6();
        String input = "10:02am";
        String expected = "Ten Hundred and Zero Two Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion6(){
        Problem6 problem6 = new Problem6();
        String input = "12:00pm";
        String expected = "Twelve Hundred and Zero Zero Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConversion7(){
        Problem6 problem6 = new Problem6();
        String input = "12:00am";
        String expected = "Zero Zero Hundred and Zero Zero Hours";
        String actual = problem6.militaryTimeConverter(input);
        Assert.assertEquals(expected, actual);
    }
}
