/*
Tugas Proyek Praktik Pemrograman 1

Nama: Fathin Izzulhaq
NIM: 21537144017
Kelas: J1
Prodi: Teknologi Informasi
Bahasa Pemrograman: Java

*/

import java.util.Scanner;

public class Siakad {
    DataMahasiswa[] mahasiswa = new DataMahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        System.out.println();
        
        System.out.println("    SIAKAD    ");
       
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=5) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.rerataIPK();
            } else if (menu==4) {
                siakad.editData();
            } else if (menu==5) {
                siakad.cariData();

                System.out.println();
                System.out.println(" Selesai ");
            } else {
                System.out.println("Masukkan Menu");
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Menu :");
        System.out.println();

        System.out.println("1. Lihat data");
        System.out.println("2. Tambah data");
        System.out.println("3. Rerata IPK");
        System.out.println("4. Edit Data");
        System.out.println("5. Exit");
        System.out.print("Pilih menu yang tersedia : ");
        int menu = scan.nextInt();
        return menu;
       
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        }else{
            System.out.println();
            System.out.println("Berikut data mahasiswa");
            for (int i=0; i<jumlahData;i++) {
                mahasiswa[i].getDetail();
               
        }
      }
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
      

        System.out.println();
        System.out.println("Masukkan data anda!");
        System.out.print("Nama  = ");
        String nama = scan.nextLine();
        System.out.print("NIM   = ");
        String nim = scan.nextLine();
        System.out.print("IPK   = ");
        double ipk = scan.nextDouble();
        System.out.print("Tinggi Badan = ");
        double tinggi = scan.nextDouble();
        System.out.print("Berat Badan  = ");
        double berat = scan.nextDouble();
        System.out.print("semester = ");
        int semester = scan.nextInt();
        DataMahasiswa inputMahasiswa = new DataMahasiswa(nim, nama, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }
    private void cariData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
            String nim = scan.nextLine(); 
        }
    }

        public void editData() {
            System.out.println("Menu belum tersedia.");
        }

    public void rerataIPK() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            double total = 0.0;
            for(int i=0; i<jumlahData; i++) {
                total += mahasiswa[i].getIPK();
            }
            double rerata = total/jumlahData;
            System.out.println();
            System.out.println("Rerata IPK Mahasiswa = "+ rerata);
        
            
        }

    }
}


    


