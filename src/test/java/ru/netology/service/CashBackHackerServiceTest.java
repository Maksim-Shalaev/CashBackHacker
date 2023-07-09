package ru.netology.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;

public class CashBackHackerServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemaind2() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 998;
        int expected = 2;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemaind500() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemaind900() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemaind999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemaind1() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

//    @org.junit.Test
//    @org.junit.jupiter.api.Test
//    public void shouldCalculateRemaind0() {
//        CashBackHackerService service = new CashBackHackerService();
//        int amount = 500;
//        int expected = 1000;
//        int actual = service.remain(amount);
//        org.junit.jupiter.Assertions(expected, actual);
//    }
}