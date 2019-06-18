package com.example.administrator.fuxi.fragment;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fuxi.R;

/**
 * add  show hide用findFragmentByTag 解决重叠问题
 */
public class FragmentActivity3 extends AppCompatActivity implements View.OnClickListener{
    public static final  String TAG = "MainActivity";

    private Button bt_msg,bt_contacts,bt_news;
    private FragmentA fragmentA;
    private FragmentB fragmentB;
    private FragmentC fragmentC;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);


        if (savedInstanceState != null) {  // “内存重启”时调用
            fragmentA = (FragmentA) getSupportFragmentManager().findFragmentByTag(FragmentA.class.getName());
            fragmentB = (FragmentB) getSupportFragmentManager().findFragmentByTag(FragmentB.class.getName());
            fragmentC = (FragmentC) getSupportFragmentManager().findFragmentByTag(FragmentC.class.getName());
           if (!fragmentC.isHidden()){//当前旋转屏幕的时候 c是显示着的
               getSupportFragmentManager().beginTransaction()
                       .show(fragmentC)
                       .hide(fragmentB)
                       .hide(fragmentA)
                       .commit();
           }else if (!fragmentA.isHidden()){
               getSupportFragmentManager().beginTransaction()
                       .show(fragmentA)
                       .hide(fragmentB)
                       .hide(fragmentC)
                       .commit();
           }else if (!fragmentB.isHidden()){
               getSupportFragmentManager().beginTransaction()
                       .show(fragmentB)
                       .hide(fragmentA)
                       .hide(fragmentC)
                       .commit();
           }

        }else{  // 正常时
            fragmentA = FragmentA.newInstance();
            fragmentB = FragmentB.newInstance();
            fragmentC=FragmentC.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragmentA, fragmentA.getClass().getName())
                    .add(R.id.fragment_container,fragmentB,fragmentB.getClass().getName())
                    .add(R.id.fragment_container,fragmentC,fragmentC.getClass().getName())
                    .hide(fragmentB)
                    .hide(fragmentC)
                    .commit();
        }

        bt_msg = (Button) findViewById(R.id.bt_msg);
        bt_contacts = (Button) findViewById(R.id.bt_contacts);
        bt_news = (Button) findViewById(R.id.bt_news);
        bt_msg.setOnClickListener(this);
        bt_contacts.setOnClickListener(this);
        bt_news.setOnClickListener(this);

    }



    private void ShowFragmentA(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragement();
        transaction.show(fragmentA);
        transaction.commit();

    }

    private void ShowFragmentB(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragement();
        transaction.show(fragmentB);
        transaction.commit();

    }

    private void ShowFragmentC(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragement();
        transaction.show(fragmentC);
        transaction.commit();
    }

    public void hideAllFragement(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(fragmentA);
        transaction.hide(fragmentB);
        transaction.hide(fragmentC);
        transaction.commit();
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_msg:
                Log.d(TAG,"try call ShowMsgFragment");
             ShowFragmentA();
                break;
            case R.id.bt_contacts:
                Log.d(TAG,"try call ShowContactsFragment");
                ShowFragmentB();
                break;
            case R.id.bt_news:
                Log.d(TAG,"try call ShowNewsFragment");
                ShowFragmentC();
                break;
            default:
                break;
        }
    }

}
