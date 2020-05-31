/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
class Queue {
    Main batasAtas;
    Main batasBawah; //Deklarasi variabel dari class Main

    public Queue() {
        batasAtas = null; //Deklarasi nilai batasAtas yaitu null
        batasBawah = null; //Deklarasi nilai batasBawah yaitu null
    }

    public void enqueue() {
        Main baru = new Main(); //Deklarasi variabel baru pada Main
        baru.input(); //Penginputan angka 
        if (batasAtas == null) { //Kondisi dimana jika batas atas bernilai null
            batasAtas = baru; //Nilai dari batas atas akan sama dengan baru yaitu inputan yang palling atas
        } else {
            batasBawah.next = baru; //Kondisi dimana jika batas atas tidak bernilai null maka batas baeah sebagai batas atas
        }
        batasBawah = baru;
    }
    /*
    void enqueue merupakan sebuah fungsi menambah data angka dimana data yg dimasukkan
    akan berada diurutan paling awal.Kemudian perintah Main baru = new Main() berguna
    membuat suatu angka baru berdasarkan input.Jika batas atas sma dengan null maka batas
    atas menjadi data awal dan akhir akan sama dengan baru.Lalu jika data awal tidak sama null
    maka akan menjalankan perintah batas bawah.next() = baru yg digunakan untuk menghubungkan
    data baru ke bagian bawah atau awal.
    */

    public void dequeue() {
        if (batasAtas == null) { //Kondisi dinaba jika nilai batas atas sama dengan null
            System.out.println("Kosong"); //Peerintah menampilkan tulisan kosong saat kondisi if terpenuhi
        } else {
            System.out.println("Keluar Data Dengan Angka : " + batasAtas.angka); //Perintah menampilkan tulisan jika kondisi if tidak terpenuhi
            batasAtas = batasAtas.next; //Kondisi dimana jika batas atas tidak bernilai null maka batas atas tetap menjadi batas atas
        }
    }
    /*
    void dequque yaitu fungsi menghapus data terbaru yg ditambahkan .Jika batas atas bernilai null maka program
    akan menampilkan kosong.Lalu jika batas atas tidak bernilai null maka program akan menampilkan tulisan keluar 
    data dengan angka diikuti angkanya serta menjalankan batasAtas = batasAtas diunakan untuk
    memindahkan batas atas ke bagian sebelum data terbaru.
    */

    public void lihat() { 
        if (batasAtas == null) { //Kondisi dinaba jika nilai batas atas sama dengan null
            System.out.println("Kosong"); //Peerintah menampilkan tulisan kosong saat kondisi if terpenuhi
        } else {
            System.out.println("Angka yang ada adalah :"); //Perintah menampilkan tulisan "Angka yang ada..."jika kondisi if tidak terpenuhi
            for (Main a = batasAtas; a != null; a = a.next) { // Peulangan dimana a adalah batas atas dan a dalah negasi dari null 
                a.baca(); //a akan melakukan fungsi void baca yaitu menampilkan data yang tersimpanj
            }
        }
    }
}
