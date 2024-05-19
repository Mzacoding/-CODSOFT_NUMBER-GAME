
package numbergame;

import java.util.Random;
import javax.swing.JOptionPane;


public class NUMBERGAME {

   
    public static void main(String[] args) {
       
        Random randomizer=new  Random();
        
        int GuessAttempts=10;
        int min=1,max=100;
      
        int userScore=0,GuesseTaken=0;
        
          int answer;
        
        do{
      
          
       
       for(int i=0;i<GuessAttempts;i++)
       {
       
       int RandomNum=randomizer.nextInt(max-min+1)+min;
       
      
       int  guessNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Guess The Random Number ")); 
       
        if(guessNumber==RandomNum)
        {
          JOptionPane.showMessageDialog(null,"Guess Number is Correct");
          userScore+=1;
        }
        else if(guessNumber>RandomNum)
        {
          JOptionPane.showMessageDialog(null,"Guess Number is Too High,");
        }
        
        else
        {
        JOptionPane.showMessageDialog(null,"Guess Number is Too Low");
        }
       
       GuesseTaken++;
        
       }
       
       answer=JOptionPane.showConfirmDialog(null,"Do you want to Guess  Again","Guess Again?",JOptionPane.YES_NO_OPTION);
       
        }while(answer==JOptionPane.YES_OPTION);
        
        JOptionPane.showMessageDialog(null,"Your Score For The Guess Taken is "+userScore+"/"+GuesseTaken);
        
    }
    
}
