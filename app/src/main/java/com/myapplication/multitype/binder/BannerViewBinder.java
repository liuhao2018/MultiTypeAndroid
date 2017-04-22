package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Banner;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class BannerViewBinder extends ItemViewBinder<Banner,BannerViewBinder.ViewHolder> {


    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.banner,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Banner item) {
        holder.banner.setImageResource(R.mipmap.banner);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView banner;
        public ViewHolder(View itemView) {
            super(itemView);
            banner = (ImageView) itemView.findViewById(R.id.banner);
        }
    }
}
