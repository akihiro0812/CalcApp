package jp.techacademy.akihiro.ogawa.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double value1 = intent.getDoubleExtra("VALUE1", 0);
        Double value2 = intent.getDoubleExtra("VALUE2", 0);
        int value3 = intent.getIntExtra("VALUE3", 0);

        if (value3 == 1 ){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 + value2));
        }

        else if (value3 == 2 ){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 - value2));
        }

        else if (value3 == 3 ){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 * value2));
        }

        else if (value3 == 4 ){
            if (value1 == 0 || value2 ==0 ){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("エラーです。０以外の数字を入力してください。");
            }
            else {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(String.valueOf(value1 / value2));
            }
        }

        else {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("エラーです。数字を入力してください。");
        }

    }
}

