import java.util.Scanner;
import java.util.Random;

/**
 * task1
 */
public class task1 {
static void a()
{
    System.out.println("Guess a number between 1 to 100\nyou have 5 chances");
}


    public static void main(String[] args) {

//genarating random no
       Random rand =new Random();
       int grand=rand.nextInt(100);
       //System.out.println(grand);
       //asking use to guess
       a();
       //System.out.println("generated no is "+grand);
       Scanner myobj= new Scanner(System.in);
       //int uinput;
       //int uinput=myobj.nextInt();
       boolean equel=false;
       int count=5;
       while(count>0){

        int uinput=myobj.nextInt();
        if(uinput==grand)
        {
            System.out.println("your guess is correct");
            equel=true;
            break;
        }
        else if(uinput>grand)
        {
            System.out.println("your guess is higher then generated number --- "+(count-1)+" tires left");
            System.out.println("should guess lower");
            count--;
        }
        else if(uinput<grand)
        {
            System.out.println("your guess is lower then generated number --- "+(count-1)+" tires left");
            System.out.println("should guess higher");  
            count--;
        }
          //uinput=myobj.nextInt();
       }
       if(equel==false){
        System.out.println("so,you have no more tries left");
        System.out.println("generated number is "+grand);
       }

    }
}
