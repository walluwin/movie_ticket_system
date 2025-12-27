public abstract class CinemaUser {
    protected String name;
    protected int age;

    public CinemaUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Полиморфизм
    public abstract String getRole();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
