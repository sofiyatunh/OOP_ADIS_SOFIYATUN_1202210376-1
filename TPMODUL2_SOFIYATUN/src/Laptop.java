public class Laptop  extends Perangkat{
    protected boolean webcam;

    Laptop (String drive, int ram, float processor, boolean webcam) {
        super(drive, ram,processor);
        this.webcam = webcam;
    }
    
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe " +drive+ " dengan ram sebesar "+ram+" GB dan processor secepat "
        +processor+" Ghz. Selain itu laptop ini "+ (webcam==false? "tidak memiliki":"memiliki")+" webcam");
    }
    public void bukaGame(String namaGame) {
        System.out.println("Laptop berhasil membuka game " + namaGame);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void multiEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " " + "dan ke " + email2);
    }
}

