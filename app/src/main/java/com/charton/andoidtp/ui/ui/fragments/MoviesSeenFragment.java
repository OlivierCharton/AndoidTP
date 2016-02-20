package com.charton.andoidtp.ui.ui.fragments;

import factory.MovieFactory;

/**
 * Created by olivi on 20/02/2016.
 */
public class MoviesSeenFragment extends MoviesListFragment {

    public MoviesSeenFragment() {
        ChangeList(MovieFactory.getMoviesSeenList());
    }

}
