/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class integer {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the integer");
        String str=obj.next();
        char c[]=str.toCharArray();
        System.out.println("displaying each integers");
        for(int i:c)
        {
           System.out.println((char)i);
        }
           int sum=0;
         for(char j:c)
        {
          sum=sum+(j-48);
        }
        System.out.println("the sum of all integers::"+sum);
        
    }
    
}
