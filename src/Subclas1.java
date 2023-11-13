public class Subclas1 extends  Car {
    public Subclas1() {
    }

    public Subclas1(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public String gas() {
        return "gas";
    }

    @Override
    public String brake() {
        return "brake";
    }
}
