package com.androiddeveloper.ircontrolwaterheater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean hasIrEmitter = IRUtil.init(this);
        if (!hasIrEmitter) {
            startActivity(new Intent(this, NoIrActivity.class));
        }
        initViews();
        setClickListener();

    }

    private void initViews() {
        btn_open = findViewById(R.id.btn_open);
    }

    private void setClickListener() {
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}