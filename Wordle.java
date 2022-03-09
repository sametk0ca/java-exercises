import java.util.Random; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class Wordle {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Samet\\Desktop\\dict.txt");
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(fr);
        Random rand = new Random();
        String [] words = new String[2317];
        for (int i = 0 ; i<2317 ; i++){
            words[i] = br.readLine();

        }
        int randomNumber = rand.nextInt(words.length);
        String keyword = words[randomNumber];
        
        for (int k=0 ; k < 6 ; k++ ){
            List<String> wordsList = new ArrayList<>(Arrays.asList(words));
            System.out.println("You have " + (6-k) +  " right to guess.Enter your guess : ");
            String guess= input.nextLine();

            if (guess.length() != 5) {
                System.out.println("Please type 5 letter word. Try Again.");
            }
           

            
            else if(keyword.contains(guess)) {
                
                System.out.println("CONGRATS!!!! You won!");
                
               
                break;
            }
                
            else if(wordsList.contains(guess)){
                
                for(int ch = 0 ; ch < 5 ; ch++){ 
                    
                    String letter = guess.substring(ch,ch+1) ;
                    if (guess.charAt(ch)==keyword.charAt(ch)){
                        System.out.println("For the letter " + (ch+1) + " Letter true , position true.");
                    }
                    else if (keyword.contains(letter)){
                        System.out.println("For the letter " + (ch+1) + " letter true position wrong.");
                    }
                     
                    else {
                        System.out.println("For the letter " + (ch+1) + "  letter does not exist.");
                
                    }
                }

            }
            else {
                System.out.println("Word does not exist in list");
            }
        }
        
        
        System.out.println("The word was : " + keyword);
        
    
        br.close();
    } 
}



              
            
        
    

