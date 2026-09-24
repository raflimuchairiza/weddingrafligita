import java.util.Scanner;

public class Undangannikah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPria;
        String namaWanita;
        String tanggal;
        String waktu;
        String tempat;

        System.out.println("======================================");
        System.out.println("        UNDANGAN PERNIKAHAN");
        System.out.println("======================================");

        System.out.print("Nama mempelai pria   : ");
        namaPria = input.nextLine();

        System.out.print("Nama mempelai wanita : ");
        namaWanita = input.nextLine();

        System.out.print("Tanggal pernikahan   : ");
        tanggal = input.nextLine();

        System.out.print("Waktu acara          : ");
        waktu = input.nextLine();

        System.out.print("Tempat acara         : ");
        tempat = input.nextLine();

        System.out.println("\n");
        System.out.println("======================================");
        System.out.println("          UNDANGAN PERNIKAHAN");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Dengan memohon rahmat dan ridho");
        System.out.println("Tuhan Yang Maha Esa,");
        System.out.println("kami bermaksud mengundang");
        System.out.println("Bapak/Ibu/Saudara untuk hadir");
        System.out.println("dalam acara pernikahan kami.");
        System.out.println();
        System.out.println("        " + namaPria);
        System.out.println("              &");
        System.out.println("        " + namaWanita);
        System.out.println();
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Waktu   : " + waktu);
        System.out.println("Tempat  : " + tempat);
        System.out.println();
        System.out.println("Merupakan suatu kehormatan bagi kami");
        System.out.println("apabila Bapak/Ibu/Saudara berkenan hadir.");
        System.out.println();
        System.out.println("       Terima kasih atas doa");
        System.out.println("          dan kehadirannya.");
        System.out.println("======================================");

        input.close();
    }
}