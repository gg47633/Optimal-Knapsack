import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {

  public static void main(String[] args) throws IOException {
    String smallLocation = "src/SmallKnapsacks/";
    String mediumLocation = "src/MediumKnapsacks";
    String largeLocation = "src/LargeKnapsacks";
    double[] bottomTime = new double[30];
    double[] topTime = new double[30];

    //Small Knapsacks
    for(int i = 0; i < 30; i++) {
      bottomTime[i] = BottomUp.bottomUp(smallLocation + "smallKnap" + (i+1));
    }
    //Write small knapsack results to file
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt"))) {
      writer.write("Times for small knapsacks:\n");
      writer.write("   Bottom Up: ");
      for(int i = 0; i < 30; i++) {
        writer.write(bottomTime[i] + " ");
      }
      writer.write("\n   Top Down: ");
      for(int i = 0; i< 30; i++) {
        writer.write(topTime[i] + " ");
      }
      writer.write("\n");
    }
  }
}
