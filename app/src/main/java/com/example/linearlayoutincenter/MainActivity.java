package com.example.linearlayoutincenter;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private LinearLayout dotLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        dotLayout = (LinearLayout) findViewById(R.id.ll_dot);
        dotLayout.removeAllViews();


        int lenght = 1;
        for (int i = 0; i < lenght; i++) {
            ImageView imageViewDot = new ImageView(context);
            imageViewDot.setBackgroundResource(R.mipmap.ic_launcher);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.leftMargin = 4;
            params.rightMargin = 4;
            dotLayout.addView(imageViewDot, params);
        }


        new Handler().postDelayed(new Runnable() {
            public void run() {
                //execute the task
                addListView();
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                //execute the task
                addListView();
            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                //execute the task
                addListView();
            }
        }, 3000);


    }

    private void addListView() {
        int lenght = 1;
        for (int i = 0; i < lenght; i++) {
            ImageView imageViewDot = new ImageView(context);
            imageViewDot.setBackgroundResource(R.mipmap.ic_launcher);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.leftMargin = 4;
            params.rightMargin = 4;
            dotLayout.addView(imageViewDot, params);
        }
    }
}
