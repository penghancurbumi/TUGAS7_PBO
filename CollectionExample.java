import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    public static void main(String[] args) {
        // Contoh ArrayList
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Ferdi");
        mahasiswaList.add("Budi");
        mahasiswaList.add("Ani");
        
        System.out.println("ArrayList Contoh:");
        for(String mhs : mahasiswaList) {
            System.out.println(mhs);
        }
        
        // Contoh ArrayDeque
        ArrayDeque<Integer> nilaiQueue = new ArrayDeque<>();
        nilaiQueue.add(85);
        nilaiQueue.add(90);
        nilaiQueue.add(78);
        
        System.out.println("\nArrayDeque Contoh:");
        while(!nilaiQueue.isEmpty()) {
            System.out.println(nilaiQueue.poll());
        }
    }
}