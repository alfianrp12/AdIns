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
public class AdInsSoal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input : ");
        int x = in.nextInt();
        for (int i=1; i<=x; i++){
            for (int j=4; j>=i; j--){
                System.out.print(' ');
            }
            for (int k=1; k<=i; k++){
                System.out.print('*');
            }
            for (int l=1; l<=i-1; l++){
               System.out.print('*');
            }
            System.out.println();
        }
    }
}
