package com.example.ActivityComunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        textView = (TextView) findViewById(R.id.textView2);
        Intent i = getIntent();
        textView.setText("在另一个Activity中输入了：" + i.getStringExtra("data"));
    }
}
