package model;

public class MenuItem<T extends Produk> {
    private T item;
    private int kuantitas;

    public MenuItem(T item, int kuantitas) {
        this.item = item;
        this.kuantitas = kuantitas;
    }

    public double hitungSubtotal() {
        return item.getHarga() * kuantitas;
    }

    public T getItem() {
        return item;
    }

    public int getKuantitas() {
        return kuantitas;
    }
}
