package com.charton.andoidtp.ui.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charton.andoidtp.R;
import com.charton.andoidtp.ui.common.adapter.MovieAdapter;

import java.util.ArrayList;
import java.util.List;

import factory.MovieFactory;
import model.Movie;

/**
 * Created by olivi on 20/02/2016.
 */
public class MoviesListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MovieAdapter mMovieAdapter;
    private List<Movie> mMovies = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.movies_list);
        mRecyclerView.setHasFixedSize(false);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mMovieAdapter = new MovieAdapter(getActivity(), mMovies);
        mRecyclerView.setAdapter(mMovieAdapter);
        
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void ChangeList(List<Movie> list)
    {
        mMovies.clear();
        mMovies = list;
    }


}
