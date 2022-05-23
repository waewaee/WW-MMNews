package com.waewaee.padc7_ww_mmnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.waewaee.padc7_ww_mmnews.activities.NewsDetailsActivity;
import com.waewaee.padc7_ww_mmnews.adapters.NewsAdapter;
import com.waewaee.padc7_ww_mmnews.delegates.NewsItemDelegate;

public class MainActivity extends AppCompatActivity implements NewsItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView rvNews = findViewById(R.id.rv_news);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        NewsAdapter adapter = new NewsAdapter(this);
        rvNews.setAdapter(adapter);

    }

    @Override
    public void onTapNewsItem() {
        Intent intent = NewsDetailsActivity.newIntent(this);
        startActivity(intent);
    }
}