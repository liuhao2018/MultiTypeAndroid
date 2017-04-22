package com.myapplication.vlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.OnePlusNLayoutHelperEx;
import com.myapplication.R;

/**
 * Created by liuhao on 2017/4/4.
 */

public class VAdapter3 extends DelegateAdapter.Adapter<VAdapter3.VHolder> {

    private Context context;
    private String[] data = {"悠享下午茶","19.9元套餐区","超值折扣菜","领券中心", "口味排行榜"};

    public VAdapter3(Context context){
        this.context = context;
    }


    @Override
    public LayoutHelper onCreateLayoutHelper() {
        OnePlusNLayoutHelperEx onePlusNLayoutHelperEx = new OnePlusNLayoutHelperEx(5);
        return onePlusNLayoutHelperEx;
    }

    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_text3,null);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(VHolder holder, int position) {
        holder.textView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class VHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public VHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
