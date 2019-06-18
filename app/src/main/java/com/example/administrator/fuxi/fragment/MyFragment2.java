package com.example.administrator.fuxi.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.fuxi.R;

/**
 * fragment横竖屏切换导致重叠
 */
public class MyFragment2 extends Fragment {
    private String mText;
    private TextView mTextview;

    public static MyFragment2  newInstance(String text){
        MyFragment2 fg = new MyFragment2();
        Bundle agrs = new Bundle();
        agrs.putString("text",text);
        fg.setArguments(agrs);
        return fg;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            mText = getArguments().getString("text");
        }
    }

    //    @SuppressLint("ValidFragment")
//    public TestFragment(String fName){
//        this.mText = fName;
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.myfragment2,container,false);
        mTextview = (TextView)view.findViewById(R.id.fragment_text);
        mTextview.setText(mText);
        mTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextview.setText("changed_"+mText);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
