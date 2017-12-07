package space.lwj.invest.service.impl;

import org.apache.poi.ss.formula.functions.Irr;
import space.lwj.invest.service.YieldService;

/**
 * @author liuweijian
 * @version 2017/12/5.
 */
public class YieldServiceImpl implements YieldService {
    @Override
    public double getMonthlyReturnRate(double[] values) {
        return Irr.irr(values);
    }

    @Override
    public double getAnnualizedReturnRate(double[] values) {
        double monthlyReturn = getMonthlyReturnRate(values);
        return Math.pow(1 + monthlyReturn, 12) - 1;
    }
}
