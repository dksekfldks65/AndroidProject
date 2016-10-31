package org.androidtown.quickcoding1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        tv = (TextView)findViewById(R.id.textView3);
    }

    public class MyValues
    {

        int [] num = {1,5,9,23,22,10,5,6,7,30};

        double GetResult()
        {
            return 0;
        }
    }

    public class Myminimum extends MyValues
    {
        int minimum=num[0];

        double GetResult()
        {
            for(int i=1;i<10;i++)
            {
                if(minimum>num[i])
                    minimum = num[i];
            }

            return minimum;
        }
    }

    public class MyAverage extends MyValues
    {
        double avg=0;

        double GetResult()
        {
            for(int i=0;i<10;i++)
            {
                avg+=num[i];
            }

            avg/=10;
            return avg;
        }
    }

    public void onclick1(View v) {

        Myminimum mini = new Myminimum();
        double minimum = mini.GetResult();
        tv.setText("The Results: "+Double.toString(minimum));
    }

    public void onclick2(View v) {

        MyAverage avg = new MyAverage();
        double average= avg.GetResult();
        tv.setText("The Results: "+Double.toString(average));
    }

}
