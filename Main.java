public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        Mahasiswa b = new Mahasiswa("16515030111100", 4.0, "B", "111", false, false);
        System.out.println(b);

        Pekerja c = new Pekerja(1000, 2016, 3, 2, "C", "111",  true, true);
        c.setJumlahAnak(4);
        System.out.println(c);

        Manager d = new Manager("HRD", 1000, 2017, 1, 2, "D", "111", true, true);
        d.setJumlahAnak(3);
        System.out.println(d);
    }
}
