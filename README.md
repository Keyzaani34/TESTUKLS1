# TESTUKLS1
# Program Penentu Bilangan Ganjil atau Genap

## 🧩 Deskripsi Singkat
Program **TestUKLS12** adalah program sederhana berbasis **Java** yang digunakan untuk menentukan apakah suatu **bilangan termasuk ganjil atau genap**.  
Program ini menerima input dari pengguna, kemudian melakukan pengecekan menggunakan operator **modulus (%)** untuk menentukan hasilnya.

---

## ⚙️ Cara Kerja Program

1. **Input Data dari Pengguna**
   - Program meminta pengguna untuk memasukkan sebuah bilangan bulat:
     ```java
     System.out.println("Masukkan bilangan");
     int bilangan = input.nextInt();
     ```

2. **Pemeriksaan Bilangan**
   - Program menggunakan operator **modulus (%)** untuk memeriksa sisa hasil pembagian bilangan dengan 2:
     ```java
     if (bilangan % 2 == 0) {
         System.out.println(bilangan + " adalah bilangan genap.");
     } else {
         System.out.println(bilangan + " adalah bilangan ganjil.");
     }
     ```
   - Jika hasil `bilangan % 2 == 0`, maka bilangan **genap**,  
     sebaliknya jika tidak, maka bilangan **ganjil**.

3. **Output Hasil**
   - Program menampilkan hasil pemeriksaan ke layar berupa:
     ```
     [angka] adalah bilangan genap.
     ```
     atau
     ```
     [angka] adalah bilangan ganjil.
     ```

---

**Masukkan bilangan**
7
7 adalah bilangan ganjil.

**Masukkan bilangan**
10
10 adalah bilangan genap.

---

## 💡 Kesimpulan
Program ini merupakan contoh dasar penggunaan **struktur kendali if-else** dan **operator modulus** di Java.  
Cocok digunakan untuk latihan logika pemrograman dasar dan pemahaman input/output pada Java.

---

## 🖥️ Cara Menjalankan
1. Simpan kode sebagai file: `TestUKLS12.java`
2. Kompilasi program:

3. Jalankan program:
<img width="455" height="104" alt="Screenshot 2025-11-04 103332" src="https://github.com/user-attachments/assets/0a6cf56f-2f8c-4f58-8d27-f243551a55ef" />


## 🧮 Contoh Output
