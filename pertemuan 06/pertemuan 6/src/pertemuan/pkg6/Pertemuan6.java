package pertemuan.pkg6;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class Pertemuan6 {

    public static void main(String[] args) {

        //    boolean a = 10 == 20;
        //    System.out.println(a);

        //    String a = "Yo";
        //    String b = "di";
        //    String z = a + b;
        //boolean test = z.equals(a+b);
        //System.out.println(test);

        //int a = 1, b = 2, c = 0;
        //String c;
        //c = (a<b) ? "Eren Rumbling" : "Mikasa Kuat";
        //        System.out.println("hasil c: "+c);
        //    }

        //int a = 5;
        //String status;
        //switch (a){
        //case 1: status = "Armin cerdas"; break;
        //case 2: status = "Mikasa kuat"; break;
        //case 3: status = "Eren Rumbling"; break;
        //default: status = "Benar semua";
        //}
        //        System.out.println("Status: "+ status);
        //}

//Scanner input = new Scanner(System.in).useLocale(Locale.UK);
//        String color;
//        double code = 0;
//        System.out.println("Enter a color code");    
//        code = input.nextDouble();
//        if(code >= 380 && code <= 450)
//        color = "The color is Violet";
//        else if(code >= 451 && code <= 495)
//        color = "The color is Blue";
//        else if(code >= 496 && code <= 570)
//        color = "The color is Green";
//        else if(code >= 571 && code <= 590)
//        color = "The color is Yellow";
//        else if(code >= 591 && code <= 620)
//        color = "The color is Orange";
//        else if(code >= 621 && code <= 750)
//        color = "The color is Red";
//        else
//        color = "The entered wavelength is not a part of the visible spectrum";
//
//        System.out.println(color);
//    }

Scanner input = new Scanner(System.in)
        String traffic;
        int code = 0;
        System.out.println("Enter a color code");    
        code = input.nextInt();
        
        if(code == 1)
        traffic = "Next Traffic Light is green";
        else if(code == 2)
        traffic = "Next Traffic Light is yellow";
        else if(code == 3)
        traffic = "Next Traffic Light is red";
        else
        traffic = "Invalid color";
        System.out.println(traffic);
}
}

