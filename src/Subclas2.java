public class Subclas2 extends Car {
    public Subclas2() {
    }

    public Subclas2(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public String gas() {
        return "газ";
    }

    @Override
    public String brake() {
        return "токтотуу";
    }
}
