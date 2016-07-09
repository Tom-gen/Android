package com.hanbit.user.myapp160702.member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class JoinActivity extends Activity implements View.OnClickListener {

    EditText etID, etPW, etName, etEmail;
    Button btSend, btHome;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        etID = (EditText) findViewById(R.id.etID);
        etPW = (EditText) findViewById(R.id.etPW);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        btSend = (Button) findViewById(R.id.btSend);
        btHome = (Button) findViewById(R.id.btHome);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btSend.setOnClickListener(this);
        btHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btSend:
                MemberService service = new MemberServiceImpl();
                MemberBean bean = new MemberBean();
                bean.setID(etID.getText().toString());
                bean.setPW(etPW.getText().toString());
                bean.setName(etName.getText().toString());
                bean.setEmail(etEmail.getText().toString());

                String result = service.join(bean);

                tvResult.setText(result);
                break;
            case R.id.btHome:
                startActivity(new Intent(this, MainActivity.class));
                break;

        }
    }
}
