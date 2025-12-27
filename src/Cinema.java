import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cinema {
    private String name;
    private int hallNumber;
    private ArrayList<Film> films; //лист

    public Cinema(String name, int hallNumber) {
        this.name = name;
        this.hallNumber = hallNumber;
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHallNumber() {
        return hallNumber;
    }
    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    // searching
    public void findByGenre(String genre) {
        for (Film film : films) {
            if (film.getGenre().equals(genre)) {
                System.out.println(film);
            }
        }
    }

    // filtering
    public void filterByDuration(int minDuration) {
        for (Film film : films) {
            if (film.getDuration() >= minDuration) {
                System.out.println(film);
            }
        }
    }

    // sorting
    public void sortByTitle() {
        Collections.sort(films, Comparator.comparing(Film::getTitle));
    }

    public void showFilms() {
        for (Film film : films) {
            System.out.println(film);
        }
    }
}
