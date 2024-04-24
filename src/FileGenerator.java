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
   * @param numbers the size of the file to be generated
   * @param name the name of the file to be generated
   * @param type the type of file to be generated. 1: Unsorted  2:Sorted  3:Reverse-Sorted
   */
  public void generate(int numbers, String name, int type) {
    if (type == 1) {
      //Unsorted files
      // Create a Random object for generating random numbers
      Random random = new Random();

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))) {
        // Generate and write random numbers to the file
        for (int i = 0; i < numbers; i++) {
          int randomNumber = random.nextInt(10000); // Generates a number between 0 and 9999
          writer.write(randomNumber + " ");
        }
      } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
      }
    }
    //Sorted File Generation
    if (type == 2) {
      String smallLocation = "src/SmallFiles/";
      String mediumLocation = "src/MediumFiles/";
      String largeLocation = "src/LargeFiles/";
      FileToArray fileReader = new FileToArray();
      String tempName;

      //Sorted files
      for (int i = 1; i <= 30; i++) {
        tempName = name + i;
        //Small Files
        if (numbers == 10000) {
          //Converts already generated unsorted file to an Integer array
          Integer[] unsortedSmall = fileReader.FileArray(smallLocation + "smallFile" + i);
          //Sorts the unsorted Integer array
          Arrays.sort(unsortedSmall);

          //Prints the now sorted Integer array into a new file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

            for (int k = 0; k < unsortedSmall.length; k++) {
              writer.write(unsortedSmall[k] + " ");
            }
          } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
          //Medium Files
        } else if (numbers == 100000) {
          //Converts already generated unsorted file to an Integer array
          Integer[] unsortedMedium = fileReader.FileArray(mediumLocation + "mediumFile" + i);
          //Sorts the unsorted array
          Arrays.sort(unsortedMedium);

          //Prints the now sorted array into a new file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

            for (int k = 0; k < unsortedMedium.length; k++) {
              writer.write(unsortedMedium[k] + " ");
            }
          } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
          //Large Files
        } else if (numbers == 1000000) {
          //Converts an already generated unsorted file into an Integer array
          Integer[] unsortedLarge = fileReader.FileArray(largeLocation + "largeFile" + i);
          //Sorts the unsorted array
          Arrays.sort(unsortedLarge);

          //Prints the now sorted array into a new file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

            for (int k = 0; k < unsortedLarge.length; k++) {
              writer.write(unsortedLarge[k] + " ");
            }
          } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
        }
      }
    }
    //Reverse-Sorted File Generation
    if (type == 3) {
      String tempName;
      String sortedSmallLocation = "src/SortedSmallFiles/";
      String sortedMediumLocation = "src/SortedMediumFiles/";
      String sortedLargeLocation = "src/SortedLargeFiles/";
      FileToArray fileReader = new FileToArray();

      for (int i = 1; i <= 30; i++) {
        tempName = name + i;
        //Small Files
        if (numbers == 10000) {
          //Converts an already generated sorted file into an Integer array
          Integer[] sortedSmall = fileReader.FileArray(sortedSmallLocation + "smallSorted" + i);
          //Turns the array into a List temporarily and reverses it
          Collections.reverse(Arrays.asList(sortedSmall));
          //Prints the now reverse-sorted array into a new file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

            for (int k = 0; k < sortedSmall.length; k++) {
              writer.write(sortedSmall[k] + " ");
            }
          } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
        }
          //Medium Files
          if (numbers == 100000) {
            //Converts an already generated sorted file into an Integer array
            Integer[] sortedMedium = fileReader.FileArray(sortedMediumLocation + "mediumSorted" + i);
            //Turns the array into a List temporarily and reverses it
            Collections.reverse(Arrays.asList(sortedMedium));

            //Prints the now reverse-sorted array into a new file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

              for (int k = 0; k < sortedMedium.length; k++) {
                writer.write(sortedMedium[k] + " ");
              }
            } catch (IOException e) {
              System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        }
        if (numbers == 1000000) {
          //Converts an already generated sorted file into an Integer array
          Integer[] sortedLarge = fileReader.FileArray(sortedLargeLocation + "largeSorted" + i);
          //Turns the array into a List temporarily and reverses it
          Collections.reverse(Arrays.asList(sortedLarge));

          //Prints the now reverse-sorted array into a new file
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempName))) {

            for (int k = 0; k < sortedLarge.length; k++) {
              writer.write(sortedLarge[k] + " ");
            }
          } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
          }
        }

      }
    }
  }
}