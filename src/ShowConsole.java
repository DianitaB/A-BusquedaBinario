import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner (System.in);
    
    public int getEdad(){
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.println("Edad Ingresada: " + edad);
        return edad;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }    
}