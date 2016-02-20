package com.charton.andoidtp.ui.ui.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.charton.andoidtp.R;

import model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie mMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        Bundle mBundle = getIntent().getExtras();
        mMovie = (Movie) mBundle.get("movieSelected");

        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(mMovie.getmTitle());
            actionBar.setDisplayShowTitleEnabled(true);
        }

        TextView movieTitle = (TextView) this.findViewById(R.id.movie_title);
        TextView movieDescription = (TextView) this.findViewById(R.id.movie_description);
        View moviePicture = this.findViewById(R.id.movie_picture);

        movieTitle.setText(mMovie.getmTitle());
        movieDescription.setText(mMovie.getmDescription());
        moviePicture.setBackgroundColor(mMovie.getmColor());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Movie added to your favorites !", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
