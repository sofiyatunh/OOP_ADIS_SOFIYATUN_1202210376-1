public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(boolean fingerprints, String drives, int rams, float processors) {
        super(drives, rams, processors);
        this.fingerprint = fingerprints;
    }

    @Override
    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu handphone ini "
                + (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint");
    }

    public void telfon(int noHP) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + noHP);
    }

    public void kirimSMS(int noHP) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHP);
    }

    public void kirimSMS2(int noHP, int noHP2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHP + " " + "dan " + noHP2);
    }
}