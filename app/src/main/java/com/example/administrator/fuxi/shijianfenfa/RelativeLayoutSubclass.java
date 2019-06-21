package com.example.administrator.fuxi.shijianfenfa;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class RelativeLayoutSubclass extends RelativeLayout {
    private static final String TAG ="RelativeLayoutSubclass" ;

    public RelativeLayoutSubclass(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        return true;

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.e(TAG,"---> RelativeLayoutSubclass中调用dispatchTouchEvent()--->ACTION_DOWN");
                return  false;
//                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用dispatchTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用dispatchTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_DOWN");
//                return true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onInterceptTouchEvent()--->ACTION_UP");
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onTouchEvent()--->ACTION_DOWN");
//                return  true;
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onTouchEvent()--->ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG,"---> RelativeLayoutSubclass中调用onTouchEvent()--->ACTION_UP");
            default:
                break;
        }

        return super.onTouchEvent(ev);
    }
}
