public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish is resting.");
    }

    private void moveMuscles() {
        System.out.println("Fish move muscles.");
    }

    private void moveBackFin() {
        System.out.println("Fish move back fin.");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
