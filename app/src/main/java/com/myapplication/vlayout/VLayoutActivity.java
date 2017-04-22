package com.myapplication.vlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.myapplication.R;

public class VLayoutActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlayout);

        recyclerView = (RecyclerView) findViewById(R.id.list);

        VirtualLayoutManager manager = new VirtualLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DelegateAdapter delegateAdapter = new DelegateAdapter(manager);

        recyclerView.setAdapter(delegateAdapter);

        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0,10);
        recyclerView.setRecycledViewPool(recycledViewPool);

        delegateAdapter.addAdapter(new VAdapter1(this));

        delegateAdapter.addAdapter(new VAdapter2(this));
        delegateAdapter.addAdapter(new VAdapter3(this));
        delegateAdapter.addAdapter(new VAdapter4(this));
        delegateAdapter.addAdapter(new VAdapter5(this));
        delegateAdapter.addAdapter(new VAdapter6(this));

        delegateAdapter.notifyDataSetChanged();
    }
}
