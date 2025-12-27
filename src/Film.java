import java.util.Objects;

public class Film {
    private String title;
    private int duration;
    private String genre;

    public Film(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film title='" + title + "', duration=" + duration + " minutes, genre='" + genre + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o instanceof Film) {
            return false;
        }
        Film otherFilm = (Film) o;
        return title.equals(otherFilm.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
