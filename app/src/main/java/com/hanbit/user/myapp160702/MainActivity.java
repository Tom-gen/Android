package com.hanbit.user.myapp160702;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btCalc, btCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button) findViewById(R.id.btCalc);
        btCalendar = (Button) findViewById(R.id.btCalendar);
        btCalc.setOnClickListener(this);
        btCalendar.setOnClickListener(this);
    }

//    public void onClickOpenCalc(View view) {
////        setContentView(R.layout.activity_calc);
//        Intent intent = new Intent(getApplicationContext(),CalcActivity.class);
//        startActivity(intent);
//    }
//
//    public void onClickOpenCalendar(View view){
////        setContentView(R.layout.activity_calendar);
//        Intent intent = new Intent(getApplicationContext(),CalendarActivity.class);
//        startActivity(intent);
//    }

    @Override
    public void onClick(View v) {
//        Intent intent=null;
//        if(v.equals(btCalendar)) {
//            intent = new Intent(getApplicationContext(), CalendarActivity.class);
//        }
//        if(v.equals(btCalc)) {
//            intent = new Intent(getApplicationContext(), CalcActivity.class);
//        }
//        if(intent!=null)
//            startActivity(intent);
        switch (v.getId()) {
            case R.id.btCalc:
                this.startActivity(new Intent(this, CalcActivity.class));
                break;
            case R.id.btCalendar:
                this.startActivity(new Intent(this, CalendarActivity.class));
                break;
        }
    }
}
