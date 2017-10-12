package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class ManipulateDna {

  /**
   ** The 
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
    System.out.println(dna);
    // Step Two: Compute the complement of the DNA String
    dna = dna.replace('a', 'T');
    dna = dna.replace('c', 'G');
    dna = dna.replace('t', 'A');
    dna = dna.replace('g', 'C');
    dna = dna.toLowerCase();
    System.out.println(dna);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    dna = new StringBuffer(dna).insert(2, "c").toString();
    System.out.println(dna);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    StringBuilder dnaMod = new StringBuilder(dna);
    dnaMod.deleteCharAt(1);
    System.out.println(dnaMod);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for experimenting with DNA!");

  }

}
