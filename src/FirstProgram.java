import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {

        // Class Scanner
        Scanner sc = new Scanner(System.in);

        // Data Input
        System.out.print("Bienvenido, ingresa tu NOMBRE para comenzar:");
        String name = sc.nextLine();

        System.out.println("Ahora ingresa tu APELLIDO:");
        String lastName = sc.nextLine();

        System.out.println("Cuál es tu edad:");
        String age = sc.nextLine();

        System.out.println("Cuál es tu HOBBIE:");
        String hob = sc.nextLine();

        System.out.println("Cuál es tu EDITOR DE CÓDIGO favorito:");
        String codeEditor = sc.nextLine();

        System.out.println("Que SISTEMA OPERATIVO utilizas:");
        String so = sc.nextLine();

        // Data Output
        System.out.println("Procesando tus datos...");
        System.out.println("Hola " + name + " " + lastName + "," + " tu edad es de " + age + " años");
        System.out.println("Tu/s hobbie/s: " + hob);
        System.out.println("Editor de código favorito: " + codeEditor);
        System.out.println("Sistema operativo: " + so);
    }
}
