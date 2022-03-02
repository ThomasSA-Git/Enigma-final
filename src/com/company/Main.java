package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

  char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

  public void runProgram() {

  }

  public String typeText() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Indtast teksten du ønsker at kryptere/afkryptere");
    String text = sc.next();
    return text;
  }

  public void stringToChar(String text) {

    char[] ch = new char[text.length()];

    for (int i = 0; i < text.length(); i++) {
      ch[i] = text.charAt(i);

    }

  }

  public void charToNum() {
    for(int i = 0; i < alphabet.length; i++){
      if(alphabet[i] == ){
        return ;
      }
    }
  }

  public void newNumValue() {

  }

  public void newValue() {

  }

  public void numToChar() {

  }

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

    obj.stringToChar(obj.typeText());
  }
}
