package pertemuan.pkg4;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pertemuan4 {

    public static void main(String[] args) {
//    ComputeMethods computeMethods = new ComputeMethods();
//        System.out.println("Temp in celsius is "+ computeMethods.ftoC(100.4));
//        System.out.println("Hypotenuse is "+ computeMethods.hypotenuse(6,9));
//        System.out.println("The sum of the dice values is "+ computeMethods.roll());
//    }

    Scanner console = new Scanner(System.in);
    String nama = JOptionPane.showInputDialog(null, "Type Your Name:", "Name", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Your Name is: "+nama, "Name", JOptionPane.INFORMATION_MESSAGE);
}
