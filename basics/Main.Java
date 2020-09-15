import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{


  public static void main(String[] args){

    String name = pluralize("hi", 1);
    System.out.println(name);

    int n = 5;
    int flipped = flipNHeads(n);
    System.out.println("It took " + flipped + " flips to flip " + n + " heads in a row.");

    clock();
  }

  //-----------------------------------------------------
  public static String pluralize(String noun, int num){
    if(num == 1){
      return noun;
    }

    noun = noun + "s";
    return noun;
  }

  //-----------------------------------------------------
  public static int flipNHeads(int num){
    int timesFlipped = 0;
    int inARow = 0;
    
    while(num > inARow){

      int flip = (Math.random() >= 0.5) ? 0 : 1;

      if(flip == 0){
        System.out.println("heads");
        inARow++;
        timesFlipped++;
      }else{
        System.out.println("tails");
        inARow = 0;
        timesFlipped++;
      }     
    }
    return timesFlipped;   
  }
  //---------------------------------------------------

  public static void clock(){
    int num = 0;
    LocalDateTime potatoTime = LocalDateTime.now();
    String time = potatoTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    String newTime = potatoTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    while(num == 0){
      potatoTime = LocalDateTime.now();
      newTime = potatoTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

      if(!time.equals(newTime)){
        time = potatoTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }
  }

}


