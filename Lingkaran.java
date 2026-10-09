public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14159;
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Lingkaran berwarna " + getWarna() + " dengan radius " + radius
                + " dan luas " + hitungLuas());
    }
}
