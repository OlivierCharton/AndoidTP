package factory;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import model.Movie;

/**
 * Created by olivi on 18/02/2016.
 */
public class MovieFactory {

    public static List<Movie> getMoviesSeenList() {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Plop", "L'histoire d'un nain", Color.BLACK));
        movieList.add(new Movie("LOL", "On se la raconte à mort ici", Color.BLUE));

        return movieList;
    }

    public static List<Movie> getMoviesToSeeList() {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Plop", "L'histoire d'un nain", Color.BLACK));
        movieList.add(new Movie("LOL", "On se la raconte à mort ici", Color.BLUE));
        movieList.add(new Movie("LOL", "On se la raconte à mort ici", Color.BLUE));
        movieList.add(new Movie("LOL", "On se la raconte à mort ici", Color.BLUE));
        movieList.add(new Movie("LOL", "On se la raconte à mort ici", Color.BLUE));

        return movieList;
    }
}
