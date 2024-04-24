import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {

  public static void main(String[] args) throws IOException {
    String smallLocation = "src/SmallKnapsacks/";
    String mediumLocation = "src/MediumKnapsacks/";
    String largeLocation = "src/LargeKnapsacks/";
    String extremeLocation = "src/ExtremeKnapsacks/";
    double[] bottomTime = new double[30];
    double[] topTime = new double[30];

    //Small Knapsacks
    for (int i = 0; i < 30; i++) {
      bottomTime[i] = BottomUp.bottomUp(smallLocation + "smallKnap" + (i + 1));
      topTime[i] = TopDown.topDown(smallLocation + "smallKnap" + (i + 1));
    }
    //Write small knapsack results to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt"))) {
      writer.write("Times for small knapsacks:\n");
      writer.write("   Bottom Up: ");
      for (int i = 0; i < 30; i++) {
        writer.write(bottomTime[i] + " ");
      }
      writer.write("\n   Top Down: ");
      for (int i = 0; i < 30; i++) {
        writer.write(topTime[i] + " ");
      }
      writer.write("\n");
    }
    //Medium Knapsacks
    for (int i = 0; i < 30; i++) {
      bottomTime[i] = BottomUp.bottomUp(mediumLocation + "mediumKnap" + (i + 1));
      topTime[i] = TopDown.topDown(mediumLocation + "mediumKnap" + (i + 1));
    }
    //Write medium knapsack results to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt",true))) {
      writer.write("Times for medium knapsacks:\n");
      writer.write("   Bottom Up: ");
      for (int i = 0; i < 30; i++) {
        writer.write(bottomTime[i] + " ");
      }
      writer.write("\n   Top Down: ");
      for (int i = 0; i < 30; i++) {
        writer.write(topTime[i] + " ");
      }
      writer.write("\n");
    }
    //Large Knapsacks
    for (int i = 0; i < 30; i++) {
      bottomTime[i] = BottomUp.bottomUp(largeLocation + "largeKnap" + (i + 1));
      topTime[i] = TopDown.topDown(largeLocation + "largeKnap" + (i + 1));
    }
    //Write large knapsack results to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt",true))) {
      writer.write("Times for large knapsacks:\n");
      writer.write("   Bottom Up: ");
      for (int i = 0; i < 30; i++) {
        writer.write(bottomTime[i] + " ");
      }
      writer.write("\n   Top Down: ");
      for (int i = 0; i < 30; i++) {
        writer.write(topTime[i] + " ");
      }
      writer.write("\n");
    }
    //Extreme Knapsacks
    for (int i = 0; i < 30; i++) {
      bottomTime[i] = BottomUp.bottomUp(extremeLocation + "extremeKnap" + (i + 1));
      topTime[i] = TopDown.topDown(extremeLocation + "extremeKnap" + (i + 1));
    }
    //Write large knapsack results to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Results.txt",true))) {
      writer.write("Times for extreme knapsacks:\n");
      writer.write("   Bottom Up: ");
      for (int i = 0; i < 30; i++) {
        writer.write(bottomTime[i] + " ");
      }
      writer.write("\n   Top Down: ");
      for (int i = 0; i < 30; i++) {
        writer.write(topTime[i] + " ");
      }
      writer.write("\n");
    }
  }
}
