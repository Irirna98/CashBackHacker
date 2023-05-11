package ru.netology.service;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackerTest {
    @Test
    public void calculateCash900() {
        CashbackHackService cashService = new CashbackHackService();
        int amount = 900;
        int actual = cashService.remain(amount);
        int expected = 100;
        assertEquals( expected, actual);
    }
}
