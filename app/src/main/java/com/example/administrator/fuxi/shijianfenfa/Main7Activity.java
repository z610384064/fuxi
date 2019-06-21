package com.example.administrator.fuxi.shijianfenfa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.fuxi.R;

public class Main7Activity extends AppCompatActivity {
    private LinearLayoutSubclass lin;


    private Button btn;
    private String TAG="Main7Activity";


    private RelativeLayoutSubclass re;
    private boolean re_isclick=false;
    private boolean re_isenable=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        lin=findViewById(R.id.lin);
        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"lin的onClick()");
                Toast.makeText(Main7Activity.this,"lin的onClick()",Toast.LENGTH_SHORT).show();
            }
        });

        re=findViewById(R.id.re);
        re_isclick=re.isClickable();
        re_isenable=re.isEnabled();
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"re的onClick()");
                Toast.makeText(Main7Activity.this,"re的onClick()",Toast.LENGTH_SHORT).show();
            }
        });
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"btn的onClick()");
                Toast.makeText(Main7Activity.this,"btn的onClick()",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.e(TAG,"---> Activity中调用dispatchTouchEvent()--->ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:

                Log.e(TAG,"---> Activity中调用dispatchTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:

                Log.e(TAG,"---> Activity中调用dispatchTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"---> Activity 中调用onTouchEvent()--->ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> Activity 中调用onTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> Activity 中调用onTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
