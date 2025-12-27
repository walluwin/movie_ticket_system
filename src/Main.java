
public class Main {
    static void main(String[] args) {
        Film film1 = new Film("Zootopia 2", 108, "Comedy");
        Film film2 = new Film("Five Nights at Freddy's 2", 104, "Horror");
        Film film3 = new Film("Auru", 117, "Drama");

        Viewer viewer1 = new Viewer("Dimash", 18);

        Cinema cinema = new Cinema("kinoPark", 1);

        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);

        System.out.println("All films:");
        cinema.showFilms();

        System.out.println("\nFind by genre Horror:");
        cinema.findByGenre("Horror");

        System.out.println("\nFilter by duration >= 110:");
        cinema.filterByDuration(110);

        System.out.println("\nSorted by title:");
        cinema.sortByTitle();
        cinema.showFilms();

        System.out.println("\nViewer info:");
        System.out.println(viewer1);
        System.out.println("Role: " + viewer1.getRole());

//        System.out.println("Film 1: " + film1.getTitle() + ", Genre: " + film1.getGenre() + ", Duration: " + film1.getDuration());
//        System.out.println("Film 2: " + film2.getTitle() + ", Genre: " + film2.getGenre() + ", Duration: " + film2.getDuration());
//        System.out.println("Film 3: " + film3.getTitle() + ", Genre: " + film3.getGenre() + ", Duration: " + film3.getDuration());
//
//        System.out.println("Viewer 1: " + viewer1.getName() + ", Age: " + viewer1.getAge());
//        System.out.println("Viewer 2: " + viewer2.getName() + ", Age: " + viewer2.getAge());
//
//        System.out.println("Cinema: " + cinema1.getName() + ", Hall number: " + cinema1.getHallNumber());
//        System.out.println("Cinema: " + cinema2.getName() + ", Hall number: " + cinema2.getHallNumber());
    }
}