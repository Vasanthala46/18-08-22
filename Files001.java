package com.test.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Files001 {

public static void main(String[] args) {

FileReader in = null; //to read a file
BufferedReader br = null; //to read the text from a character based input stream


try {  

in = new FileReader("text.txt");
br = new BufferedReader(in);

String li;  

while((li = br.readLine())!=null) {  
System.out.println(li);  

}  

}

catch(FileNotFoundException ex) {
ex.printStackTrace();
}

catch(IOException ex) {
System.out.println(ex.getMessage());

  }
finally {
try {
if(in != null)
in.close();

if(br != null)
br.close();

}
catch(IOException ex) {
System.out.println(ex.getMessage());
}

}
}
}

