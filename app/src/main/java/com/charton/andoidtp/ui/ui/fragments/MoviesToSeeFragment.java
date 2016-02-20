package com.charton.andoidtp.ui.ui.fragments;

import factory.MovieFactory;

/**
 * Created by olivi on 20/02/2016.
 */
public class MoviesToSeeFragment extends MoviesListFragment {
    public MoviesToSeeFragment() {
        ChangeList(MovieFactory.getMoviesToSeeList());
    }
}
