package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashBackHackerServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateRemainder500() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainder100() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainder1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

//    @org.testng.annotations.Test
//    public void shouldCalculateRemainder0() {
//        CashBackHackerService service = new CashBackHackerService();
//        int amount = 1000;
//        int expected = 0;
//        int actual = service.remain(amount);
//        org.testng.Assert.assertEquals(actual, expected);
//    }
}