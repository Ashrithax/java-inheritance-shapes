public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Silinder berwarna " + getWarna() + " dengan radius " + getRadius()
                + " dan luas " + hitungLuas());
    }

    public static void main(String[] args) {
        Bentuk object1 = new Bentuk("Maroon");
        object1.tampilkanInfo();

        BujurSangkar object2 = new BujurSangkar(5, "Lilac");
        object2.tampilkanInfo();
        object2.setSisi(10);
        object2.setWarna("Biru");
        object2.tampilkanInfo();

        Lingkaran object3 = new Lingkaran(3, "Hijau");
        object3.tampilkanInfo();

        Silinder object4 = new Silinder(4, 2, "Kuning");
        object4.tampilkanInfo();
        object4.setTinggi(20);
        object4.tampilkanInfo();

    }

}
