/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author A.basit
 */
public class guessBirthDay {
    public  guessBirthDay() throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************************************************************");    
        System.out.println("\t\t WELL COME TO BIRTHDAY GUESS WORLD");
        System.out.println("********************************************************************************");

            for (int o = 0; o < 100; o++)
            {

                System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t ~**PRESS 1 FOR READ THE RULES OF THIS GAME**~");
                System.out.println("\t\t       ~**PRESS 2 FOR PLAY THE GAME**~        ");
                System.out.println("\t\t~**PRESS 3 FOR QUIT THE GAME AND BACK TO MAIN MENU**~");
                System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\n\t\t\t  ***~ INPUT YOUR CHOICE ~***             ");

                int choicer = sc.nextInt(); // choice of user suffix
            switch (choicer) {
                case 1:
                    RULES();
                    break;
                case 2:
                    FUNC();
                    break;
                case 3:
                  
                    Menu m = new Menu();
                    m.menu();
                    break;
                default:
                    System.out.println("~** YOH HAVE PRESSESD THE WRONG NUMBER PLEASE RE-ENTER YOUR CHOICE **~");
                    break;
            // if end choicer suffix
            }


            }
     
    }
        public void FUNC()
        {
        int date =0;
        int answer;
        
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
        System.out.println("Is your birthday in Set" + (i + 1) + "?");
        
        for(int j=0;j<4;j++)
        {
        for(int k=0;k<4;k++)
        
        {
        System.out.print(birth_date.getValue(i, k, j) + " ");
        }
        
        System.out.println();
        
        
        }
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        
        if (answer == 1)
        
            date += birth_date.getValue(i, 0, 0);

        
 
        
        }
          System.out.println("Your birthday is " + date);
    }
        public void RULES()
        {
            System.out.println("****************************************************");
            System.out.println("* 1)       YOUR ENTER 0 OR 1                       *");
            System.out.println("* 2)   IT GOVE A FIVE SETS                         *");
            System.out.println("* 4) IF YOUR BIRTHDATE IN THE SET PRESS 1 ELSE 0   *");
            System.out.println("****************************************************");
        }
    
   
}
