package com.example.administrator.fuxi.flag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fuxi.MainActivity;
import com.example.administrator.fuxi.R;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

public class Main6Activity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           
                Intent i=new Intent(Main6Activity.this, Main4Activity.class);
                i.setFlags(FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
    }
}
