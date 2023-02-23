package ru.netology.service;


import org.junit.Test;

public class CashbackHackServiceTest {
    @Test

    public void CashBackFromRemain () {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        org.junit.Assert.assertEquals(actual, expected);
    }
}
