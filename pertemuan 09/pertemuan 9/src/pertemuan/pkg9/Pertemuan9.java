package pertemuan.pkg9;
import java.util.Scanner;
public class Pertemuan9 {

    public static void main(String[] args) {
//    int ValidPin = 1310;
//    System.out.println("Please Enter PIN!");
//    Scanner sc = new Scanner(System.in);
//  
//    int pin = sc.nextInt();
//    while(pin != ValidPin)
//        {
//        System.out.println("Please Enter a valid PIN");
//        pin = sc.nextInt();
//        }
//System.out.println("You've entered the correct PIN. Congrats! You can access your account.");

//    System.out.print("Choose a Number:");
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//
//    for(int i=1;i<=12;i++)
//        {
//        System.out.println(num + "*" + i + " = " + num*i);
//        }

int s;
shape obj=new shape();
Scanner sc=new Scanner(System.in);
System.out.println("1. Create Rectangle");
System.out.println("2. Create Triangle");
System.out.println("Masukkan pilihanmu");
s=sc.nextInt();
switch(s)
{
case 1:
int p,l;
do{
System.out.println("Masukkan panjang");
p=sc.nextInt();
System.out.println("Masukkan lebar");
l=sc.nextInt();
}while(p<1 || l<1);
obj.createRectangle(p,l);
break;
case 2:
int t;
do{
System.out.println("Masukkan tinggi");
t=sc.nextInt();
}while(t<1);
obj.createTriangle(t);
break;
default:
System.out.println("Pilihan tidak valid");
break;
}
    }
}