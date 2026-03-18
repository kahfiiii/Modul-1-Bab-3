# Tugas Praktikum Pemrograman Lanjut

## Modul 3 – Overloading dan File Handling

### Deskripsi

Program ini merupakan pengembangan dari **Modul 2 (Constructor dan Instance Method)** dengan menambahkan konsep **method overloading** serta kemampuan membaca dan menyimpan data menggunakan file pada class `Buku`.

### Fitur yang Diimplementasikan

1. Method **bacaFile(String pathFile)** untuk membaca data buku dari file `.txt`.
2. Method **simpanFile(String namaFile)** untuk menyimpan data buku ke file.
3. Method **hitungRoyalti(double harga)** untuk menghitung royalti default sebesar 10%.
4. Method **hitungRoyalti(double harga, double persen)** untuk menghitung royalti dengan persentase yang ditentukan.
5. Implementasi **method overloading** pada perhitungan royalti.

### Struktur Program

* **Buku.java** → class yang berisi atribut, constructor, dan method (file handling & overloading).
* **MainPerpustakaan.java** → class utama untuk menjalankan program dan menguji method.
* **data.txt** → file input untuk membaca data buku.
* **output.txt** → file hasil penyimpanan data buku.

### Teknologi

* Bahasa Pemrograman: **Java**
* Konsep:

  * **Method Overloading**
  * **Constructor dan Instance Method**
  * **File Handling (I/O)**
  * **Object Oriented Programming (OOP)**
