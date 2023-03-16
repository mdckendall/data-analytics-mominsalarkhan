import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fr = new FileReader("names.txt");
        Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    while (fileScanner.hasNextLine()) {
      arrayList.add(fileScanner.nextLine()); 
    }
    var quit = false;
    while(!quit){
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      
      
      switch(input.nextInt()){
        case 1: System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2: System.out.println("US News - 100 Best Jobs!");
          break;
        case 3: System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4: {
          System.out.println("Current Students:");
          for(var e: arrayList){
            System.out.println(e);
          }
          break;
        }
        default: {
          quit = true;
          break;
        }
      }
    }
    }
}