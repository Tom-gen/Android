package com.hanbit.user.myapp160702.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class CalcActivity extends Activity implements View.OnClickListener {
    EditText et1, et2;
    Button btPlus, btMinus, btMulti, btDivide;
    TextView tvResult;
    Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDivide = (Button) findViewById(R.id.btDivide);
        et1 = (EditText) findViewById(R.id.num1);
        et2 = (EditText) findViewById(R.id.num2);
        tvResult = (TextView) findViewById(R.id.result);

        btHome = (Button) findViewById(R.id.btHome);
        btHome.setOnClickListener(this);
    }

    public void OnClick(View view) {
        //self code
//        EditText et_num1 = (EditText) findViewById(R.id.num1);
//        EditText et_num2 = (EditText) findViewById(R.id.num2);
//        TextView tv_result = (TextView) findViewById(R.id.result);
//        double value = 0;
//        double num1=0, num2=0;
//        num1 = Double.parseDouble(et_num1.getText().toString());
//        num2 = Double.parseDouble(et_num2.getText().toString());
//        if(view.equals(findViewById(R.id.btPlus))) {
//            value = num1 + num2;
//        }
//        if(view.equals(findViewById(R.id.btMinus))) {
//            value = num1 - num2;
//        }
//        if(view.equals(findViewById(R.id.btMulti))) {
//            value = num1 * num2;
//        }
//        if(view.equals(findViewById(R.id.btDivide))) {
//            if(num2!=(double)0)
//                value = num1 / num2;
//        }
//
//        tv_result.setText(Double.toString(value));

        double value = 0, num1 = 0, num2 = 0;
        try {
            num1 = Double.parseDouble(et1.getText().toString());
            num2 = Double.parseDouble(et2.getText().toString());
        } catch (NumberFormatException ex) {
            return;
        }

        CalcService service = new CalcServiceImpt();
        switch (view.getId()) {
            case R.id.btPlus:
//                value = num1 + num2;
                value = service.plus(num1, num2);
                break;
            case R.id.btMinus:
//                value = num1 - num2;
                value = service.minus(num1, num2);
                break;
            case R.id.btMulti:
//                value = num1 * num2;
                value = service.multiply(num1, num2);
                break;
            case R.id.btDivide:
//                if (num2 != 0)
//                    value = num1 / num2;
                value = service.divide(num1, num2);
                break;
            default:
                break;
        }
        tvResult.setText("계산결과:" + value);

//        if (view.equals(btPlus)) {
//            value = num1 + num2;
//        }
//        if (view.equals(btMinus)) {
//            value = num1 - num2;
//        }
//        if (view.equals(btMulti)) {
//            value = num1 * num2;
//        }
//        if (view.equals(btDivide)) {
//            if (num2 != 0)
//                value = num1 / num2;
//        }
//        tvResult.setText(Double.toString(value));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btHome)
            startActivity(new Intent(this, MainActivity.class));
    }
}
