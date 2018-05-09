package com.example.idn.espresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvResult;
    public static final String EXTRA_INPUT = "extra_input";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Activity Received");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvResult = findViewById(R.id.tv_result_view);
        String input = getIntent().getStringExtra(EXTRA_INPUT);
        tvResult.setText(input);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);

    }
}
