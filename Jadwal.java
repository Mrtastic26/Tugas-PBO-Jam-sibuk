public class Jadwal {
    public static void main(String[] args) {
        Asdos fairuzikun = new Asdos("Fairuzikun", 73);
        Dosen rajaOPDamanik = new Dosen("Raja OP Damanik", 40);
        Asdos angelChan = new Asdos("Angel-chan", 64);
        Mahasiswa firman = new Mahasiswa("Firman", 60);
        Mahasiswa nidToPassThisSem = new Mahasiswa("Nid to pass this sem", 69);
        Dosen nivotko = new Dosen("Nivotko", 24);

        Elemen[] elemen = {fairuzikun, rajaOPDamanik, angelChan, firman, nidToPassThisSem, nivotko};

        int totalJamSibuk = 0;
        for (Elemen person : elemen) {
            person.getJamSibuk();
            totalJamSibuk += person.jamSibuk;
        }

        System.out.println("------------------------------");
        System.out.println("Total Jam Sibuk Elemen Fasilkom: " + totalJamSibuk + " jam");
    }
}