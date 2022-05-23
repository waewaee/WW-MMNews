package com.waewaee.padc7_ww_mmnews.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waewaee.padc7_ww_mmnews.R;
import com.waewaee.padc7_ww_mmnews.delegates.NewsItemDelegate;
import com.waewaee.padc7_ww_mmnews.views.holders.NewsViewHolder;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private NewsItemDelegate mNewsItemDelegate;

    public NewsAdapter(NewsItemDelegate newsItemDelegate) {

        mNewsItemDelegate = newsItemDelegate;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_news, parent, false);
        return new NewsViewHolder(itemView, mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
