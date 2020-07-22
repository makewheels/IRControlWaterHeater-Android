package com.androiddeveloper.ircontrolwaterheater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.androiddeveloper.ircontrolwaterheater.ir.IRUtil;

public class MainActivity extends AppCompatActivity {
    private TextView tv_state;
    private Button btn_on;
    private Button btn_off;
    private Button btn_heat;

    private int REQUEST_CODE_HEAT_TIME = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initIR();
        initViews();
        setClickListener();

    }

    private void initIR() {
        boolean hasIrEmitter = IRUtil.init(this);
        if (!hasIrEmitter) {
            startActivity(new Intent(this, NoIrActivity.class));
            finish();
        }
    }

    private void initViews() {
        tv_state = findViewById(R.id.tv_state);
        btn_on = findViewById(R.id.btn_on);
        btn_off = findViewById(R.id.btn_off);
        btn_heat = findViewById(R.id.btn_heat);
    }

    private void setClickListener() {
        btn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRUtil.send_ON();
            }
        });
        btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IRUtil.send_OFF();
            }
        });
        btn_heat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseHeatTimeActivity.class);
                startActivityForResult(intent, REQUEST_CODE_HEAT_TIME);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_HEAT_TIME) {
            int heatTime = 0;
            if (data != null) {
                heatTime = data.getIntExtra("heatTime", 0);
            }
            if (heatTime == 10) {
                IRUtil.send_HEAT_10_MIN();
            } else if (heatTime == 20) {
                IRUtil.send_HEAT_20_MIN();
            } else if (heatTime == 30) {
                IRUtil.send_HEAT_30_MIN();
            } else if (heatTime == 40) {
                IRUtil.send_HEAT_40_MIN();
            } else if (heatTime == 50) {
                IRUtil.send_HEAT_50_MIN();
            } else if (heatTime == 60) {
                IRUtil.send_HEAT_60_MIN();
            }
        }
    }
}