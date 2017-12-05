package space.lwj.service.impl;

import org.junit.BeforeClass;
import org.junit.Test;
import space.lwj.service.InvestService;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class InvestServiceImplTest {

    private InvestService investService = new InvestServiceImpl();;
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
        double monthlyReturn = investService.getMonthlyReturn(values);
        String actual = new DecimalFormat("#.00").format(monthlyReturn * 100) + "%";
        assertEquals("2.23%", actual);
    }

    @Test
    public void testGetAnnualizedReturn() {
        double annualizedReturn = investService.getAnnualizedReturn(values);
        String actual = new DecimalFormat("#.00").format(annualizedReturn * 100) + "%";
        assertEquals("30.24%", actual);
    }
}