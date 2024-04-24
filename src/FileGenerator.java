import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class FileGenerator {

  /**
   *
   * @param name the name of the file to be generated
   * @param type the type of file to be generated. 1: Unsorted  2:Sorted  3:Reverse-Sorted
   */
  public void generate(String name, int type) {
    if (type == 1) {
      //Small knapsacks
      // Create a Random object for generating random numbers
      Random random = new Random();

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))) {
        // Generate and write random numbers to the file
        int maxWeight = random.nextInt(2,11);
        writer.write(maxWeight + "\n");

        int numberOfItems = random.nextInt(3,9);
        for (int i = 0; i < numberOfItems; i++) {
          int itemWeight = random.nextInt(1, Math.min(maxWeight + 1, 8));
          int itemValue = random.nextInt(1,6);
          writer.write(itemWeight + " " + itemValue + "\n");
        }
      } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
      }
    }
    if (type == 2) {
      //Medium knapsacks
      Random random = new Random();
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))) {
        // Generate and write random numbers to the file
        int maxWeight = random.nextInt(11,31);
        writer.write(maxWeight + "\n");

        int numberOfItems = random.nextInt(9,16);
        for (int i = 0; i < numberOfItems; i++) {
          int itemWeight = random.nextInt(1, Math.min(maxWeight + 1, 21));
          int itemValue = random.nextInt(1,11);
          writer.write(itemWeight + " " + itemValue + "\n");
        }
      } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
      }
    }
    if (type == 3) {
      //Medium knapsacks
      Random random = new Random();
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))) {
        // Generate and write random numbers to the file
        int maxWeight = random.nextInt(31,61);
        writer.write(maxWeight + "\n");

        int numberOfItems = random.nextInt(16,36);
        for (int i = 0; i < numberOfItems; i++) {
          int itemWeight = random.nextInt(1, Math.min(maxWeight + 1, 26));
          int itemValue = random.nextInt(1,21);
          writer.write(itemWeight + " " + itemValue + "\n");
        }
      } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
      }
    }
  }
}