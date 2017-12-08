package space.lwj.invest.service;

/**
 * 投资收益相关服务类
 *
 * @author liuweijian
 * @version 2017/12/5.
 */
public interface YieldService {

    /**
     * 计算月收益率
     * @param values 包含一系列负数的投入额度，和一个正数的期末余额
     * @return 实际月收益率
     */
    double getMonthlyReturnRate(double[] values);

    /**
     * 计算年化收益率
     * @param values 包含一系列负数的投入额度，和一个正数的期末余额
     * @return 实际年化收益率
     */
    double getAnnualizedReturnRate(double[] values);

    /**
     * 计算预期期末余额
     * @param basicAmount 定投金额基数
     * @param months 定投月数
     * @param avgMonthlyRate 平均月收益率
     * @return 预期期末余额
     */
    double getExpectClosingBalance(double basicAmount, int months, double avgMonthlyRate);
}
