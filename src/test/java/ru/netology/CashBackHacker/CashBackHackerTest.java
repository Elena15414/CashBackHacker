package ru.netology.CashBackHacker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {

    @Test
    public void testRemain() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainZero() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainMax() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testRemainJunitJupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainZeroJunitJupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainMaxJunitJupiter() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}