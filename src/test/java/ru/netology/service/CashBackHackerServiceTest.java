package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashBackHackerServiceTest{

    @org.junit.Test
    public void shouldCalculateRemaind900() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemaind999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemaind0() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}