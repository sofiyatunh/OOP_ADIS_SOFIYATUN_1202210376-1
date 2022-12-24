public class Perangkat {
    String drive;
    int ram;
    float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.println(
            "\nPerangkat tidak diketahui memiliki tipe " + drive+ " dengan ram sebesar " + ram+ " GB dan processor secepat "
            + processor+ " Ghz"
        );
    }
}
