package service;

import model.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class RestoranService<T extends Produk> {
    private List<MenuItem<T>> pesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem<T> item) {
        pesanan.add(item);
    }

    public double hitungTotal() {
        double total = 0;
        for (MenuItem<T> item : pesanan) {
            total += item.hitungSubtotal();
        }
        return total;
    }

    public void tampilkanPesanan() {
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (MenuItem<T> item : pesanan) {
            item.getItem().deskripsi();
            System.out.println("Qty: " + item.getKuantitas() + 
                             " Subtotal: Rp" + item.hitungSubtotal());
        }
    }
}
