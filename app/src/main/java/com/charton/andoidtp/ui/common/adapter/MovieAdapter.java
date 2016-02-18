package com.charton.andoidtp.ui.common.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.charton.andoidtp.R;

import java.util.List;

import model.Movie;

/**
 * Created by olivi on 18/02/2016.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> mMovieList;

    public MovieAdapter(List<Movie> movieList) {
        mMovieList = movieList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_small_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = mMovieList.get(position);

        holder.mColorView.setBackgroundColor(movie.getmColor());
        holder.mTitleView.setText(movie.getmTitle());
        holder.mDescriptionView.setText(movie.getmDescription());
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private View mColorView;
        private TextView mTitleView;
        private TextView mDescriptionView;

        public ViewHolder(View v) {
            super(v);
            mColorView = v.findViewById(R.id.movie_color);
            mTitleView = (TextView) v.findViewById(R.id.movie_title);
            mDescriptionView = (TextView) v.findViewById(R.id.movie_description);
        }
    }
}




