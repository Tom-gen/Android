package com.hanbit.user.myapp160702.kaup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.user.myapp160702.MainActivity;
import com.hanbit.user.myapp160702.R;

public class KaupActivity extends Activity implements View.OnClickListener {

    Button btResult, btHome;
    EditText etName, etHeight, etWeight;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);
        btResult = (Button) findViewById(R.id.btResult);
        btHome = (Button) findViewById(R.id.btHome);
        etName = (EditText) findViewById(R.id.etName);
        etHeight = (EditText) findViewById(R.id.etHeight);
        etWeight = (EditText) findViewById(R.id.etWeight);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btResult.setOnClickListener(this);
        btHome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        KaupService service = new KaupServiceImpt();
        KaupBean bean = new KaupBean();
        switch (v.getId()) {
            case R.id.btResult:
//                String name = etName.getText().toString();
//                double height = Double.parseDouble(etHeight.getText().toString());
//                double weight = Double.parseDouble(etWeight.getText().toString());
                bean.setName(etName.getText().toString());
                bean.setHeight(Double.parseDouble(etHeight.getText().toString()));
                bean.setWeight(Double.parseDouble(etWeight.getText().toString()));
                String result = service.execute(bean);//service.execute(height, weight);

                tvResult.setText(result);
                break;
            case R.id.btHome:
                startActivity(new Intent(this, MainActivity.class));
                break;
            default:
                break;
        }
    }
}
