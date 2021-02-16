import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean b1;
    boolean b2;
    boolean b3;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your chosen username: ");
    String username = input.nextLine();
    System.out.print("Enter your chosen Password: ");
    String password = input.nextLine();

    if (username.length() < 6) {
      System.out.println("Username is too short.");
      b2 = false;}
    else {b2 = true;}

    if (username.length() > 15) {
      System.out.println("Userame is too long.");
      b2 = false;}
    else {b2 = true;}

    if (username.contains(" ")) {
      System.out.println("Username can not contain spaces.");
      b2 = false;}
      else {b2 = true;}

    if (username.contains("(") || username.contains(")")) {
      System.out.println("Username can not contain parentheses.");
      b2 = false;}
      else {b2 = true;}
  
    char user1 = username.charAt(0); // obtain first letter of username
      b1 = Character.isUpperCase(user1); // is letter uppercase?
     if (b1 != true) {
      System.out.println("Username must begin with an Uppercase letter.");
      b2 = false;}
      else {b2 = true;}

    if (password.length() < 8) {
      System.out.println("Password is too short.");
      b3 = false;}
      else {b3 = true;}

    if (password.length() > 265) {
      System.out.println("Password is too long.");
      b3 = false;}
      else {b3 = true;}

    if (password.contains(" ")) {
      System.out.println("Password can not contain spaces.");
      b3 = false;}
      else {b3 = true;}

    if (password.contains("(") || password.contains(")")) {
      System.out.println("Password can not contain parentheses.");
      b3 = false;}
      else {b3 = true;}

    if (password.equals(username)) {
      System.out.println("Password and Username cannot be the same.");
      b3 = false;}
      else {b3 = true;}

    if (b2 == true && b3 == true) {
      System.out.println("Login Credentials Accepted.");
    } 
  }
}