public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 16, 4.40f);
        perangkat.informasi();

        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 3.2f, false);
        laptop.informasi();
        laptop.bukaGame("Stumble Guys");
        laptop.kirimEmail("sofiyatunh@gmail.com");
        laptop.multiEmail("tunitun@gmail.com", "sotun@gmail.com");
        
        System.out.println();

        Handphone hp = new Handphone(true, "Samsung", 4, 2.20f);
        hp.informasi();
        hp.telfon(853143638);
        hp.kirimSMS(813865455);
        hp.kirimSMS2(813865458, 853145122);
        
    }
}