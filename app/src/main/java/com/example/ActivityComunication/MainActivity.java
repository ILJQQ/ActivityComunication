package com.example.ActivityComunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    申明变量用来传递输入框内容
    private EditText editText;

    /*重写onCreate方法实现按键后的开启新activity和存储数据功能*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        将输入内容赋值给已申明的变量
        editText = (EditText) findViewById(R.id.editText);

//        重写onClick
        findViewById(R.id.sendTo).setOnClickListener(new View.OnClickListener() {
            @Override

//            跳转到新的activity并将内容通过intent传送
            public void onClick(View v) {
//              申明一个Intent
                Intent i = new Intent();
//              将editText输入内容赋值给intent
                i.putExtra("data", editText.getText().toString());
//              打开并跳转到新的activity
                i.setClass(MainActivity.this, NextActivity.class);
                startActivity(i);
            }
        });
    }
}
