package com.myapplication.vlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.myapplication.R;

/**
 * Created by liuhao on 2017/4/4.
 */

public class VAdapter1 extends DelegateAdapter.Adapter<VAdapter1.VHolder> {

    private Context context;

    public VAdapter1(Context context){
        this.context = context;
    }


    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return new SingleLayoutHelper();
    }

    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_text1,null);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(VHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    static class VHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public VHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
