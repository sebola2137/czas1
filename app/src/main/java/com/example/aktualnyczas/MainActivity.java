package com.example.aktualnyczas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_date = findViewById(R.id.date);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                tv_date.setText(Calendar.getInstance().getTime().toString());
                handler.postDelayed(this, 1000);
            }
        }, 1000);
    }
}
