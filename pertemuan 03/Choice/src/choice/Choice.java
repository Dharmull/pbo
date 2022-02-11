/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package choice;
import javax.swing.*; 
import javax.swing.JOptionPane;

public class Choice {

    private static String Input2;

    public static void main(String[] args) {
    String[] acceptableValues = {"semangka", "jeruk", "apel","durian","mangga"};
              String buah= (String)JOptionPane.showInputDialog(null,"Kamus suka buah apa?","Buah Kesukaan",2,null,acceptableValues,acceptableValues[1]);
        JOptionPane.showMessageDialog(null,"Buah kesukaanmu "+buah,"Buah Kesukaan",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
