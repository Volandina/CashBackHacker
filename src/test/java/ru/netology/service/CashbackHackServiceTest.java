package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test

    public void CashBackFromRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfOver() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);

        assertEquals(expected, actual);
    }
}
