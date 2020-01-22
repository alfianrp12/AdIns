/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfian R P
 */
import java.util.Scanner;
public class AdInsSoal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int y=0, z=0;
        for (int i=1; i<=5; i++){
            System.out.print("Input : ");
            int x = in.nextInt();
            if (x==1){
                y++;
                if (y%2==1){
                    System.out.println("Output : Putih");
                } else {
                    System.out.println("Output : Kuning");
                }
            } else if (x==0){
                z++;
                if (z%2==1){
                    System.out.println("Output : Kuning");
                } else {
                    System.out.println("Output : Putih");
                }
            } else {
                System.out.println("Output : Wrong input");
            }
        }
    }
}
