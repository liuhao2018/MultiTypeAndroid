package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.myapplication.R;
import com.myapplication.multitype.entity.Line;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class LineViewBinder extends ItemViewBinder<Line,LineViewBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.line,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Line item) {

    }

    class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout line;
        public ViewHolder(View itemView) {
            super(itemView);
            line = (LinearLayout) itemView.findViewById(R.id.line);
        }
    }
}
