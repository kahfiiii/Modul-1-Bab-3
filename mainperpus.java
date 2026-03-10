import java.util.*;
public class mainperpus {

    public static void main(String[] args) {

        Buku[] buku = new Buku[35];

        for(int i=0;i<35;i++){
            buku[i] = new Buku();
        }

        // TEKNOLOGI
        buku[0].setData("Pemrograman Java", "Andi", "Teknologi", 2020);
        buku[1].setData("Artificial Intelligence", "Budi", "Teknologi", 2021);
        buku[2].setData("Machine Learning", "Citra", "Teknologi", 2022);
        buku[3].setData("Data Science", "Dedi", "Teknologi", 2023);
        buku[4].setData("Cloud Computing", "Eka", "Teknologi", 2024);

        // FILSAFAT
        buku[5].setData("Filsafat Ilmu", "Ahmad", "Filsafat", 2018);
        buku[6].setData("Logika Dasar", "Rina", "Filsafat", 2017);
        buku[7].setData("Pemikiran Plato", "Sari", "Filsafat", 2016);
        buku[8].setData("Filsafat Modern", "Tono", "Filsafat", 2019);
        buku[9].setData("Etika", "Yusuf", "Filsafat", 2020);

        // SEJARAH
        buku[10].setData("Sejarah Dunia", "Anton", "Sejarah", 2015);
        buku[11].setData("Sejarah Indonesia", "Bambang", "Sejarah", 2016);
        buku[12].setData("Perang Dunia II", "Cahyo", "Sejarah", 2017);
        buku[13].setData("Kerajaan Nusantara", "Doni", "Sejarah", 2018);
        buku[14].setData("Sejarah Asia", "Edy", "Sejarah", 2019);

        // AGAMA
        buku[15].setData("Tafsir Quran", "Hassan", "Agama", 2015);
        buku[16].setData("Hadits Pilihan", "Imam", "Agama", 2016);
        buku[17].setData("Fiqh Islam", "Jamal", "Agama", 2017);
        buku[18].setData("Akhlak Mulia", "Karim", "Agama", 2018);
        buku[19].setData("Sejarah Nabi", "Lukman", "Agama", 2019);

        // PSIKOLOGI
        buku[20].setData("Psikologi Umum", "Maya", "Psikologi", 2020);
        buku[21].setData("Psikologi Pendidikan", "Nina", "Psikologi", 2021);
        buku[22].setData("Psikologi Sosial", "Oka", "Psikologi", 2022);
        buku[23].setData("Psikologi Anak", "Putri", "Psikologi", 2023);
        buku[24].setData("Psikologi Kepribadian", "Rudi", "Psikologi", 2024);

        // POLITIK
        buku[25].setData("Ilmu Politik", "Seno", "Politik", 2018);
        buku[26].setData("Demokrasi", "Taufik", "Politik", 2019);
        buku[27].setData("Sistem Pemerintahan", "Umar", "Politik", 2020);
        buku[28].setData("Politik Global", "Vina", "Politik", 2021);
        buku[29].setData("Partai Politik", "Wawan", "Politik", 2022);

        // FIKSI
        buku[30].setData("Laskar Pelangi", "Andrea Hirata", "Fiksi", 2005);
        buku[31].setData("Bumi", "Tere Liye", "Fiksi", 2014);
        buku[32].setData("Dilan 1990", "Pidi Baiq", "Fiksi", 2014);
        buku[33].setData("Negeri 5 Menara", "Ahmad Fuadi", "Fiksi", 2009);
        buku[34].setData("Ayat Ayat Cinta", "Habiburrahman", "Fiksi", 2004);

        // MENAMPILKAN DATA
        for(int i=0;i<35;i++){
            buku[i].tampil();
        }
    }
}