/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg4;

import java.util.Random;

/**
 *
 * @author user
 */
class ComputeMethods {
    public double ftoC(double F){
        return (F - 32) *(5.0/9);
    }

    public double hypotenuse(int a,int b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int roll(){
        Random random = new Random();
        return random.nextInt(6)+ 1 + random.nextInt(6)+ 1;
    }
}
