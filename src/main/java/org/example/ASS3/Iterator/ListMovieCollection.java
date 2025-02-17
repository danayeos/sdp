import java.util.ArrayList;
import java.util.List;

// Коллекция фильмов, хранящихся в списке (List).
public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}