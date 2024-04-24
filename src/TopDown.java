import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class TopDown {
  /**
   *
   * @param W max weight
   * @param wt item weights
   * @param val item values
   * @param n number of items
   * @param memo 2D array for memory function
   * @return maximum possible value of a knapsack
   */
    public static int knapsack(int W, int[] wt, int[] val, int n, Integer[][] memo) {
      //If no items are left or the capacity becomes 0
      if (n == 0 || W == 0)
        return 0;

      // If the value has already been calculated, gets returned
      if (memo[n][W] != null)
        return memo[n][W];

      //Checks to make sure item isn't exceeding max knapsack capacity
      if (wt[n - 1] > W)
        return memo[n][W] = knapsack(W, wt, val, n - 1, memo);

      //Return the maximum of the nth item included and not included
      else
        return memo[n][W] = Math.max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1, memo),
                knapsack(W, wt, val, n - 1, memo));
    }

  /**
   *
   * @param fileName name of the input file
   * @return time in microseconds the knapsack calculation took
   */
  public static double topDown(String fileName) {
      double startTime = 0, endTime = 0;
      try {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int maxWeight = scanner.nextInt();
        List<Integer> weightsList = new ArrayList<>();
        List<Integer> valuesList = new ArrayList<>();

        while (scanner.hasNextInt()) {
          weightsList.add(scanner.nextInt());
          valuesList.add(scanner.nextInt());
        }
        scanner.close();

        int[] weights = weightsList.stream().mapToInt(i -> i).toArray();
        int[] values = valuesList.stream().mapToInt(i -> i).toArray();
        int numberOfItems = weights.length;

        Integer[][] memo = new Integer[numberOfItems + 1][maxWeight + 1];

        startTime = System.nanoTime();
        knapsack(maxWeight, weights, values, numberOfItems, memo);
        endTime = System.nanoTime();
        //System.out.println("Maximum value we can obtain = " + result);

      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      //Divides nanoseconds by 1000 to return microseconds
      return (endTime - startTime)/1000;
    }
  }
