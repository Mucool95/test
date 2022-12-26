import java.util.*;

class GenerateNum{

  int generate(){
    Random rn = new Random();
    int value = rn.nextInt(50);
      return value;
  }

  void guess(){
    int num = generate();
    Scanner val = new Scanner(System.in);
    int flag = 0;
    for (int i=0;i<5;i++){
      System.out.println("Guess a number between 0 to 50");
      int dat = val.nextInt();
      if(dat == num){ System.out.println("You won");
          flag = 1;
            break;}
      else if(dat<num){ 
        System.out.println("You entered smaller number");
      }
      else {
        System.out.println("You entered a bigger number");
      }
      System.out.println("chances left"+(4-i));
    }
    if(flag==0)
    {System.out.println("You lost this game!! Try again");
     System.out.println("Number was : "+num);
    }}

}
public class GuessWord {
    public static void main(String[] args) 
    {   
       GenerateNum obj = new GenerateNum();
       obj.guess();


    }
    }
    

