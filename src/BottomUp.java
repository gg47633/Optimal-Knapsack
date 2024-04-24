import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BottomUp {

  /**
   *
   * @param fileName is the name of the input file
   * @return the time the knapsack calculation took in microseconds
   */
  public static double bottomUp(String fileName) {
    double startTime = 0, endTime = 0;
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);

      //Read the maximum weight of the knapsack
      int W = scanner.nextInt();

      //Initialize the arrays to store weights and values
      int n = 0;
      int[] wt = new int[1001];
      int[] val = new int[1001];

      //Read the weights and values
      while (scanner.hasNextInt()) {
        wt[n] = scanner.nextInt();
        val[n] = scanner.nextInt();
        n++;
      }
      scanner.close();

      int[][] dp = new int[n + 1][W + 1];
      startTime = System.nanoTime();

      for (int i = 0; i <= n; i++) {
        for (int w = 0; w <= W; w++) {
          if (i == 0 || w == 0)
            dp[i][w] = 0;
          else if (wt[i - 1] <= w)
            dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
          else
            dp[i][w] = dp[i - 1][w];
        }
      }
      endTime = System.nanoTime();

      //System.out.println(dp[n][W]);

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //Divides nanoseconds by 1000 to return microseconds
    return (endTime - startTime)/1000;
  }
}
