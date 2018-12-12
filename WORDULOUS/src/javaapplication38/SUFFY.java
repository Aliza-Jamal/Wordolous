/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author A.basit
 */
public class SUFFY extends LEVELS implements mainInterface {
     static int score=0;
     static int wrong=0;
     static Date d;
     static String name;
    Scanner sc = new Scanner(System.in);
      
    public SUFFY() throws FileNotFoundException
            {
             
        System.out.println("********************************************************************************");    
        System.out.println("\t\t WELL COME TO SUFFY");
        System.out.println("********************************************************************************");
        System.out.println("ENTER YOUR NAME");
        name = sc.next();
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
         // Main closes suffix
            }
    @Override
        public void RULES()
        {
            System.out.println("******************************************************************************");
            System.out.println("* 1)    THERE ARE FOUR LEVELS IN THE GAME                                    *");
            System.out.println("* 2)   IN EACH LEVEL U FACES 3 SUFIXES                                       *");
            System.out.println("* 4)  YOU HAVE NO CHANCE TO MEANS IF U GIVE WRONG ANSWER THEN GAME OVER      *");
           System.out.println("*******************************************************************************");
        }// suffix RULES
  @Override
        public void FUNC() throws FileNotFoundException
        {
            for (int k = 1; k <= 5; k++)
            {
                if (k == 1)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~"+ k);
                    System.out.println("\t\t\t\t~**SUFFIX**~");
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_1();
                    }
                    
                }
                if (k == 2)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~"+k);
                    System.out.println("\t\t\t\t~**SUFFIX**~");
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_2();
                    }
                   
                }
                if (k == 3)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~" + k);
                    System.out.println("\t\t\t\t~**SUFFIX**~");
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_3();
                 
                    }
                    
                }

                if (k == 4)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~" + k);
                    System.out.println("\t\t\t\t~**SUFFIX**~");
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_4();
                    }
                   
                }

            } //FUNTSP END
        }
        
   @Override
        public void LEVEL_1() throws FileNotFoundException
        {
            
             Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\prefix_suffix\\2suf.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(30);
            String wordj = "";
            wordj = word[wordNumber];
            System.out.println("\n" + wordj);
            String word1 =se.nextLine();
            String r = word1;
           if ((wordj.charAt(wordj.length() - 1) != word1.charAt(word1.length() - 1)) || (wordj.charAt(wordj.length() - 2) != word1.charAt(word1.length() - 2)) || (word1.length()>2))
            {
               
                System.out.println(" *.* ");
                System.out.println("~** GAME OVER! **~");
                System.out.println("YOUR SCORE : "+ score);
                scoring();
                Menu m = new Menu();
                m.menu();
            }
            else 
         {
         
         score += 5;
         System.out.println("YOUR SCORE : "+ score);
         }
                 
              
      
        }// suffix fun Level2S
        
            
    @Override
        public void LEVEL_2() throws FileNotFoundException
        {
           
            Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\prefix_suffix\\3suf.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(40);
            String wordj = "";
            wordj = word[wordNumber];
            System.out.println("\n" + wordj);
            String word1 = se.nextLine();
            String r = word1;
      if ((wordj.charAt(wordj.length() - 1) != word1.charAt(word1.length() - 1)) || (wordj.charAt(wordj.length() - 2) != word1.charAt(word1.length() - 2)) || (wordj.charAt(wordj.length() - 3) != (word1.charAt(word1.length() - 3)) || (word1.length()>3)))
            {
                System.out.println(" *.* ");
                System.out.println("~** GAME OVER! **~");
                System.out.println("YOUR SCORE : "+ score);
                scoring();
                 Menu m = new Menu();
                 m.menu();
            }
       else 
         {
         
         score += 10;
          System.out.println("YOUR SCORE : "+ score);
         }
        } // suffix fun Level2S
   
       
    @Override
        public  void LEVEL_3() throws FileNotFoundException
        {
              Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\prefix_suffix\\4suf.txt");
             Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt( 50);
            String wordj = "";
            wordj = word[wordNumber];
            System.out.println("\n" + wordj);
            String word1 = se.nextLine();
            String r = word1;
           if ((wordj.charAt(wordj.length() - 1) != word1.charAt(word1.length() - 1)) || (wordj.charAt(wordj.length() - 2) != word1.charAt(word1.length() - 2)) || (wordj.charAt(wordj.length() - 3) != word1.charAt(word1.length() - 3)) || (wordj.charAt(wordj.length() - 4) != word1.charAt(word1.length() - 4)) || (word1.length()>4))
            {
               System.out.println(" *.* ");
                System.out.println("~** GAME OVER! **~");
                System.out.println("YOUR SCORE : "+ score);
                scoring();
                  Menu m = new Menu();
                  m.menu();
            }
            else 
         {
         
         score += 15;
          System.out.println("YOUR SCORE : "+ score);
         }
        } // suffix fun Level3S
   
        
    @Override
        public void LEVEL_4() throws FileNotFoundException
        {
              Scanner se= new Scanner(System.in);
           java.io.File sr = new java.io.File("D:\\wordy_world\\prefix_suffix\\5suf.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(29);
            String wordj = "";
            wordj = word[wordNumber];
             System.out.println("\n" + wordj);
            String word1 = se.nextLine();
            String r = word1;
            if ((wordj.charAt(wordj.length() - 1)!= word1.charAt(word1.length() - 1)) || (wordj.charAt(wordj.length() - 2) != word1.charAt(word1.length() - 2)) || (wordj.charAt(wordj.length() - 3) != word1.charAt(word1.length() - 3)) || (wordj.charAt(wordj.length() - 4) != word1.charAt(word1.length() - 4)) || (wordj.charAt(wordj.length() - 5) != word1.charAt(word1.length() - 5)) ||(word1.length()>5))
            {
                System.out.println(" *.* ");
                System.out.println("~** GAME OVER! **~");
                System.out.println("YOUR SCORE : "+ score);
                scoring();
                Menu m = new Menu();
                m.menu();
            }
             else 
         {
         
         score += 20;
          System.out.println("YOUR SCORE : "+ score);
         }
        } // suffix fun Level4S
   
       


public static void scoring() throws FileNotFoundException
{

            File file = new File("D:\\wordy_world\\prefix_suffix\\scoring.txt");

try{
    if(!file.exists()){
     
        file.createNewFile();
    }

    FileWriter f = new FileWriter(file, true);

    f.write("NAME\t\tSCORE\t\tDATE \n");
    
   
   
    
    BufferedWriter buff = new BufferedWriter(f);
    buff.newLine();
    buff.write("\n");
    buff.write("\n" +name +" \t\t" + score +"\t\t" + date()+ "\n");
    buff.newLine();
    buff.close();

   // System.out.println("Done");
} catch(IOException e) {
    System.out.println("COULD NOT LOG!!");
}
      
    
    }
    
public static  Date  date()
{

 d = new Date();

return d;

}
}
    


