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
                siakad.cariData();
            } else if (menu == 5) {
                siakad.editData();
            }else if (menu == 6) {
                siakad.hapusData();
            }

                System.out.println();
                System.out.println(" Selesai ");

                System.out.println("Masukkan Menu");
            }
        }
    

    private static int tampilanMenu() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Menu :");
            System.out.println();

            System.out.println("1. Lihat data");
            System.out.println("2. Tambah data");
            System.out.println("3. Rerata IPK");
            System.out.println("4. Cari data");
            System.out.println("5. Edit data");
            System.out.println("6. Hapus data");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu yang tersedia : ");
            int menu = scan.nextInt();
            return menu;
        }
       
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
        try (Scanner scan = new Scanner(System.in)) {
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
        }
      

        jumlahData++;
        lihatData();
    }
    public void cariData() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
            String nim = scan.nextLine();
            int index = getIndexByNIM(nim);
            if (index==-1) {
                System.out.println("NIM yang anda cari tidak ditemukan");
            } else {
                mahasiswa[index].getDetail();
            }
        }
    }
    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }
    public void editData() {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Masukkan NIM Mahasiswa yang akan diedit = ");
            String NIM = console.nextLine();
            int index = getIndexByNIM(NIM);
            if (index == -100) {
                System.out.println("NIM Mahasiswa yang akan diedit tidak ditemukan");
            } else {
                mahasiswa[index].getDetail();
                System.out.print("Masukkan nama Mahasiswa yang baru = ");
                String NamaLengkap = console.nextLine();
                mahasiswa[index].setNamaMahasiswa(NamaLengkap);
                System.out.print("Masukkan IPK Mahasiswa yang baru = ");
                double ipkMahasiswa = console.nextDouble();
                mahasiswa[index].setIPK(ipkMahasiswa);
                System.out.print("Masukkan jumlah semester Mahasiswa yang baru = ");
                int Semester = console.nextInt();
                mahasiswa[index].setSemester(Semester);
                System.out.print("Masukkan tinggi badan Mahasiswa yang baru = ");
                double tinggiBadan = console.nextDouble();
                mahasiswa[index].setTinggiBadan(tinggiBadan);
                System.out.print("Masukkan berat badan Mahasiswa yang baru = ");
                double beratBadan = console.nextDouble();
                mahasiswa[index].setBeratBadan(beratBadan);
                mahasiswa[index].getDetail();
            }
        }
    }

    
    public void hapusData() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
            String nim = scan.nextLine();
            int index = getIndexByNIM(nim);
            if (index==-1) {
                System.out.println("Data yang anda akan hapus tidak ditemukan");
            } else {
                for (int i = index; i<jumlahData; i++) {
                    mahasiswa[i] = mahasiswa[i+1];
                }
                jumlahData--;
                lihatData();
            }
        }
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


    


