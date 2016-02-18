package com.charton.andoidtp.ui.common.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.charton.andoidtp.ui.ui.fragments.MovieDetailFragment;

import java.util.List;

import model.Movie;

/**
 * Created by olivi on 18/02/2016.
 */
public class MoviePagerAdapter extends FragmentStatePagerAdapter {

    private List<Movie> mMovies;

    public MoviePagerAdapter(android.support.v4.app.FragmentManager fm, List<Movie> movies){
        super(fm);
        mMovies = movies;
    }

    @Override
    public Fragment getItem(int position) {
        return MovieDetailFragment.newInstance(mMovies.get(position));
    }

    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mMovies.get(position).getmTitle();
    }

}
