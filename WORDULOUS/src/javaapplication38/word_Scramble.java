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
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author s
 */
public class word_Scramble implements mainInterface{
    
       static int score=0,tScore=0;
    static Date d;
   static String name;

    public  word_Scramble () throws FileNotFoundException
            {
                Scanner sc = new Scanner(System.in);
        System.out.println("********************************************************************************");    
        System.out.println("\t\t WELL COME TO THE SCRAMBLING WORDY WORLD");
        System.out.println("********************************************************************************");

        System.out.println("ENTER YOUR NAME");
        name = sc.next();
        
            for (int o = 0; o < 100; o++)
            {

                System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t\t ~**PRESS 1 FOR READ THE RULES OF THIS GAME*       *~");
                System.out.println("\t\t       ~**PRESS 2 FOR PLAY THE GAME**~              ");
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
   public void startGame() throws FileNotFoundException 
   {
       FUNC();
       
   }
    @Override
    public void RULES()
    {
          System.out.println("***********************************************************");
          System.out.println("* 1)    THERE ARE 4 LEVELS OF THIS GAME                   *");
          System.out.println("* 2)  IN EACH LEVEL YOU HAVE A SHUFFLE WORDS              *");
          System.out.println("* 3) YOU HAVE 5 CHANCES TO GUESS THE WORD                 *");
          System.out.println("* 4) AFTER 5 WRONG GUESSES GAME WILL OVER                 *");
          System.out.println("***********************************************************");
    }
    
    @Override
    public void FUNC() throws FileNotFoundException {
        for (int k = 1; k <= 5; k++)
            {
                if (k == 1)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~"+ k);
              
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_1();
                        
                    }
                    
                }
                if (k == 2)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~"+k);
                    
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_2();
                    }
                   
                }
                if (k == 3)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~" + k);
                   
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_3();
                 
                    }
                    
                }

                if (k == 4)
                {
                    System.out.println("\t\t\t   ~** THIS IS LEVEL **~" + k);
                  
                    for (int i = 0; i <= 3; i++)
                    {
                        LEVEL_4();
                    }
                   
                }
            
            }
    }
    public void LEVEL_1() throws FileNotFoundException
        {
             
            Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\scramble\\LEVEL_1.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(13);
            String wordj = "";
            wordj = word[wordNumber];
            getWord(wordj);
            
        }
    public void LEVEL_2() throws FileNotFoundException
        {
             
            
            Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\scramble\\LEVEL_2.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(13);
            String wordj = "";
            wordj = word[wordNumber];
            getWord(wordj);
            
        }
     public void LEVEL_3() throws FileNotFoundException
        {
             
            
            Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\scramble\\LEVEL_3.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(13);
            String wordj = "";
            wordj = word[wordNumber];
            getWord(wordj);
            
        }
      public void LEVEL_4() throws FileNotFoundException
        {
             
            
            Scanner se= new Scanner(System.in);
            java.io.File sr = new java.io.File("D:\\wordy_world\\scramble\\LEVEL_4.txt");
            Scanner file= new Scanner(sr);
            String input = file.nextLine();
            String[] word=input.split(",");
            Random number = new Random();
            int wordNumber = number.nextInt(13);
            String wordj = "";
            wordj = word[wordNumber];
            getWord(wordj);
            
        }
     // Shuffle the original word by randomly swapping characters 10 times
     
    
    public void getWord(String wordj) throws FileNotFoundException
    {
            Scanner sn = new Scanner(System.in);
             int numberOfGuesses = 0;
             //String original =getWord();
             String shuffled = getShuffledWord(wordj);
             boolean gameOn = true;
             while(gameOn) {
             System.out.println("\n~***Shuffled word is***~ \t:"+shuffled);
             numberOfGuesses++;
             if(numberOfGuesses>5)
             {
                  System.out.println("your score is "+ score(numberOfGuesses));
                scoring();
                 System.out.println("GAME OVER!");
                 tScore =0;
                 score =0;
                  Menu m = new Menu();
                  m.menu();
             }
            
                 
             System.out.println("\n~***Please type in the original word***~: ");
             String userGuess= sn.nextLine();
             
             if(wordj.equalsIgnoreCase(userGuess)) {
                System.out.println("~***Congratulations! You found the word in "+numberOfGuesses+"\t"+ "guesses***~");
                
                
               // score(numberOfGuesses);
                 System.out.println("your score is "+ score(numberOfGuesses));
                  numberOfGuesses = 0;
                gameOn = false;
            }else {
               
                
                System.out.println("\n***Sorry, Wrong answer| ***");
              
            }
        }        
          
    }
    public String getShuffledWord(String original) {
        String shuffledWord = original; // start with original
        int wordSize = original.length();
        int shuffleCount = 10; // let us randomly shuffle letters 10 times
        for(int i=0;i<shuffleCount;i++) {
            //swap letters in two indexes
            int position1 = ThreadLocalRandom.current().nextInt(0, wordSize);
            int position2 = ThreadLocalRandom.current().nextInt(0, wordSize);
            shuffledWord = swapCharacters(shuffledWord,position1,position2);
        }
        return shuffledWord;
    }

    /**
     * Swaps characters in a string using the given character positions
     * @param shuffledWord
     * @param position1
     * @param position2
     * @return 
     */
    private String swapCharacters(String shuffledWord, int position1, int position2) {
        char[] charArray = shuffledWord.toCharArray();
        // Replace with a "swap" function, if desired:
        char temp = charArray[position1];
        charArray[position1] = charArray[position2];
        charArray[position2] = temp;
        return new String(charArray);
    }
    
    public static int  score(int chances)
{
 
        switch (chances)
        {
           
            
            
            case 1: score = 50; break;
            case 2: score = 40; break;
            case 3: score = 30; break;
            case 4: score = 20; break;
            case 5: score = 10; break;
            case 6: score =0;break;
         
           
           

        }
         tScore += score;
        return tScore; 
        
    

}

public static void scoring() throws FileNotFoundException
{

            File file = new File("D:\\wordy_world\\scramble\\scoring.txt");

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
    

