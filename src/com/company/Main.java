package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

  char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
  int shiftValue = 2;
  String text = " ";

  public void runProgram() {

  }

  public void typeText() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Indtast teksten du ønsker at kryptere/afkryptere");
    text = sc.next();
    stringToChar(text);
  }

  public void stringToChar(String text) {
    char[] ch = new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
      ch[i] = text.charAt(i);
    }
    charToNum(ch);
  }

  public void charToNum(char[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int o = 0; o < alphabet.length; o++) {
        if (alphabet[o] == array[i]) {
          int[] valueArray = new int[text.length()];
          valueArray[i] = o;
          newNumValue(valueArray);
        }
      }
    }

  }

  public void newNumValue(int[] newValueArray) {
    for (int i = 0; i < newValueArray.length; i++) {
      newValueArray[i] += shiftValue;
      if (newValueArray[i] > newValueArray.length) {
        newValueArray[i] -= newValueArray.length;
      }

    }
    numToChar(newValueArray);
  }

  public void numToChar(int[] newValue) {
  for (int i = 0; i < newValue.length; i++){
    for (int o = 0; o < alphabet.length; i++){
      if(alphabet[o] == newValue[i]){
        char[] newChar = new char[newValue.length];
        newChar[i] = alphabet[o];
      }
    }
  }

}

  /*
  public void charToString() {


  }

  /*
Metoder:
Run program.
Choose cypher type.
Globalt array med alfabetet? Evt. find talværdien for hver bogstav i alfabetet.
Hiv de enkelte bogstafver ud af string.
Shiftværdi ændrer dem?
Opbyg ny string med dem en af gangen (string-builder).

Dekryptering - modsat af kryptering.


Brug unicode til displacement (shift)


*/
  public static void main(String[] args) {
    Main obj = new Main();

    obj.stringToChar();
    obj.charToNum();
    //obj.newNumValue();
    //obj.numToChar();
    //System.out.println(obj.charToString());

  }
}
