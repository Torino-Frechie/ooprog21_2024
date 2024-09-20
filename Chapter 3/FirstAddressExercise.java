/*
Torino, Frechie Ann
BSIT 2A


What is the purpose of the main method in this program?
  - It’s where the program starts.
How does the displayAddress() method contribute to the overall output of the program?
  - Prints address information in the output.
What would happen if you removed the System.out.println("First Java application"); line from the main method?
  - The message won’t show, but the program still runs.
*/

public class FirstAddressExcercise{ 
  public static void displayAddress(){ 
    System.out.println("Parent Organization Transsion Holdings"); 
    System.out.println("Address: Shenzen, China"); 
    System.out.println("Founder: George Zhu"); 
    System.out.println("Techno Mobile Company"); 
  } 
  public static void main(String[] args){ 
    System.out.println("First Java application"); 
    displayAddress(); 
  } 
}
