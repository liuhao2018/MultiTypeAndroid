package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Category;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class CategoryViewBinder extends ItemViewBinder<Category,CategoryViewBinder.ViewHolder>{

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.common_title,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Category item) {
        holder.title.setText(item.title);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
