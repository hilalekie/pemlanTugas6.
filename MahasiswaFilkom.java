public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public Mahasiswa(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String prodi = "";
        char kode = nim.charAt(6);
        String angkatan = "20" + nim.substring(0, 2);

        switch (kode) {
            case '2': prodi = "Teknik Informatika"; break;
            case '3': prodi = "Teknik Komputer"; break;
            case '4': prodi = "Sistem Informasi"; break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; break;
            case '7': prodi = "Teknologi Informasi"; break;
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) return 75;
        else if (ipk >= 3.0) return 50;
        else return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +
               "\nnik\t\t: " + nik +
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\npendapatan\t: " + getPendapatan() +
               "\nnim\t\t: " + nim +
               "\nipk\t\t: " + ipk +
               "\nstatus\t\t: " + getStatus() +
               "\n--------------------------";
    }    
}
