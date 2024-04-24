public class FileCreation {

  public static void main(String[] args) {
    //Creates FileGenerator object
    FileGenerator fileGen = new FileGenerator();
    //All paths to direct where files get generated into
    String smallLocation = "src/SmallKnapsacks/";
    String mediumLocation = "src/MediumKnapsacks/";
    String largeLocation = "src/LargeKnapsacks/";


    //Generate knapsacks
    for(int i = 1; i <= 30; i++) {
      //Small
      fileGen.generate(smallLocation + "smallKnap" + i, 1);
      //Medium
      fileGen.generate(mediumLocation + "mediumKnap" + i, 2);
      //Large
      fileGen.generate(largeLocation + "largeKnap" + i, 3);
    }
  }
}
