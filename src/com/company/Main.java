package com.company;

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

    System.out.println("Indtast herunder hvor mange pladser du ønsker at shifte din tekst:");
    shiftValue = sc.nextInt();

    if (choice == 1) {
      encryptCharToString(numToChar(encryptNewNumValue(charToNum(stringToChar(typeText())))));
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
      for (int o = 0; o < alphabet.length; o++) {

        //Den ignorerer det her if-statement, og jeg ved ikke hvorfor. Så den overfylder valueArray og giver fejl.
        if (alphabet[o] == charArray[i]) {
          valueArray[i] = o;
        }
      }
    }
    return valueArray;
  }

  public int[] encryptNewNumValue(int[] newValueArray) {
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
      newChar[i] = alphabet[newValue[i]];
    }
    return newChar;
  }


  public void encryptCharToString(char[] arrayToString) {
    String cryptedText = String.valueOf(arrayToString);
    System.out.println("Her er resultatet af krypteringen:\n" + cryptedText);
    System.out.println("Programmet genstartes nu.");
    runProgram();
  }

  public void decryptCharToString(char[] arrayToString) {
    String cryptedText = String.valueOf(arrayToString);
    System.out.println("Her er resultatet af dekrypteringen:\n" + cryptedText);
    System.out.println("Programmet genstartes nu.");
    runProgram();
  }

  public static void main(String[] args) {
    Main obj = new Main();

    obj.runProgram();

  }
}
