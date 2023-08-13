package ru.netology.CashBackHacker;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void testRemain() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainZero() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainMax() {
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}