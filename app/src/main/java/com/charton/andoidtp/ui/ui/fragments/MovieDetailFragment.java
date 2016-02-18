package com.charton.andoidtp.ui.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.charton.andoidtp.R;

import model.Movie;

/**
 * Created by olivi on 18/02/2016.
 */
public class MovieDetailFragment extends Fragment {

    private static final String MOVIE = "movie";

    private Movie mMovie;

    public MovieDetailFragment(){
    }

    public static MovieDetailFragment newInstance(Movie movie) {
        MovieDetailFragment fragment = new MovieDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(MOVIE, movie);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mMovie = (Movie) getArguments().getSerializable(MOVIE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_detail, container, false);
        TextView titleTextView = (TextView) rootView.findViewById(R.id.movie_detail_title);
        TextView descriptionTextView = (TextView) rootView.findViewById(R.id.movie_detail_description);
        View colorView = rootView.findViewById(R.id.movie_detail_color);
        titleTextView.setText(mMovie.getmTitle());
        descriptionTextView.setText(mMovie.getmDescription());
        colorView.setBackgroundColor(mMovie.getmColor());
        return rootView;
    }
}
