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

        movieList.add(new Movie("Gurgil", "L'histoire d'un nain qui s'en fut chercher du mithril dans la forêt. A voir avec une choppe de bière à la main !", Color.BLACK));
        movieList.add(new Movie("LOL", "Un jour, des gens inventèrent le gaz hilarant. L'utilisation de ce gaz plonga le monde dans une guerre sans merci pour faire rire son peuple le plus fort. ", Color.BLUE));
        movieList.add(new Movie("Sans Tinelle 2", "Adam se décide enfin à quitter l'enfer de sa vie avec Eve, il rencontre Polipe en chemin, mais tout n'est pas si simple que dans ce nouvel Eden.", Color.RED));

        return movieList;
    }

    public static List<Movie> getMoviesToSeeList() {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Poney poney", "Le Poney poney doit sauver son peuple d'un nain maléfique qui veut obscurcir le monde. Il sera aidé de tous ses amis magiques.", Color.BLACK));
        movieList.add(new Movie("Michel et Roger", "Deux enfants grandissent devant une autoroute dans un motel. Adultes, ils sillonent le bitume à bord de leur camion dans une expérience de vie touchante.", Color.BLUE));
        movieList.add(new Movie("Pourquoi la vie ?", "On se le demande tous depuis qu'on sait que 42 n'est qu'un mensonge, comme le gâteau. Omega répond à ces questions dans ce documentaire.", Color.GREEN));
        movieList.add(new Movie("Je suis un cinéaste", "Michel Lac est devenu aveugle et ne peut plus réalisier d'explosions. Il plonge dans une profonde déprime, mais Lucette, grande fan, ne l'entend pas comme ça.", Color.RED));
        movieList.add(new Movie("51 variations", "Peronne n'aurait pu préparer Tiantian à ce qui va lui arriver. Muni de son Audi et sa cravate, il se lance à corps perdu dans le combat de sa vie.", Color.GRAY));

        return movieList;
    }
}
