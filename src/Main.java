public class Main {
    public static void main(String[] args) {

        FilmDAO filmDAO = new FilmDAO();
        ViewerDAO viewerDAO = new ViewerDAO();

        System.out.println("Films:");
        filmDAO.getAllFilms();

        System.out.println("\nViewers:");
        viewerDAO.getAllViewers();
    }
}


//public class Main {
//    static void main(String[] args) {
//        Film film1 = new Film("Zootopia 2", 108, "Comedy");
//        Film film2 = new Film("Five Nights at Freddy's 2", 104, "Horror");
//        Film film3 = new Film("Auru", 117, "Drama");
//
//        Viewer viewer1 = new Viewer("Dimash", 18);
//
//        Cinema cinema = new Cinema("kinoPark", 1);
//
//        cinema.addFilm(film1);
//        cinema.addFilm(film2);
//        cinema.addFilm(film3);
//
//        System.out.println("All films:");
//        cinema.showFilms();
//
//        System.out.println("\nFind by genre Horror:");
//        cinema.findByGenre("Horror");
//
//        System.out.println("\nFilter by duration >= 110:");
//        cinema.filterByDuration(110);
//
//        System.out.println("\nSorted by title:");
//        cinema.sortByTitle();
//        cinema.showFilms();
//
//        System.out.println("\nViewer info:");
//        System.out.println(viewer1);
//        System.out.println("Role: " + viewer1.getRole());
//    }
//}