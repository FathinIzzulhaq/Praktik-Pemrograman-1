public class DataMahasiswa extends DataPribadi {
    private String nim;
    private String nama;
    private double ipk;
    private int semester;

    public DataMahasiswa(String nim, String nama, double ipk, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void setSemester(int semester) {
        this.semester =  semester;
    }

    public int getSemester() {
        return this.semester;
    }
    public void getDetail() {
        System.out.println("Nama Lengkap : "+this.nama);
        System.out.println("NIM          : "+this.nim);
        System.out.println("IPK          : "+this.ipk);
        System.out.println("Tinggi Badan : "+this.tinggiBadan+" cm");
        System.out.println("Berat Badan  : "+this.beratBadan+" kg");
    }

    public void setNamaMahasiswa(String namaLengkap) {
    }

}