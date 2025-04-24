public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * gaji); // tambahan 10% dari gaji
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
               "\ndepartemen\t: " + departemen +
               "\n--------------------------";
    }    
}
