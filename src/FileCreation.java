public class FileCreation {

  public static void main(String[] args) {
    //Creates FileGenerator object
    FileGenerator fileGen = new FileGenerator();
    //All paths to direct where files get generated into
    String smallLocation = "src/SmallFiles/";
    String mediumLocation = "src/MediumFiles/";
    String largeLocation = "src/LargeFiles/";
    String smallSortedLocation = "src/SortedSmallFiles/";
    String mediumSortedLocation = "src/SortedMediumFiles/";
    String largeSortedLocation = "src/SortedLargeFiles/";
    String smallReverseLocation = "src/ReverseSmallFiles/";
    String mediumReverseLocation = "src/ReverseMediumFiles/";
    String largeReverseLocation = "src/ReverseLargeFiles/";


    //Generate unsorted files
    for(int i = 1; i <= 30; i++) {
      fileGen.generate(10000, smallLocation + "smallFile" + i, 1);
      fileGen.generate(100000, mediumLocation + "mediumFile" + i,1);
      fileGen.generate(1000000, largeLocation + "largeFile" + i,1);
    }

    //Generate sorted files from previously generated unsorted files
      fileGen.generate(10000, smallSortedLocation + "smallSorted", 2);
      fileGen.generate(100000, mediumSortedLocation + "mediumSorted", 2);
      fileGen.generate(1000000, largeSortedLocation + "largeSorted", 2);

    //Generate reverse-sorted files from previously generated sorted files
    fileGen.generate(10000, smallReverseLocation + "smallReverse", 3);
    fileGen.generate(100000, mediumReverseLocation + "mediumReverse", 3);
    fileGen.generate(1000000, largeReverseLocation + "largeReverse", 3);

  }
}
