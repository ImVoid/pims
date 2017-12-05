package space.lwj.service;

/**
 * 投资收益相关服务类
 *
 * @author liuweijian
 * @version 2017/12/5.
 */
public interface InvestService {

    /**
     * 计算月收益率
     * @param values 包含一系列负数的投入额度，和一个正数的期末总资产
     * @return 实际月收益率
     */
    double getMonthlyReturn(double[] values);

    /**
     * 计算年化收益率
     * @param values 包含一系列负数的投入额度，和一个正数的期末总资产
     * @return 实际年化收益率
     */
    double getAnnualizedReturn(double[] values);
}