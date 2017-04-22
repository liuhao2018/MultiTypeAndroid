package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Detail;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/22.
 */

public class DetailViewBinder extends ItemViewBinder<Detail,DetailViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.detail,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Detail item) {
        holder.img.setImageResource(item.img);
        if(TextUtils.isEmpty(item.name)){
            holder.name.setVisibility(View.GONE);
        }else{
            holder.name.setVisibility(View.VISIBLE);
            holder.name.setText(item.name);
        }
        holder.content.setText(item.content);
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView content;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            content = (TextView) itemView.findViewById(R.id.content);
            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
