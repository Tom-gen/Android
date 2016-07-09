package com.hanbit.user.myapp160702.kaup;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class KaupServiceImpt implements KaupService {
    @Override
    public String execute(double height, double weight) {

        if (weight == (double) 0)
            return "0";
        double value = weight * 1000 / Math.pow(height, 2) * 10;

        String result = Double.toString(value);
        if (result.length() >= result.indexOf('.') + 2)
            result = result.substring(0, result.indexOf('.') + 3);
        result += "\n";
        if (value <= 13) {
            result += "아주 마름";
        } else if (value <= 15) {
            result += "마른 편";
        } else if (value <= 18) {
            result += "정상";
        } else if (value <= 20) {
            result += "약간 비만";
        } else {
            result += "비만";
        }

        return result;
    }

    @Override
    public String execute(KaupBean bean) {
        if (bean.getWeight() == (double) 0)
            return "0";
        String name = bean.getName();
        double weight = bean.getWeight();
        double height = bean.getHeight();
        Log.d("", name);
        Log.d("", Double.toString(weight));
        Log.d("", Double.toString(height));


        double value = weight * 1000 / Math.pow(height, 2) * 10;

        String result = Double.toString(value);
        if (result.length() >= result.indexOf('.') + 2)
            result = result.substring(0, result.indexOf('.') + 3);
        result += "\n";
        if (value <= 13) {
            result += "아주 마름";
        } else if (value <= 15) {
            result += "마른 편";
        } else if (value <= 18) {
            result += "정상";
        } else if (value <= 20) {
            result += "약간 비만";
        } else {
            result += "비만";
        }

        return name + "님의 결과:" + result;
    }
}
