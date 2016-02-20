package com.charton.andoidtp.ui.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.charton.andoidtp.R;
import com.charton.andoidtp.ui.common.adapter.MoviePagerAdapter;

import java.util.List;

import factory.MovieFactory;
import model.Movie;

public class MainActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private MoviePagerAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gestion Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Movies Seen"));
        tabLayout.addTab(tabLayout.newTab().setText("Movies To See"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);


        mViewPager = (ViewPager) findViewById(R.id.movie_pager);
        mAdapter = new MoviePagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        mViewPager.setOffscreenPageLimit(mAdapter.getCount());
        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
