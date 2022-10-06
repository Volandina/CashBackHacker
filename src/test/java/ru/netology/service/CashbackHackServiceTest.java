package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {
    @Test

    public void CashBackFromRemain () {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);

        org.testng.Assert.assertEquals(actual, expected);
    }
}
