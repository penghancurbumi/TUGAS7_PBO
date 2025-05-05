import model.*;
import service.*;
import util.FormatRupiah;

public class Main {
    public static void main(String[] args) {
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 25000, true);
        Minuman esTeh = new Minuman("Es Teh", 5000, true);
        
        RestoranService<Produk> service = new RestoranService<>();
        
        service.tambahPesanan(new MenuItem<>(nasiGoreng, 2));
        service.tambahPesanan(new MenuItem<>(esTeh, 3));
        
        service.tampilkanPesanan();
        
        double total = service.hitungTotal();
        System.out.println("\nTOTAL: " + FormatRupiah.format(total));
        
        Pembayaran pembayaran = new Pembayaran() {
            @Override
            public void prosesPembayaran(double total) {
                System.out.println("\nPembayaran berhasil!");
            }
        };
        
        pembayaran.prosesPembayaran(total);
        pembayaran.cetakStruk(total);
    }
}
