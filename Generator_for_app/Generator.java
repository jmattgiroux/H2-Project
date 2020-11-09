//Author: Jeanette Eldredge

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    // Declaration of Arrays
    public static ArrayList<String> SchoolWords = new ArrayList<String>();
    public static ArrayList<String> HomeWords = new ArrayList<String>();
    public static ArrayList<String> OutsideWords = new ArrayList<String>();
    public static String input;
    public static String previousInput;

    public Generator() {
    input = "";
    fillInLists();   
    }

    public static void generate(String input) {
    Random rand = new Random();
    // The random generator does number 0 - the limit so saying that
    // the lim is 6 will generate a number out of 7 numbers.
    // This will need to be changed for bigger lists.
    int item = rand.nextInt(6);
    boolean NWorCHK = false;
    if((input.equals("new")) || input.equals("check"))
    {
        NWorCHK = true;
        input = previousInput;
    }

    if (input.equals("school")) {
        System.out.println(SchoolWords.get(item));
    }

    else if (input.equals("home")) {
        System.out.println(HomeWords.get(item));
    }

    else if (input.equals("outside")) {
        System.out.println(OutsideWords.get(item));
    }

    if(NWorCHK == false)
    {
        previousInput = input;
    }
    }

    public static void fillInLists() {
    // This is for beginning test.
    SchoolWords.add("Desk");
    SchoolWords.add("Pencil");
    SchoolWords.add("Crayons");
    SchoolWords.add("Binder");
    SchoolWords.add("Backpack");
    SchoolWords.add("School logo");
    SchoolWords.add("TextBook");

    HomeWords.add("Couch");
    HomeWords.add("Bed");
    HomeWords.add("Night Light");
    HomeWords.add("Spoon");
    HomeWords.add("Bowl");
    HomeWords.add("Cereal");
    HomeWords.add("Sink");

    OutsideWords.add("Pine Tree");
    OutsideWords.add("Rock");
    OutsideWords.add("Cars");
    OutsideWords.add("Water");
    OutsideWords.add("Clouds");
    OutsideWords.add("Grass");
    OutsideWords.add("Mountain");

    // If we want to use file lists this will be the code and we need
    // To add the relative path.
    /*
        * Path list1 = Paths.get(); Path list2 = Paths.get(); Path list3 = Paths.get();
        * 
        * Scanner schoollist = new Scanner(new File(list1.toString()));
        * while(schoollist.hasNext()){ SchoolWords.add(schoollist.next()); }
        * schoollist.close();
        * 
        * Scanner homelist = new Scanner(new File(list2.toString()));
        * while(homelist.hasNext()){ HomeWords.add(homelist.next()); }
        * homelist.close();
        * 
        * Scanner outsidelist = new Scanner(new File(list3.toString()));
        * while(outsidelist.hasNext()){ OutsideWords.add(outsidelist.next()); }
        * outsidelist.close();
        */
    }
}