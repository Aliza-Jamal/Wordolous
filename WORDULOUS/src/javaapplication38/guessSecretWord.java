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
public class guessSecretWord extends LEVELS implements mainInterface
{
    static int rem,chances;
   static int score=0,tScore=0;
    static Date d;
    
    
    static String name;
  
    
    
    Scanner sc = new Scanner(System.in);
    public guessSecretWord () throws FileNotFoundException
    {
             System.out.println("********************************************************************************");
             System.out.println("\t\t WELL COME TO GUESS THE SECRET WORDS");
             System.out.println("********************************************************************************");

             System.out.println("PLEASE ENTER YOUR NAME");
             name = sc.next();


            for (int o = 0; o < 100; o++)
            {

                 System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 System.out.println("\t\t ~**PRESS 1 FOR READ THE RULES OF THIS GAME**~");
                 System.out.println("\t\t       ~**PRESS 2 FOR PLAY THE GAME**~        ");
                 System.out.println("\t\t~**PRESS 3 FOR QUIT THE GAME AND BACK TO MAIN MENU**~");
                 System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("\n\t\t\t  ***~ INPUT YOUR CHOICE ~***             ");

               // int choice = int.Parse(Console.ReadLine());
            int choice = sc.nextInt();
         switch (choice) {
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
         }
    
    
    
    }
         
            
    }
    
    @Override
        public  void RULES()
             {
             
               System.out.println("********************************************************************************");
                              System.out.println("\t\t RULES OF THE GAME");
                    System.out.println("********************************************************************************");
                    System.out.println("**************************************************************************");
                    System.out.println("** 1- THERE ARE 5 LEVELS OF THE GAME                                    **");
                    System.out.println("** 2- IN EACH LEVEL YOU WILL HAVE A NEW CATEGORY OF WORDS               **");
                    System.out.println("** 3- IN EACH LEVEL THERE WILL BE FIVE ROUNDS                           **");
                    System.out.println("** 4- IN EACH ROUND YOU WILL FACE A HIDDEN WORD WHICH YOU HAVE TO GUESS **");
                    System.out.println("** 5- YOU WILL HAVE CHANCES ACCORDING TO THE LENGHT OF THE WORDS        **");
                    System.out.println("** 6- DONT ENTER REPEATED CHARACHTERS                                   **");
                    System.out.println("** 7- IF YOU DID SO YOUR CHANCES WILL DECREASE                          **");
                    System.out.println("**************************************************************************");
             
             }
        
        
    @Override
        public void FUNC() throws FileNotFoundException 
                // functonality
        {
        
        for (int i = 1; i <= 5; i++)
                    {
                        System.out.println("level-"+ i);
                        {


                            if (i == 1)
                            {
                                LEVEL_1();

                            }
                            if (i == 2)
                            {
                                LEVEL_2();

                            }
                            if (i == 3)
                            {
                                LEVEL_3();

                            }
                            if (i == 4)
                            {
                                LEVEL_4();
                            }
                            if (i == 5)
                            {
                                LEVEL_5();
                            }



                        }
                    }
        
        }
    
    @Override
     public void LEVEL_1() throws FileNotFoundException
        {
 
            java.io.File sa = new java.io.File("D:\\wordy_world\\guess_the_word\\level_1.txt");   // level_1 file
            Scanner file = new Scanner(sa);
            
            String a = file.nextLine();
            String[] level1 = a.split(" ");



            for (int i = 0; i < 5; i++)
            {

                Random num = new Random();
                int word_ind = num.nextInt(30);    // rendomly selected word number
                String word = level1[word_ind];      // randomly selected

                System.out.println("GUESS THE GIVEN ANIMALS NAME");

                {
                    GUESS(word);
                }

            }
            file.close();
        }

    @Override
        public void LEVEL_2() throws FileNotFoundException
        {
java.io.File sb = new java.io.File("D:\\wordy_world\\guess_the_word\\level_2.txt");   // level_1 file
            Scanner file = new Scanner(sb);
            
            String b = file.nextLine();
            String[] level2 = b.split(" ");



            for (int i = 0; i < 5; i++)
            {

                Random num = new Random();
                int word_ind = num.nextInt(34);    // rendomly selected word number
                String word = level2[word_ind];      // randomly selected

                System.out.println("GUESS THE GIVEN FRUIT OR VEGETABLE NAME");

                {
                    GUESS(word);
                }

            }
            file.close();


        }


    @Override
        public  void LEVEL_3() throws FileNotFoundException
        {

             java.io.File sc = new java.io.File("D:\\wordy_world\\guess_the_word\\level_3.txt");   // level_1 file
            Scanner file = new Scanner(sc);
            
            String c = file.nextLine();
            String[] level3 = c.split(" ");



            for (int i = 0; i < 5; i++)
            {

                Random num = new Random();
                int word_ind = num.nextInt(30);    // rendomly selected word number
                String word = level3[word_ind];      // randomly selected

                System.out.println("GUESS THE GIVEN CITY NAME");

                {
                    GUESS(word);
                }

            }
            file.close();

        }

