package com.myapplication.multitype.binder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.multitype.entity.Ticket;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by liuhao on 2017/4/21.
 */

public class TicketViewBinder extends ItemViewBinder<Ticket,TicketViewBinder.ViewHolder> {


    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.ticket,parent,false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Ticket item) {
        holder.type.setText(item.type);
        holder.price.setText(item.price);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView type;
        private TextView price;
        private TextView buy;

        public ViewHolder(View itemView) {
            super(itemView);
            type = (TextView) itemView.findViewById(R.id.type);
            price = (TextView) itemView.findViewById(R.id.price);
            buy = (TextView) itemView.findViewById(R.id.buy);
        }
    }
}
