public class Book {

    private String judul;
    private String penulis;
    private String kategori;
    private int tahun;

    public void setData(String judul, String penulis, String kategori, int tahun)   {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahun = tahun;
    }

    public void tampil(){
        System.out.println("Judul Buku   : " + this.judul);
        System.out.println("Penulis      : " + this.penulis);
        System.out.println("Kategori     : " + this.kategori);
        System.out.println("Tahun Terbit : " + this.tahun);
        System.out.println("------------------------------");
    }
}