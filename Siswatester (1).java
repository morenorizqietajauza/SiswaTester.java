//Driver class
import java.util.Scanner;

public class Siswatester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("inputkan Nama Siswa");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK");
        double ipk = input.nextDouble();

        Siswa reno = new Siswa (id, nama, ipk);
        reno.print();
        // object
        // Class object = new constructor
        Siswa gilam = new Siswa();
        Siswa azam = new Siswa();
        Siswa nibras = new Siswa();
        Siswa gus = new Siswa();
        Siswa moreno = new Siswa();
        Siswa tegar = new Siswa();

        gilam.id = 19;
        gilam.nama = "gilam";
        gilam.ipk = 100;
                
        azam.id = 22;
        azam.nama = "azzam";
        azam.ipk = 100;

        nibras.id = 29;
        nibras.nama = "ibra";
        nibras.ipk = 100;
        
        gus.id = 26;
        gus.nama = "burhan";
        gus.ipk = 3;

        moreno.id = 24;
        moreno.nama = "moreno";
        moreno.ipk = 0;

        tegar.id = 16;
        tegar.nama = "tegar";
        tegar.ipk =4;
        
        System.out.println("nama : "+gilam.nama);        
        System.out.println("nomor absen : "+gilam.id);
        System.out.println("nilai : "+gilam.ipk);

        System.out.println("nama : "+azam.nama);
        System.out.println("nomor absen : "+azam.id);
        System.out.println("nilai : "+azam.ipk);

        System.out.println("nama : "+nibras.nama);
        System.out.println("nomor absen : "+nibras.id);
        System.out.println("nilai : "+nibras.ipk);

        System.out.println("nama : "+gus.nama);
        System.out.println("nomor absen : "+gus.id);
        System.out.println("nilai : "+gus.ipk);

        System.out.println("nama : "+moreno.nama);
        System.out.println("nomor absen : "+moreno.id);
        System.out.println("nilai : "+moreno.ipk);
        
        System.out.println("nama : "+tegar.nama);
        System.out.println("nomor absen : "+tegar.id);
        System.out.println("nilai : "+tegar.ipk);

        input.close();
        
    }
}