import java.util.Scanner;

public class Input{
Scanner reader = new Scanner(System.in);

public void ivesti(){
System.out.println("Iveskite varda: ");
String input = reader.nextLine();
System.out.println("Hello " + input);
}

}