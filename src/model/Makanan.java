package model;

public class Makanan extends Produk {
    private boolean isPedas;

    public Makanan(String nama, double harga, boolean isPedas) {
        super(nama, harga);
        this.isPedas = isPedas;
    }

    @Override
    public void deskripsi() {
        System.out.println(getNama() + " - " + (isPedas ? "Pedas" : "Tidak Pedas") + 
                         " | Harga: Rp" + getHarga());
    }
}
