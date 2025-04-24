import java.time.LocalDate;

public class Pekerja extends Manusia {
    protected double gaji;
    protected LocalDate tahunMasuk;
    protected int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
    }


    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();
        int lama = tahunSekarang - tahunMasuk.getYear();
        if (lama < 10) return gaji * 0.05;
        else if (lama <= 10) return gaji * 0.1;
        else return gaji * 0.15;
    }
    
    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + (jumlahAnak * 20) + gaji;
    }
    
    @Override
public String toString() {
    return "--------------------------" +
           "\nnama\t\t: " + nama +
           "\nnik\t\t: " + nik +
           "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
           "\npendapatan\t: " + getPendapatan() +
           "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() +
           "\njumlah anak\t: " + jumlahAnak +
           "\ngaji\t\t: " + gaji +
           "\n--------------------------";
    }
}
