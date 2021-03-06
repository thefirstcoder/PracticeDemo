package yifeiyuan.practice.practicedemos.touch;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import yifeiyuan.practice.practicedemos.R;

public class TouchActivity extends AppCompatActivity {

    public static String TAG = "Touch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, " TouchActivity  dispatchTouchEvent() called with: " + "ev = [" + TouchUtil.getAction(ev) + "]");
        return super.dispatchTouchEvent(ev);
//        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, " TouchActivity  onTouchEvent() called with: " + "event = [" + TouchUtil.getAction(event) + "]");
        return super.onTouchEvent(event);
    }

}
