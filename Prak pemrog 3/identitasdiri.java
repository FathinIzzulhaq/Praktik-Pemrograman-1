public class identitasMahasiswa {
    public static void main(String[] args){

        // Variabel Biodata
        String namaDepan    = "Fathin";
        String namaBelakang = "Izzulhaq";
        String nim          = "21537144017";
        int    angkatan     = 2021;
        String programStudi = "S1-Teknologi Informasi";
        String jurusan      = "PTEI";
        String fakultas     = "Fakultas Teknik";
        double ipkHarapan   = 3.75d;

        System.out.println("-------Identitas Mahasiswa UNY-------");
        System.out.println("");
        System.out.println("1. Nama Lengkap     : " + namaDepan + " " + namaBelakang);
        System.out.println("2. Nama Panggilan   : " + namaBelakang);
        System.out.println("3. NIM              : " + nim);
        System.out.println("4. Tahun Angkatan   : " + angkatan);
        System.out.println("5. Program Studi    : " + programStudi);
        System.out.println("6. Jurusan          : " + jurusan);
        System.out.println("7. Fakultas         : " + fakultas);
        System.out.println("8. IPK Harapan      : >" + ipkHarapan);
        System.out.println("");

        // bagian deskripsi
        System.out.println("Deskripsi :");
        System.out.println("Halo teman-teman yang saya sayangi");
        System.out.print("Perkenalkan nama saya " + namaDepan + " " + namaBelakang + ", ");
        System.out.print("saya biasa dipanggil " + namaBelakang + ". ");
        System.out.print("NIM saya " + nim + ". \n");
        System.out.print("Saya dari angkatan " + angkatan);
        System.out.print("dari Program Studi " + programStudi + " " + fakultas + ". \n");
        System.out.print("IPK harapan saya pada semester ini adalah >" + ipkHarapan + ".");
    }
}