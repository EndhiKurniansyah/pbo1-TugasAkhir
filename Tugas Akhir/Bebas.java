public class Bebas {
    private int id;
    private String judul;
    private String sutradara;
    private int durasi;
    private double harga;

    public void TampilkanFilm() {
        System.out.println("Ini method untuk Menampilkan Film");
    }

    public void BerikanDiskon() {
        System.out.println("Ini method untuk Memberikan Diskon");
    }

    public void PromoFilm() {
        System.out.println("Ini method untuk Promo Film");
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return this.sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public int getDurasi() {
        return this.durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Film() {
        System.out.println("Object Film telah diciptakan");
    }
    public void naikkanHarga() {
        System.out.println("Harga film telah dinaikkan sebesar 10. Harga baru: " + this.harga);
    }

    public void naikkanHarga(double kenaikan) {
        System.out.println("Harga film telah dinaikkan sebesar " + kenaikan + ". Harga baru: " + this.harga);
    }
}

