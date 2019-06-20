package com.example.administrator.fuxi.shijianfenfa;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class LinearLayoutSubclass extends LinearLayout {
    private static final String TAG ="LinearLayoutSubclass" ;

    public LinearLayoutSubclass(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.e(TAG,"---> LinearLayoutSubclass中调用dispatchTouchEvent()--->ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> LinearLayoutSubclass中调用dispatchTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> LinearLayoutSubclass中调用dispatchTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onTouchEvent()--->ACTION_DOWN");

                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> LinearLayoutSubclass中调用onTouchEvent()--->ACTION_UP");
            default:
                break;
        }
//        return true;
        return super.onTouchEvent(ev);
    }
}
