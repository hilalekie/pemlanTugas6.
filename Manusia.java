public class Manusia {
    protected String nama;
    protected String nik;
    protected boolean jenisKelamin; // true = laki-laki, false = perempuan
    protected boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +
               "\nnik\t\t: " + nik +
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\npendapatan\t: " + getPendapatan() +
               "\n--------------------------";
    }    
}
