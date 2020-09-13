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
public class removeduplication {
    public static void main(String args[]){
         Scanner obj=new Scanner(System.in);
         System.out.println("enter the string");
          String s1=""; 
         String str=obj.next();
              System.out.println("entered string "+str);
         char c[]=str.toCharArray();
         boolean flag;
         for(int i=0;i<str.length();i++)
         {
             flag=false;
             for(int j=i+1;j<str.length();j++)
             {
                 if(c[i]==c[j])
                 {
                 flag=true;
                 break;
                 }
                 
             }
             if(!flag)
             {
                 s1+=c[i];
             }
         }
         System.out.print(s1);
    }
    
}
