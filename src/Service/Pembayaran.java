package service;

public interface Pembayaran {
    void prosesPembayaran(double total);
    default void cetakStruk(double total) {
        System.out.println("Total pembayaran: Rp" + total);
    }
}
