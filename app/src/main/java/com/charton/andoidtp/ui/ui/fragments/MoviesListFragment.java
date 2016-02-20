package com.charton.andoidtp.ui.ui.fragments;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charton.andoidtp.R;
import com.charton.andoidtp.ui.common.adapter.adapter.MovieAdapter;
import com.charton.andoidtp.ui.common.adapter.util.ItemClickSupport;

import java.util.ArrayList;
import java.util.List;

import model.Movie;

/**
 * Created by olivi on 20/02/2016.
 */
public class MoviesListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MovieAdapter mMovieAdapter;
    private List<Movie> mMovies = new ArrayList<>();
    private MovieListCallback mCallback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.movies_list);
        mRecyclerView.setHasFixedSize(false);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mMovieAdapter = new MovieAdapter(getActivity(), mMovies);
        mRecyclerView.setAdapter(mMovieAdapter);

        ItemClickSupport.addTo(mRecyclerView).setOnItemClickListener(new ItemClickSupport
                .OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                mCallback.onItemSelected(mMovies.get(position));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MovieListCallback) {
            mCallback = (MovieListCallback) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement MovieistCallback");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }

    public void ChangeList(List<Movie> list)
    {
        mMovies.clear();
        mMovies = list;
    }
    public interface MovieListCallback {
        void onItemSelected(Movie movie);
    }

}
