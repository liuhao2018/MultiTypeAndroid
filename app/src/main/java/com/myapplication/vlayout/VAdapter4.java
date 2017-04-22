package com.myapplication.vlayout;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.myapplication.R;

/**
 * Created by liuhao on 2017/4/4.
 */

public class VAdapter4 extends DelegateAdapter.Adapter<VAdapter4.VHolder> {

    private Context context;
    private String[] data = {"悠享下午茶","19.9元套餐区","超值折扣菜","领券中心", "口味排行榜"};

    public VAdapter4(Context context){
        this.context = context;
    }


    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return new SingleLayoutHelper();
    }

    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_scroll,null);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(VHolder holder, int position) {
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(manager);
        holder.recyclerView.setAdapter(new RecyclerAdapter(context));
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class VHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public VHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.list);
        }
    }
}
