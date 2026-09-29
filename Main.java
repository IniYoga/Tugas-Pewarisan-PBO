public class Main {
    public static void main(String[] args) {
        System.out.println("--- TES EXERCISE 1 ---");
        Bentuk b = new Bentuk("Merah");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(5, "Biru");
        bs.printInfo();

        System.out.println("\n--- TES EXERCISE 2 ---");
        Lingkaran l = new Lingkaran(7, "Kuning");
        l.printInfo();

        System.out.println("\n--- TES EXERCISE 3 ---");
        Silinder s = new Silinder(10, 7, "Hijau");
        s.printInfo();
    }
}