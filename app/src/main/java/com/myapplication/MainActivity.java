package com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapplication.epoxy.EpoxyActivity;
import com.myapplication.multitype.MultiTypeActivity;
import com.myapplication.vlayout.VLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Button vlayout;
    private Button multitype;
    private Button epoxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vlayout = (Button) findViewById(R.id.vlayout);
        multitype = (Button) findViewById(R.id.multitype);
        epoxy = (Button) findViewById(R.id.epoxy);

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
        epoxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EpoxyActivity.class));
            }
        });
    }
}
