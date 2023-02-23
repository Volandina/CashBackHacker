package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test

    public void CashBackFromRemain () {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBackIfOver() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);

        assertEquals(actual, expected);
    }
}
