package com.demo.admin.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class SampleClick extends AppCompatActivity{
    private static final String TAG = "SampleClick";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_click);
        Button click_me=(Button) findViewById(R.id.click_me);
        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: User Clicked the button!!");
            }
        });
        click_me.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.i(TAG, "onLongClick: User LongClicked the button!!");
                return true;
            }
        });


        if(true){
            RadioButton selectedRadioButtonID = (RadioButton) findViewById(R.id.good);
            String selectedRadioButtonText = selectedRadioButtonID.getText().toString();
            Log.i(TAG, "onClick: Clicked " + selectedRadioButtonText);
             }
        else
            {
            RadioButton selectedRadioButtonID1 = (RadioButton) findViewById(R.id.not);
            String selectedRadioButtonText1 = selectedRadioButtonID1.getText().toString();
            Log.i(TAG, "onClick: Clicked " + selectedRadioButtonText1);
        }
    }
}
