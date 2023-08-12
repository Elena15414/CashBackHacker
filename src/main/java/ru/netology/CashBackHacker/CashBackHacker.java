package ru.netology.CashBackHacker;

public class CashBackHacker {
    public final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
