package com.example.idn.espresso;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtTxt;
    private Button btnChangeTxt, btnIntent;
    private TextView tvCetak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxt = findViewById(R.id.edt_text);
        btnChangeTxt = findViewById(R.id.btn_change_text);
        btnIntent = findViewById(R.id.btn_swicth_activity);
        tvCetak = findViewById(R.id.tv_cetak);

        btnChangeTxt.setOnClickListener(this);
        btnIntent.setOnClickListener(this);

    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_change_text:
                edtTxt.setText("Hallo");
                String inputan = edtTxt.getText().toString().trim();
                tvCetak.setText(inputan);
                break;

            case R.id.btn_swicth_activity:
                String text = edtTxt.getText().toString().trim();
                Intent i = new Intent(this, Main2Activity.class);
                i.putExtra(Main2Activity.EXTRA_INPUT, text);
                startActivity(i);
                break;

        }
    }
}
