# Optimal Knapsack

## Description

- This project was created to empirically study the differences in time between a bottom-up and a top-down algorithm for calculating the maximum value a knapsack can hold
- Four categories of knapsacks were randomly generated:
- Small | Max Weight: 2-10 | Number of Items: 3-8 | Item Weights: 1-7 | Item Values: 1-5
- Medium | Max Weight: 11-30 | Number of Items: 9-15 | Item Weights: 1-20 | Item Values: 1-10
- Large | Max Weight: 31-60 | Number of Items: 16-35 | Item Weights: 1-25 | Item Values: 1-20
- Extreme | Max Weight: 100-1000 | Number of Items: 40-100 | Item Weights: 1-69 | Item Values: 1-150
- All times recorded to Results.txt are in microseconds, or millionths of a second

## Installation

To install this code, follow these steps:
1. Create a new empty project in your preferred IDE
2. Copy and paste this command into your command line to clone the repository into your project:
##
        git clone https://github.com/gg47633/Optimal-Knapsack.git
3. Now, extract the src directory into your project folder and delete the now empty Optimal-Knapsack directory
4. If your IDE hasn't automatically changed its source to the src directory, manually change it in your settings. In IntelliJ, File>Project Structure>Modules, click on the src directory and select "Sources"
5. If the SDK hasn't been automatically changed, change it to Java 17. In IntelliJ, File>Project Structure>Project
6. Installation should be complete
## Usage

To use this code after installation, follow these steps:
1. Run 'FileCreation.java' to generate all necessary files
2. After all files have been generated, run 'Driver.java' to run tests
3. This will take a few seconds. After tests are finished, results are printed to 'Results.txt'
4. 'Results.txt' can be opened using Excel or another spreadsheet application to analyze the results further
