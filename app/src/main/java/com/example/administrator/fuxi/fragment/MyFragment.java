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

import com.example.administrator.fuxi.R;

/**
 * fragment生命周期
 */
public class MyFragment extends Fragment {
    private static final String TAG = "MyFragment";

    @Override
    public void onAttach(Context context) {
        Log.e(TAG,"MyFragment onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"MyFragment onCreate");
        super.onCreate(savedInstanceState);
    }
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG,"MyFragment onCreateView");
        view=View.inflate(getContext(), R.layout.myfragment,null);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG,"MyFragment onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG,"MyFragment onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG,"MyFragment onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG,"MyFragment onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG,"MyFragment onStop");
        super.onStop();
    }
    @Override
    public void onDestroyView() {
        Log.e(TAG,"MyFragment onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG,"MyFragment onDestroy");
        super.onDestroy();
    }



    @Override
    public void onDetach() {
        Log.e(TAG,"MyFragment onDetach");
        super.onDetach();
    }
}
