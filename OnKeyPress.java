package com.demo.admin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class OnKeyPress extends AppCompatActivity {

   // private static final String TAG = "SampleClick";
    TextView actionLabel;

    int counter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypress);
        actionLabel = (TextView) findViewById(R.id.action);
      /*  Button click_me=(Button) findViewById(R.id.click_me);
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
        });*/
    }



    @Override
    // catches the onKeyDown button event
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                actionLabel.setText("KEYCODE_BACK key pressed");
                Toast.makeText(this, "Press again back for exit", Toast.LENGTH_SHORT).show();

                counter++;

                if (counter > 1) {
                    super.onBackPressed();
                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                actionLabel.setText("VOLUME_UP key pressed");
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                actionLabel.setText("VOLUME_DOWN key pressed");
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    // catches the onKeyUp button event
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                actionLabel.setText("KEYCODE_BACK key released");
                return true;
            case KeyEvent.KEYCODE_VOLUME_UP:
                actionLabel.setText("VOLUME_UP key released");
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                actionLabel.setText("VOLUME_DOWN key released");
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    // works for API level 5 and lower
    @Override
    public void onBackPressed() {
        actionLabel.setText("BACK key pressed");
        super.onBackPressed();
    }


    // catches the long press button event (longer than 2 seconds)
    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Toast.makeText(this, "Pressed for a long time", Toast.LENGTH_SHORT).show();
        return true;
    }

    // catches the on touch event on screen and shows the specific pixels
    // touched
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        actionLabel.setText("Touch press on x: " + x + " y: " + y);
        return true;
    }
}
