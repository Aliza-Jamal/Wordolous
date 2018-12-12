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
public class Menu {
  
   public void menu() throws FileNotFoundException 
    {
        Scanner sc = new Scanner(System.in);
       
         while (true) {
            System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t    ~** WELL COME TO THE WORDY WORLD **~        ");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n");
            System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t           ~** MAIN MENU **~        ");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t   ~** PRESS 1 FOR  GUESS YOUR BIRTHDAY  **~         ");
            System.out.println("\t\t   ~** PRESS 2 FOR PLAY PREFY SUFFY **~             ");
            System.out.println("\t\t   ~** PRESS 3 FOR PLAY GUESS THE SECRET WORDS **~  ");
            System.out.println("\t\t   ~** PRESS 4 FOR PLAY WORD SCRAMBLE GAME **~      ");
            System.out.println("\t\t   ~** PRESS 5 FOR QUIT THE GAME **~                ");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int CHOICE = sc.nextInt();
            switch (CHOICE) {
                case 1:
                     guessBirthDay b = new guessBirthDay();
                     break;
                case 2:
                     SUFFY S = new SUFFY();
                     
                    break;
                case 3:
                    
                     guessSecretWord g = new guessSecretWord();
                     break;
                case 4:
                    word_Scramble s= new word_Scramble();
                    s.startGame();
                    break;
                case 5:  
                    System.exit(0);
                    break;
                default:
                    System.out.println("~** YOH HAVE PRESSESD THE WRONG NUMBER PLEASE RE-ENTER YOUR CHOICE **~");
                    break;
            }
            continue;
        }

        
    }
}

