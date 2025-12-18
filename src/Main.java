
public class Main {
    static void main(String[] args) {
        Film film1 = new Film("Zootopia 2", 108, "Comedy");
        Film film2 = new Film("Five Nights at Freddy's 2", 104, "Horror");
        Film film3 = new Film("Auru", 117, "Drama");

        Viewer viewer1 = new Viewer("Dimash", 18);
        Viewer viewer2 = new Viewer("neDimash", 20);

        Cinema cinema1 = new Cinema("kinoPark", 1);
        Cinema cinema2 = new Cinema("Chaplin", 2);

        System.out.println("Film 1: " + film1.getTitle() + ", Genre: " + film1.getGenre() + ", Duration: " + film1.getDuration());
        System.out.println("Film 2: " + film2.getTitle() + ", Genre: " + film2.getGenre() + ", Duration: " + film2.getDuration());
        System.out.println("Film 3: " + film3.getTitle() + ", Genre: " + film3.getGenre() + ", Duration: " + film3.getDuration());

        System.out.println("Viewer 1: " + viewer1.getName() + ", Age: " + viewer1.getAge());
        System.out.println("Viewer 2: " + viewer2.getName() + ", Age: " + viewer2.getAge());

        System.out.println("Cinema: " + cinema1.getName() + ", Hall number: " + cinema1.getHallNumber());
        System.out.println("Cinema: " + cinema2.getName() + ", Hall number: " + cinema2.getHallNumber());
    }
}