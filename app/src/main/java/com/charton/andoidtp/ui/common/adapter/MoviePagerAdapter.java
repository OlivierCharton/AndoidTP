package com.charton.andoidtp.ui.common.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.charton.andoidtp.ui.ui.fragments.MoviesSeenFragment;
import com.charton.andoidtp.ui.ui.fragments.MoviesToSeeFragment;

/**
 * Created by olivi on 18/02/2016.
 */
public class MoviePagerAdapter extends FragmentStatePagerAdapter {

    private int mMoviesTabNumber;

    public MoviePagerAdapter(android.support.v4.app.FragmentManager fm, int tabNumber) {
        super(fm);
        mMoviesTabNumber = tabNumber;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new MoviesSeenFragment();
        else return new MoviesToSeeFragment();
    }

    @Override
    public int getCount() {
        return mMoviesTabNumber;
    }
}
