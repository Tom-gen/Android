package com.hanbit.user.myapp160702.calc;

/**
 * Created by 1027 on 2016-07-09.
 */
public class CalcServiceImpt implements CalcService {
    @Override
    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == (double) 0)
            return 0;
        return num1 / num2;
    }


}
