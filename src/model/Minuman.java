package model;

public class Minuman extends Produk {
    private boolean isDingin;

    public Minuman(String nama, double harga, boolean isDingin) {
        super(nama, harga);
        this.isDingin = isDingin;
    }

    @Override
    public void deskripsi() {
        System.out.println(getNama() + " - " + (isDingin ? "Dingin" : "Panas") + 
                         " | Harga: Rp" + getHarga());
    }
}
