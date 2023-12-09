class Elemen {
    String name;
    int jamSibuk;

    public Elemen(String name, int jamSibuk) {
        this.name = name;
        this.jamSibuk = jamSibuk;
    }

    public void getJamSibuk() {
        System.out.println(name + " (" + getClass().getSimpleName() + "): " + jamSibuk + " jam sibuk");
    }
}