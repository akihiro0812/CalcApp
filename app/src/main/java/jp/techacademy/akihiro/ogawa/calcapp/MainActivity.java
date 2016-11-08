package jp.techacademy.akihiro.ogawa.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1, mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        String text1 = mEditText1.getText().toString();
        String text2 = mEditText2.getText().toString();
        // mEditText1のテキストを取得
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        try {
            value1 = Integer.parseInt(text1);        //ここでNmberFormatExceptionが投げられる可能性がある
            value2 = Integer.parseInt(text2);
            // String → intへ変換
            switch (v.getId()) {              //押されたボタン判定
                case R.id.button1:
                    value3 = 1;
                    break;
                case R.id.button2:
                    value3 = 2;
                    break;
                case R.id.button3:
                    value3 = 3;
                    break;
                case R.id.button4:
                    value3 = 4;
                    break;
            }
        } catch (NumberFormatException e) {
            //NumberFormatExceptionが投げられたらここで捕まえる
            //e には例外の情報が入っている。(eは変数なのでeという名前である必要はない。)
            value3 = 0;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", value1);
        intent.putExtra("VALUE2", value2);
        intent.putExtra("VALUE3", value3);
        startActivity(intent);

    }
}