package com.hanbit.user.myapp160702;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.user.myapp160702.calc.CalcActivity;
import com.hanbit.user.myapp160702.kaup.KaupActivity;
import com.hanbit.user.myapp160702.member.JoinActivity;
import com.hanbit.user.myapp160702.member.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btCalc, btCalendar, btImageView, btConnectWeb, btKaup, btJoin, btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc = (Button) findViewById(R.id.btCalc);
        btCalendar = (Button) findViewById(R.id.btCalendar);
        btImageView = (Button) findViewById(R.id.btImageView);
        btCalc.setOnClickListener(this);
        btCalendar.setOnClickListener(this);
        btImageView.setOnClickListener(this);

        btConnectWeb = (Button) findViewById(R.id.btConnectWeb);
        btConnectWeb.setOnClickListener(this);
        btKaup = (Button) findViewById(R.id.btKaup);
        btKaup.setOnClickListener(this);
        btJoin = (Button) findViewById(R.id.btJoin);
        btJoin.setOnClickListener(this);
        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
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
            case R.id.btImageView:
                this.startActivity(new Intent(this, ImageActivity.class));
                break;
            case R.id.btConnectWeb:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
                break;
            case R.id.btKaup:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btJoin:
                startActivity(new Intent(this, JoinActivity.class));
                break;
            case R.id.btLogin:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
