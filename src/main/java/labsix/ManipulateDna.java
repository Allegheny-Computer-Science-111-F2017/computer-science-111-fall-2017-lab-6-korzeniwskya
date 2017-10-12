package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ManipulateDna {

  /**
   ** The purpose of this code is to modify an initial DNA sequence.
   ** Through the use of '.replace', 'StringBuffer', 'StringBuilder'.
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Alex Korzeniwsky " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    dna = dna.toUpperCase();
    System.out.println("We will be working with a string of DNA: \"" + dna + "\"");
    // Step Two: Compute the complement of the DNA String
    dna = dna.toLowerCase();
    String dnaMod = dna;
    dnaMod = dnaMod.replace('a', 'T');
    dnaMod = dnaMod.replace('c', 'G');
    dnaMod = dnaMod.replace('t', 'A');
    dnaMod = dnaMod.replace('g', 'C');
    dna = dna.toUpperCase();
    System.out.println("The complement to \"" + dna + "\" is \"" + dnaMod + "\"");
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random generator = new Random();
    int randNum1 = generator.nextInt(4);

    String dnaInsert = dna.substring(0,randNum1) + "C" + dna.substring(randNum1);
    System.out.println("DNA with a random insertion may look like this: \"" + dnaInsert + "\"");
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    StringBuilder dnaModOut = new StringBuilder(dna);
    dnaModOut.deleteCharAt(1);
    System.out.println("DNA with a deletion may look like this; \"" + dnaModOut + "\"");
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    StringBuilder dnaRand = new StringBuilder(dna);
    int randNum2 = generator.nextInt(4);
    int randNum3 = generator.nextInt(4);
    char replaceChar = dna.charAt(randNum2);
    dnaRand.setCharAt(randNum3, replaceChar);
    System.out.println("By choosing a random char, \"" + replaceChar + "\"");
    System.out.println("And placing \"" + replaceChar + "\" in a random location in the sequence,");
    System.out.println("We get, \"" + dnaRand + "\"");
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for experimenting with DNA!");

  }

}
