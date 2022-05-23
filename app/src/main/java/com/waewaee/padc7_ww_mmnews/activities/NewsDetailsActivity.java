package com.waewaee.padc7_ww_mmnews.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.waewaee.padc7_ww_mmnews.R;
import com.waewaee.padc7_ww_mmnews.adapters.NewsDetailsImageAdapter;

public class NewsDetailsActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, NewsDetailsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        ViewPager vpNewsDetailsImages = findViewById(R.id.vp_news_details_images);

        NewsDetailsImageAdapter adapter = new NewsDetailsImageAdapter();
        vpNewsDetailsImages.setAdapter(adapter);

    }
}
