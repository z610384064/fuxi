package com.example.administrator.fuxi.fragment;

import android.os.Bundle;
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
public class FragmentActivity4 extends AppCompatActivity implements View.OnClickListener{
    public static final  String TAG = "MainActivity";

    private Button bt_msg,bt_contacts,bt_news;
    private FragmentA fragmentA;
    private FragmentB fragmentB;
    private FragmentC fragmentC;

    private int isShow=1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);


        // 这里一定要在save为null时才加载Fragment，Fragment中onCreateView等生命周里加载根子Fragment同理
        // 因为在页面重启时，Fragment会被保存恢复，而此时再加载Fragment会重复加载，导致重叠
        if (savedInstanceState != null){
            if(getSupportFragmentManager().findFragmentByTag(FragmentA.class.getName())== null){ //去添加fragmentA
                fragmentA=FragmentA.newInstance();

                // 正常情况下去 加载根Fragment
            }else {
                fragmentA= (FragmentA) getSupportFragmentManager().findFragmentByTag(FragmentA.class.getName());
            }
            if (getSupportFragmentManager().findFragmentByTag(FragmentB.class.getName())== null){
                fragmentB=FragmentB.newInstance();
            }else {
                fragmentB= (FragmentB) getSupportFragmentManager().findFragmentByTag(FragmentB.class.getName());
            }
            if (getSupportFragmentManager().findFragmentByTag(FragmentC.class.getName())== null){
                fragmentC=FragmentC.newInstance();
            }else {
                fragmentC= (FragmentC) getSupportFragmentManager().findFragmentByTag(FragmentC.class.getName());
            }

            int code=savedInstanceState.getInt("isShow");
            if (code == 1){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentA, fragmentA.getClass().getName()).commit();
                isShow=1;
            }else if (code == 2){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentB, fragmentB.getClass().getName()).commit();
                isShow=2;
            }else if (code ==3){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentC, fragmentC.getClass().getName()).commit();
                isShow=3;
            }

        }else {
            fragmentA=FragmentA.newInstance();
            fragmentB=FragmentB.newInstance();
            fragmentC=FragmentC.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentA, fragmentA.getClass().getName()).commit();
            isShow=1;
        }


        bt_msg =  findViewById(R.id.bt_msg);
        bt_contacts =  findViewById(R.id.bt_contacts);
        bt_news =  findViewById(R.id.bt_news);
        bt_msg.setOnClickListener(this);
        bt_contacts.setOnClickListener(this);
        bt_news.setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("isShow",isShow);
    }

    private void ShowFragmentA(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragmentA, fragmentA.getClass().getName());
        transaction.commit();
        isShow=1;
    }

    private void ShowFragmentB(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container, fragmentB, fragmentB.getClass().getName());
        transaction.commit();
        isShow=2;
    }

    private void ShowFragmentC(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragmentC, fragmentC.getClass().getName());
        transaction.commit();
        isShow=3;
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
