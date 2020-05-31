import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Main {
    int angka; //Deklarasi variabel angka bertipe data integer
    Main next; //Deklarasi varriabel next sebagai bagian dari class main
    static Scanner input = new Scanner(System.in); 
    /*Deklarasi variabel in sebagai bagian dari Scanner serta penambahan keyword 
    static agar kelas lain dapat mengakses tanpa melakukan inisiasi
    */

    public void input() {
        System.out.print("Masukkan angka        : "); //Perintah untuk menampilkan tulisan pada saat di run
        angka = input.nextInt(); //Deklarasi nilai angka sebagi inputan nilai integer
        next = null; //Pengindikasian dimana next bernilai null
    }

    public void baca() {
        System.out.println(angka); //Perintah untuk menampilkan angka pada saat di run
    }

    public static void main(String[] args) {
        int pilihan = 0; // Deklarasi variabel piliihan bernilai 0 dan bertipe integer
        Queue que = new Queue(); //Deklarasi variabel que pada queue
        while (pilihan != 4) { //Perulangan whille do dengan terdapat 4 kondisi
            System.out.println("1.Enqueue"); //Perintah menampilkan pilihan no 1 enqueue saat di run
            System.out.println("2.Dequeue"); //Perintah menampilkan pilihan no 2 dequeu saat di run
            System.out.println("3.View"); //Perintah menampilkan pilihan no 3 lihat saat di run
            System.out.println("4.Keluar"); //Perintah menampilkan pilihan no 4 keluar saat di run
            System.out.println("Masukkan pilihan : "); //Perintah menampilkan tulisan saat di run 
            pilihan = input.nextInt(); //Mengambil data pada input untuk digunakan pada variabel pilihan
            if (pilihan == 1) { // Kondisi dimana jika memilih pilihan 1
                que.enqueue(); //Mengambil fungsi pada void enqueque
            } else if (pilihan == 2) { //Kondisi dimana jika memilih pilihan 2
                que.dequeue(); //Mengambil fungsi pada void dequeue
            } else if (pilihan == 3) { // Kondisi dimana jika memilih pilihan 3
                que.lihat();// Mengambil fungsi void lihat
            } else if (pilihan == 4) { // Kondisi dimana jika memilih pilihan 4
                System.out.println("keluar"); //Perintah dimana muncul tulisan keluar saat memilih pilihan nomeor 4
            } else {
                System.out.println("Salah"); //Perintah dimana muncul tulisan salah ketika terjadi kondisi inputan nomor selain nomor 1-4
            }
            System.out.print(""); //Perintah untuk memunculkan jarak saat program berjalan
        }
    }
}
