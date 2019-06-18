package com.example.administrator.fuxi.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.administrator.fuxi.R;

public class FragmentActivity extends AppCompatActivity {
    private static final String TAG ="FragmentActivity";
    private FrameLayout frag;
    private Button btn;
    private MyFragment myFragment=new MyFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        myFragment=new MyFragment();
        Log.e(TAG,"FragmentActivity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        btn=findViewById(R.id.btn);
        frag=findViewById(R.id.frag);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frag, myFragment);
        transaction.commit();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.e(TAG,"FragmentActivity onNewIntent");
        super.onNewIntent(intent);
    }
    @Override
    protected void onRestart() {
        Log.e(TAG,"FragmentActivity onRestart");
        super.onRestart();
    }
    @Override
    protected void onStart() {
        Log.e(TAG,"FragmentActivity onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG,"FragmentActivity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG,"FragmentActivity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG,"FragmentActivity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"FragmentActivity onDestroy");
        super.onDestroy();
    }
}