    @Override
        public  void LEVEL_4() throws FileNotFoundException
        {

             java.io.File sd = new java.io.File("D:\\wordy_world\\guess_the_word\\level_4.txt");   // level_1 file
            Scanner file = new Scanner(sd);
            
            String d = file.nextLine();
            String[] level4 = d.split(" ");



            for (int i = 0; i < 5; i++)
            {

                Random num = new Random();
                int word_ind = num.nextInt(30);    // rendomly selected word number
                String word = level4[word_ind];      // randomly selected

                System.out.println("GUESS THE GIVEN COUNTRY NAME");

                {
                    GUESS(word);
                }

            }
            file.close();
        }
        public  void LEVEL_5() throws FileNotFoundException
        {

            java.io.File se = new java.io.File("D:\\wordy_world\\guess_the_word\\level_5.txt");   // level_1 file
            Scanner file = new Scanner(se);
            
            String e = file.nextLine();
            String[] level5 = e.split(" ");



            for (int i = 0; i < 5; i++)
            {

                Random num = new Random();
                int word_ind = num.nextInt(30);    // rendomly selected word number
                String word = level5[word_ind];      // randomly selected

                System.out.println("GUESS THE GIVEN BIRD NAME");

                {
                    GUESS(word);
                }

            }
            file.close();

        }

        public static void GUESS(String word) throws FileNotFoundException
        {


            char[] arr = BLANKS(word);       // get hidden letters

            rem = word.length();

            String input;             // player_guess

            Scanner sc = new Scanner(System.in);
            chances = word.length();
            String values = "";

            while (chances > 0 && rem > 0)
            {
                DISPLAY(arr);    // display letters

                System.out.println("Enter a letter");
                
                
                input = sc.next();
                
                if(input.length()!=1)
                {
                System.out.println("please enter a single letter");
                
                }
                
                
              //  if (values.Contains(input))
              if (values.contains(input))
                {


                    chances--;
                    System.out.println("\t*** you have entered a repeated letter *** \n\t\t *** remaining chances={0} ***  "+ chances);
                    continue;
                }
                values += input;

                arr = CHECKER(input, word, arr);     // check user's guess
            }
            if (chances > 0)
            {
                System.out.println("Well done! you guessed the word.");
            System.out.println("your score is "+ score());
            //scoring();
            }
            else
            {
                System.out.println("your score is "+ score());
                scoring();
                 System.out.println("GAME OVER!");
                 tScore =0;
                 score =0;
                
              //  guessSecretWord g = new guessSecretWord();
                 Menu m=new Menu();
                m.menu();
            
            
              
            }




        }


        public static char[] BLANKS(String word)
        {
            char[] blanks = new char[word.length()];

            for (int i = 0; i < word.length(); i++)
            {
                blanks[i] = '-';
            }

            return blanks;
        }

        public static void DISPLAY(char[] arr)
        {
            for (char letter : arr)
            {
                System.out.print(letter);
            }
            System.out.println();
        }

      //  public static char[] CHECKER(char input, String word, char[] arr)
          public static char[] CHECKER(String input, String word, char[] arr)
        {

            if (word.contains(input))
            {
                for (int i = 0; i < word.length(); i++)
                {
                    if (word.charAt(i) == input.charAt(0))
                    {
                        arr[i] = word.charAt(i);
                        rem--;
                    }
                }
            }

            else
            {
                chances--;
                System.out.println("\t*** you have entered an incorrect letter *** \n\t\t *** remaining chances={0} ***  "+ chances);
            }

            return arr;
        } // end of secret word

public static int  score()
{
 
        switch (chances)
        {
           
             case 15: score = 150; break;
              case 14: score = 140; break;
               case 13: score = 130; break;
            case 12: score = 120; break;
            case 11: score = 110; break;   
             case 10: score = 100; break;
              case 9: score = 90; break;
               case 8: score = 80; break;
            case 7: score = 70; break;
            case 6: score = 60; break;   
            case 5: score = 50; break;
            case 4: score = 40; break;
            case 3: score = 30; break;
            case 2: score = 20; break;
            case 1: score = 10; break;
            case 0: score = 0;break;
           
           

        }
         tScore += score;
        return tScore; 
        
    

}

public static void scoring() throws FileNotFoundException
{

            File file = new File("D:\\wordy_world\\guess_the_word\\scoring.txt");

try{
    if(!file.exists()){
     
        file.createNewFile();
    }

    FileWriter f = new FileWriter(file, true);

    f.write("NAME\t\tSCORE\t\tDATE \n");
    
   
   
    
    BufferedWriter buff = new BufferedWriter(f);
    buff.newLine();
    buff.write("\n");
    buff.write("\n" +name +" \t\t" + tScore +"\t\t" + date()+ "\n");
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
    


