package com.example.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testDeposit() {

        int result = App.deposit(5000, 2000);

        assertEquals(7000, result);
    }

    @Test
    public void testWithdraw() {

        int result = App.withdraw(7000, 1000);

        assertEquals(6000, result);
    }
}
