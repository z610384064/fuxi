package com.example.administrator.fuxi.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fuxi.R;

/**
 * 用来测试add,replace方法的区别,还有旋转后出现的各种问题
 */
public class FragmentActivity2 extends AppCompatActivity implements View.OnClickListener{
    public static final  String TAG = "MainActivity";
    public static final String KEY_MSG_FRAGMENT = "msg_fragment";
    public static final String KEY_CONTACTS_FRAGMENT = "contacts_fragment";
    public static final String KEY_NEWS_FRAGMENT = "news_fragment";



    private Button bt_msg,bt_contacts,bt_news;
    private MyFragment2 fg_msg,fg_contacts,fg_news;
    //FragmentTransaction transaction;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);

        bt_msg = (Button) findViewById(R.id.bt_msg);
        bt_contacts = (Button) findViewById(R.id.bt_contacts);
        bt_news = (Button) findViewById(R.id.bt_news);
        bt_msg.setOnClickListener(this);
        bt_contacts.setOnClickListener(this);
        bt_news.setOnClickListener(this);
        ShowMsgFragment();
    }


    private void ShowMsgFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

//        if(fg_msg == null){
//            fg_msg = MyFragment2.newInstance("msg");
//            transaction.add(R.id.fragment_container,fg_msg);
//        }
//        hideAllFragement();
//        transaction.show(fg_msg);

        Log.d(TAG,"ShowMsgFragment ,fg_contacts is null");
        if(fg_msg == null){
            fg_msg = MyFragment2.newInstance("msg");
         }
        transaction.replace(R.id.fragment_container,fg_msg);
        Log.d(TAG,"ShowMsgFragment ,fg_contacts is null");

        transaction.commit();

    }

    private void ShowContactsFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

//        if(fg_contacts == null){
//            fg_contacts = MyFragment2.newInstance("Contacts");
//            transaction.add(R.id.fragment_container,fg_contacts);
//        }
//        hideAllFragement();
//        transaction.show(fg_contacts);

        if(fg_contacts == null){
            Log.d(TAG,"ShowContactsFragment ,fg_contacts is null");
            fg_contacts = MyFragment2.newInstance("Contacts");
        }
        transaction.replace(R.id.fragment_container,fg_contacts);
        Log.d(TAG,"ShowContactsFragment ,fg_contacts is not null");

        transaction.commit();

    }

    private void ShowNewsFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

//        if(fg_news == null){
//            fg_news = MyFragment2.newInstance("news");
//            transaction.add(R.id.fragment_container,fg_news);
//        }
//        hideAllFragement();
//        transaction.show(fg_news);

        if(fg_news == null){
            Log.d(TAG,"ShowNewsFragment ,fg_contacts is null");
            fg_news = MyFragment2.newInstance("news");
        }
        transaction.replace(R.id.fragment_container,fg_news);
        Log.d(TAG,"ShowNewsFragment ,fg_contacts is  not null");


        transaction.commit();

    }

    public void hideAllFragement(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if(fg_msg != null){
            transaction.hide(fg_msg);
        }
        if(fg_contacts != null){
            transaction.hide(fg_contacts);
        }
        if(fg_news != null){
            transaction.hide(fg_news);
        }

        transaction.commit();

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_msg:
                Log.d(TAG,"try call ShowMsgFragment");
                ShowMsgFragment();
                break;
            case R.id.bt_contacts:
                Log.d(TAG,"try call ShowContactsFragment");
                ShowContactsFragment();
                break;
            case R.id.bt_news:
                Log.d(TAG,"try call ShowNewsFragment");
                ShowNewsFragment();
                break;
            default:
                break;
        }
    }

}
