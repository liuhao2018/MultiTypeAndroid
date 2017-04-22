package com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapplication.flexbox.FlexBoxActivity;
import com.myapplication.multitype.MultiTypeActivity;
import com.myapplication.vlayout.VLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Button vlayout;
    private Button multitype;
    private Button flexbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vlayout = (Button) findViewById(R.id.vlayout);
        multitype = (Button) findViewById(R.id.multitype);
        flexbox = (Button) findViewById(R.id.flexbox);

        vlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VLayoutActivity.class));
            }
        });
        multitype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MultiTypeActivity.class));
            }
        });
        flexbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlexBoxActivity.class));
            }
        });
    }
}
