package com.example.administrator.fuxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fuxi.flag.Main4Activity;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

/**
 * activity自身是singleTask,可以用来测singleTask得效果
 * Main2Activity是一个透明样式的activity,用来测试a启动一个透明activity所走的生命周期
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"MainActivity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Main3Activity.class));
                    Intent i=new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(i);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.e(TAG,"MainActivity onNewIntent");
        super.onNewIntent(intent);
    }
    @Override
    protected void onRestart() {
        Log.e(TAG,"MainActivity onRestart");
        super.onRestart();
    }
    @Override
    protected void onStart() {
        Log.e(TAG,"MainActivity onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG,"MainActivity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG,"MainActivity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG,"MainActivity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"MainActivity onDestroy");
        super.onDestroy();
    }
}
