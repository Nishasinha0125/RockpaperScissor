import java.util.Scanner;
import java.util.Random;

public class rockpaper {
 public static void main(String[] args) {
    System.out.print("Enter 0 for rock,1 for paper,2 for scissor:");
    Scanner sc=new Scanner(System.in);
    int humanInput=sc.nextInt();

    if(humanInput<=2){
        System.out.println("Game Starts");
        Random random=new Random();
    int compInput=random.nextInt(3);

    if(humanInput==compInput){
        System.out.println("Game Draw");
    }else if(humanInput==0 && compInput==2 || humanInput==1 && compInput==0 || humanInput==2 && compInput==1){
        System.out.println("You Won");
    }
    else{
        System.out.println("computer wins");
    }
    System.out.println("comp choice:"+ compInput);
}
    else{
        System.out.println("Invalid Input");
    }
 }   
}
