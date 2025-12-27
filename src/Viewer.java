public class Viewer extends CinemaUser {

    public Viewer(String name, int age) {
        super(name, age);
    }

    @Override
    public String getRole() {
        return "Viewer";
    }

    @Override
    public String toString() {
        return "Viewer name='" + getName() + "', age=" + getAge() + " ";
    }
}