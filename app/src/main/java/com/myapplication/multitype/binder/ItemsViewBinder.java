package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Item;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class ItemsViewBinder extends ItemViewBinder<Item,ItemsViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.items,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Item item) {
        holder.icon.setImageResource(item.icon);
        holder.title.setText(item.title);
        holder.content.setText(item.content);
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView icon;
        private TextView title;
        private TextView content;
        public ViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            title = (TextView) itemView.findViewById(R.id.title);
            content = (TextView) itemView.findViewById(R.id.content);
        }
    }
}
