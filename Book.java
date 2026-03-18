import java.io.*;

public class Book {

    String judul;
    String penulis;
    String kategori;
    int tahun;

    // Constructor
    public Book(){}
    public Book(String j, String p, String k, int t){
        judul = j;
        penulis = p;
        kategori = k;
        tahun = t;
    }

    
    public void setData(String j, String p, String k, int t){
        judul = j;
        penulis = p;
        kategori = k;
        tahun = t;
    }

    
    public void tampil(){
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Kategori: " + kategori);
        System.out.println("Tahun   : " + tahun);
        System.out.println("----------------------");
    }

    
    public void bacaFile(String pathFile){
        try{
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String data = br.readLine();
            String[] hasil = data.split(";");

            judul = hasil[0];
            penulis = hasil[1];

            br.close();
        }catch(Exception e){
            System.out.println("Error baca file: " + e.getMessage());
        }
    }

    
    public void simpanFile(String namaFile){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile));
            bw.write(judul + ";" + penulis + ";" + kategori + ";" + tahun);
            bw.close();
        }catch(Exception e){
            System.out.println("Error simpan file: " + e.getMessage());
        }
    }

    // ==============================
    // 3. hitungRoyalti (1 parameter)
    // ==============================
    public double hitungRoyalti(double harga){
        return harga * 0.10;
    }

    // ==============================
    // 4. hitungRoyalti (OVERLOADING)
    // ==============================
    public double hitungRoyalti(double harga, double persen){
        return harga * (persen / 100);
    }
}