public class MainApp {
    public static void main(String[] args) {
        System.out.println("Tidak diketahui");
        Sampan tidaktahu = new Sampan(4, 20000, 0);
        tidaktahu.informasi();
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
        System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");

        System.out.println();

        System.out.println("Sampan");
        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        System.out.println();

        System.out.println("Kapal");
        Kapal kapal = new Kapal(50, 10000, "Diesel 10 baling");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }


}
