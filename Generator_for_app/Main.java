//Author: Kendall Carr and Jeanette Eldredge
import java.util.Scanner;

public class Main {
  public static int points = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("school, home or outside?");
    String choice = input.nextLine();
    Generator g1 = new Generator();
    g1.generate(choice);
    boolean loopOrQuit = false;

    while (loopOrQuit == false) {
      String pointNoPoint = "";
      System.out.println("(new) word, (check)mark or (quit)");
  
      while(!input.hasNextLine());
      if(input.hasNextLine())
      {
        pointNoPoint = input.next();
      }
      if (pointNoPoint.equalsIgnoreCase("check")) {
        points += 1;
        g1.generate(pointNoPoint);
      } else if (pointNoPoint.equalsIgnoreCase("new")) {
        g1.generate(pointNoPoint);
      } else {
        loopOrQuit = true;
      }
      
    }
    System.out.println(points);
    input.close();
  }
}
