package space.lwj.invest.service.impl;

import org.apache.poi.ss.formula.functions.Irr;
import space.lwj.invest.service.YieldService;

/**
 * @author liuweijian
 * @version 2017/12/5.
 */
public class YieldServiceImpl implements YieldService {

    /**
     * 通货膨胀系数，保证投入的金额获得大致相同的购买力
     */
    private static final double INFLATION_COEFFICIENT = 1.01;

    @Override
    public double getMonthlyReturnRate(double[] values) {
        return Irr.irr(values);
    }

    @Override
    public double getAnnualizedReturnRate(double[] values) {
        double monthlyReturn = getMonthlyReturnRate(values);
        return Math.pow(1 + monthlyReturn, 12) - 1;
    }

    @Override
    public double getExpectClosingBalance(double basicAmount, int months, double avgMonthlyRate) {
        double balance = 0;
        for (int i = 1; i <= months; i++) {
            //每月的初始本金
            double principal = balance + basicAmount;
            balance = principal + principal * avgMonthlyRate;
        }
        return balance;
    }
}
