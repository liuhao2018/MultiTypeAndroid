package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Recommend;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class RecommendViewBinder extends ItemViewBinder<Recommend,RecommendViewBinder.ViewHolder> {


    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.recommend,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Recommend item) {
        holder.img.setImageResource(item.img);
        holder.name.setText(item.name);
        holder.address.setText(item.address);
        holder.status.setText(item.status);
        holder.price.setText(item.price);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView name;
        private TextView address;
        private TextView status;
        private TextView price;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            name = (TextView) itemView.findViewById(R.id.name);
            address = (TextView) itemView.findViewById(R.id.address);
            status = (TextView) itemView.findViewById(R.id.status);
            price = (TextView) itemView.findViewById(R.id.price);

        }
    }
}
