package space.lwj.service.impl;

import org.apache.poi.ss.formula.functions.Irr;
import space.lwj.service.InvestService;

/**
 * @author liuweijian
 * @version 2017/12/5.
 */
public class InvestServiceImpl implements InvestService {
    @Override
    public double getMonthlyReturn(double[] values) {
        return Irr.irr(values);
    }

    @Override
    public double getAnnualizedReturn(double[] values) {
        double monthlyReturn = getMonthlyReturn(values);
        return Math.pow(1 + monthlyReturn, 12) - 1;
    }
}
