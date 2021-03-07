
import java.util.Scanner;

public class AppStart{
    
    static Scanner input = new Scanner(System.in);
    
    
    public static void  main(String args[]){
        String option;
        System.out.println("\nSelecione o tamanho:");
        System.out.println("\nSMALL");
        System.out.println("MEDIUM");
        System.out.println("LARGE");
        
        option = input.nextLine();        
        option = option.toUpperCase();
        
        Size size = Size.valueOf(option);
        
        System.out.println("Name          : " + size.name());
        System.out.println("toString()    : \"" + size.toString() + "\"");
        System.out.println("Ordem         : " + size.ordinal());
        System.out.println("Valor minimo  : " + size.getMinValue());
        System.out.println("Valor maximo  : " + size.getMaxValue());
        System.out.println("Código        : '" + size.getCode() + "'");
                             
    }
}


