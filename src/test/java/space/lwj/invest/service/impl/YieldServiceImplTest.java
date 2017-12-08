package space.lwj.invest.service.impl;

import org.junit.Test;
import space.lwj.invest.service.YieldService;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class YieldServiceImplTest {

    private YieldService yieldService = new YieldServiceImpl();;
    private double[] values = {
            -10000d,
            -10000d,
            -10000d,
            -10000d,
            -10000d,
            -10000d,
            -10000d,
            76518.95
    };

    @Test
    public void getMonthlyReturn() {
        double monthlyReturn = yieldService.getMonthlyReturnRate(values);
        String actual = new DecimalFormat("#.00").format(monthlyReturn * 100) + "%";
        assertEquals("2.23%", actual);
    }

    @Test
    public void testGetAnnualizedReturn() {
        double annualizedReturn = yieldService.getAnnualizedReturnRate(values);
        String actual = new DecimalFormat("#.00").format(annualizedReturn * 100) + "%";
        assertEquals("30.24%", actual);
    }

    @Test
    public void testGetExpectClosingBalance() {
        double expectClosingBalance = yieldService.getExpectClosingBalance(100, 2, 0.02D);
        String actual = new DecimalFormat("#.00").format(expectClosingBalance);
        assertEquals("206.04", actual);
    }
}