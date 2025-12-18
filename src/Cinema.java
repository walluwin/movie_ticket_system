public class Cinema {
    private String name;
    private int hallNumber;

    public Cinema(String name, int hallNumber) {
        this.name = name;
        this.hallNumber = hallNumber;
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
}
