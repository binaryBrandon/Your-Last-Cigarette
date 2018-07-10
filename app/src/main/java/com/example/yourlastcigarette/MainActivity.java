package com.example.yourlastcigarette;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView daysSmoked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        daysSmoked = (TextView) findViewById(R.id.daysSmoked);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (month + 1) + "/" + dayOfMonth + "/" + year;
                daysSmoked.setText(date);
            }
        });
    }

    /*public void addCig(View view){
        Date timeObj = Calendar.getInstance().getTime();
        long currentTime = timeObj.getTime();
        TextView updateMostRecent = (TextView) findViewById(R.id.mostRecentEntry);

        updateMostRecent.setText("" + currentTime);
    }*/
}


/*this is me adding some data just so I can sync to github
it worked!
 */