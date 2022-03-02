package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
  int shiftValue = 1;
  Scanner sc = new Scanner(System.in);

  public void runProgram() {
    System.out.println("Velkommen til Enigma. Her kan du kryptere eller dekryptere en tekst ved hjælp af Caesar Cipher");
    System.out.println("Ønsker du at:\n" +
        "1. Kryptere\n" +
        "2. Dekryptere");
    int choice = sc.nextInt();
    if (choice == 1) {
      cryptCharToString(numToChar(cryptNewNumValue(charToNum(stringToChar(typeText())))));
    }
    if (choice == 2) {
      decryptCharToString(numToChar(decryptNewNumValue(charToNum(stringToChar(typeText())))));
    } else {
      System.out.println("Ikke et gyldigt valg. Programmet genstartes.");
      runProgram();
    }
  }

  public String typeText() {
    System.out.println("Indtast teksten herunder:");
    String text = sc.next();
    return text;
  }

  public char[] stringToChar(String text) {
    char[] chArray = new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
      chArray[i] = text.charAt(i);
    }

    return chArray;
  }

  public int[] charToNum(char[] charArray) {

    int[] valueArray = new int[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      char test = charArray[i];
      for (int o = 0; o < alphabet.length; o++) {
        char test2 = alphabet[5];

        if (test == test2) {        //Der er en fejl i loopet, muligvis ved if der gør at valueArray ikke får tilføjet den rette index
          System.out.println(test2);
          valueArray[i] = o;
        }
      }
    }

    return valueArray;
  }

  public int[] cryptNewNumValue(int[] newValueArray) {
    for (int i = 0; i < newValueArray.length; i++) {
      newValueArray[i] += shiftValue;
      if (newValueArray[i] > newValueArray.length) {
        newValueArray[i] -= newValueArray.length;
      }

    }
    return newValueArray;
  }

  public int[] decryptNewNumValue(int[] newValueArray) {
    for (int i = 0; i < newValueArray.length; i++) {
      newValueArray[i] += shiftValue;
      if (newValueArray[i] > newValueArray.length) {
        newValueArray[i] -= newValueArray.length;
      }

    }
    return newValueArray;
  }

  public char[] numToChar(int[] newValue) {
    char[] newChar = new char[newValue.length];
    for (int i = 0; i < newValue.length; i++) {
      for (int o = 0; o < alphabet.length; i++) {
        if (alphabet[o] == newValue[i]) {

          newChar[i] = alphabet[o];
        }
      }
    }
    return newChar;
  }


  public void cryptCharToString(char[] arrayToString) {
    String cryptedText = String.valueOf(arrayToString);
    System.out.println("Her er resultatet af krypteringen:\n" + cryptedText);
  }

  public void decryptCharToString(char[] arrayToString) {
    String cryptedText = String.valueOf(arrayToString);
    System.out.println("Her er resultatet af dekrypteringen:\n" + cryptedText);
  }

  public static void main(String[] args) {
    Main obj = new Main();

    obj.runProgram();

  }
}
