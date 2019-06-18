package com.example.administrator.fuxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private static final String TAG ="Main3Activity";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"Main3Activity onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
//        btn=findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Main3Activity.this,MainActivity.class));
//            }
//        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.e(TAG,"Main3Activity onNewIntent");
        super.onNewIntent(intent);
    }
    @Override
    protected void onRestart() {
        Log.e(TAG,"Main3Activity onRestart");
        super.onRestart();
    }
    @Override
    protected void onStart() {
        Log.e(TAG,"Main3Activity onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG,"Main3Activity onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG,"Main3Activity onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG,"Main3Activity onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"Main3Activity onDestroy");
        super.onDestroy();
    }
}
