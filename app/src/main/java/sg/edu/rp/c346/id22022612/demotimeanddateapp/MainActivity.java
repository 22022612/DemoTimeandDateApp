package sg.edu.rp.c346.id22022612.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.dp);

        tp = findViewById(R.id.tp);

        btnDisplayDate = findViewById(R.id.btnDisplayDate);

        btnDisplayTime = findViewById(R.id.btnDisplayTime);

        tvDisplay = findViewById(R.id.tvDisplay);

        btnReset =findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnDisplayTime = "Time is " + tp.getHour() + ":" + tp.getMinute();
                tvDisplay.setText(btnDisplayTime);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int year = dp.getYear();
//                int month =dp.getMonth();
//                int day = dp.getDayOfMonth();
//                dp.updateDate(year,month,day);
                String btnDisplayDate = "Date is " + dp.getDayOfMonth() +"/" + dp.getMonth() + "/" + dp.getYear();
                tvDisplay.setText(btnDisplayDate);


            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = 2020;
                int month = 1;
                int day = 01;
                dp.updateDate(year,month,day);
                tp.setHour(0);
                tp.setMinute(0);
            }
        });

    }
}
