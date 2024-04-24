import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class TopDown {

    // Function to solve the knapsack problem using a top-down approach
    public static int knapsack(int W, int[] wt, int[] val, int n, Integer[][] memo) {
      // Base case: If no items are left or the capacity becomes 0
      if (n == 0 || W == 0)
        return 0;

      // If the value has already been calculated, return it
      if (memo[n][W] != null)
        return memo[n][W];

      // If the weight of the nth item is more than the knapsack capacity W, then
      // this item cannot be included in the optimal solution
      if (wt[n - 1] > W)
        return memo[n][W] = knapsack(W, wt, val, n - 1, memo);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
      else
        return memo[n][W] = Math.max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1, memo),
                knapsack(W, wt, val, n - 1, memo));
    }

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

        // Memoization array to store the results of subproblems
        Integer[][] memo = new Integer[numberOfItems + 1][maxWeight + 1];

        startTime = System.nanoTime();
        knapsack(maxWeight, weights, values, numberOfItems, memo);
        endTime = System.nanoTime();
        //System.out.println("Maximum value we can obtain = " + result);

      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      return (endTime - startTime);
    }
  }
