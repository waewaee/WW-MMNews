package com.waewaee.padc7_ww_mmnews.views.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.padc7_ww_mmnews.delegates.NewsItemDelegate;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public NewsViewHolder(@NonNull View itemView, NewsItemDelegate newsItemDelegate) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsItemDelegate.onTapNewsItem();
            }
        });
    }
}
