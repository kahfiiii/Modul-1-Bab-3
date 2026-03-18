public class mainperpus {

    public static void main(String[] args) {

        Book b1 = new Book();
        
        // baca dari file
        b1.bacaFile("data.txt"); // isi contoh: Dilan 1990;Pidi Baiq
        b1.kategori = "Fiksi";
        b1.tahun = 2014;

        b1.tampil();

        b1.simpanFile("output.txt");

        // royalti
        double royalti1 = b1.hitungRoyalti(100000);
        double royalti2 = b1.hitungRoyalti(100000, 15);

        System.out.println("Royalti 10% : " + royalti1);
        System.out.println("Royalti custom : " + royalti2);
    }
}