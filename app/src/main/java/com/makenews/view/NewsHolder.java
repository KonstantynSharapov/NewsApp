package com.makenews.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.makenews.R;


public class NewsHolder extends RecyclerView.ViewHolder {

    TextView tvOwnerName;
    TextView tvCardNum;
    TextView tvAmount;

    public NewsHolder(@NonNull View itemView) {
        super(itemView);
        tvOwnerName = itemView.findViewById(R.id.tv_title_news);
        tvCardNum = itemView.findViewById(R.id.tv_name_kostya);
        tvAmount = itemView.findViewById(R.id.iv_news);
    }
}
