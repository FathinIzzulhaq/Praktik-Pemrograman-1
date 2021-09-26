import java.util.Scanner;

public class Cobainput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sysytem.out.print("Masukkan nama anda");
        String namaDepan = scanner.nextLine();

        System.out.print("Masukkan umur anda");
        int umur = scanner.nextInt();

        System.out.println("Nama anda adalah" + namaDepan);
        System.out.println("Umur anda adalah"+ umur);

    } 
}
