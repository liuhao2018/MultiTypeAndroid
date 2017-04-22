package com.myapplication.vlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.GridLayoutHelper;
import com.myapplication.R;

/**
 * Created by liuhao on 2017/4/4.
 */

public class VAdapter2 extends DelegateAdapter.Adapter<VAdapter2.VHolder> {

    private Context context;
    private String[] data = {"美食","美图超市","生鲜果蔬","下午茶",
                             "正餐优选","美团专送","饮品站","小吃馆"};

    public VAdapter2(Context context){
        this.context = context;
    }


    @Override
    public LayoutHelper onCreateLayoutHelper() {
        GridLayoutHelper gridLayoutHelper = new GridLayoutHelper(4);
        gridLayoutHelper.setGap(10);
        return gridLayoutHelper;
    }

    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_text2,null);
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
