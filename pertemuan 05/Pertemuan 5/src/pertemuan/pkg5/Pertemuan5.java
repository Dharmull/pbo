
package pertemuan.pkg5;
import java.util.Random;
import java.util.Scanner;
public class Pertemuan5 {
    
    public static void main(String[] args) {
//       String nama = "Dharma Mull";
//       int panjangNama = nama.length();
//       System.out.println("Panjang Karakter Nama: "+panjangNama);

//metode indexOf -> cari nomor index pada karakter
//String ind = "belajar.pbo 123";
//int idx1 = ind.indexOf('a');
//        System.out.println("nomor index huruf a: "+idx1);
//int idx2 = ind.indexOf('1',5);
//        System.out.println("titik dari index ke 4: "+idx2);

//metode charAt() -> untuk tampil isi dari karakter index yg dimskkan
//    char hurufnya = nama.charAt(3);
//    System.out.println("isi dari karakter index ke 3: "+hurufnya);

//metode substring() -> untuk menghasilkan substring (bagian kata) dari sebuah string
//String tampung = nama.substring(7);
//System.out.println("isi dari substring idx no 5 hingga selesai: "+tampung);
//String tampung2 = nama.substring(0,7);
//System.out.println("isi dari substring idx 0 hingga 7: "+tampung2);

//metode replace() -> ganti string tertentu dalam kata
//String ganti = nama.replace('l', 'L');
//    System.out.println("Hasil ganti huruf: "+ganti); //hasilnya Dharma MuLL
//String ganti2 = nama.replace("Mull", "cerdas lho");
//    System.out.println("Hasil ganti pattern: "+ganti2);

//nama = "cerdas sekali";
//    System.out.println("isi nama: "+nama);
//String namaSaya = "dharma"+"cerdas"+"sekali";
//    System.out.println("isi nama saya: "+namaSaya);
//
//String satu = "satu1 ", dua = "dua2 ", tiga = "tiga3";
//String gabungan = "ini gabungan ";
//gabungan = gabungan.concat(satu+dua+tiga);
//    System.out.println("isi gabungan: "+gabungan);

//String myString = "World of";
//myString = myString.concat(" Teyvat");
//    System.out.println(myString);

//int a = 5, b = 7;
//boolean c = a == b;
//    System.out.println("hasil perbandingan a dan b: "+ c);

//int c = "bebeke".compareTo("bebek");
//    System.out.println("hasil perbandingan: "+ c);
//    }
    Random acak = new Random();
//int nilaiacak = acak.nextInt(10);
//System.out.println("nilai acak max(10): "+nilaiacak);

//int nilaiacakTertentu = acak.nextInt(6)+ 5;
//System.out.println("nilai acak dari 5-10: "+ nilaiacakTertentu);

Scanner numberScanner = new Scanner(System.in);
System.out.print("Enter a number between 1 to 10: ");
int userNum = numberScanner.nextInt();
Random rnd = new Random();
int winningNum = rnd.nextInt(10)+1;
System.out.println("Your Number: "+ userNum);
System.out.println("The winning number is: "+winningNum);
if (userNum == winningNum){
    System.out.println("SELAMAT ANDA MENANG!!");
} else {
System.out.println("Anda belum lucky, try again later!");
}

}
