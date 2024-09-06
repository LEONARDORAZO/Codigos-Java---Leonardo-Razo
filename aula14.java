import java.util.Scanner;

public class aula14 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro de 3 casas decimais:");

        Scanner ScanearNumeros = new Scanner (System.in);
        double NumerosEscaneados = ScanearNumeros.nextInt();
        double NumeroEscaneadoDivido = NumerosEscaneados / 100;
        System.out.println(NumeroEscaneadoDivido);
        double NumeroEscaneadoFloat = Math.round(NumeroEscaneadoDivido);
        System.out.println(NumeroEscaneadoFloat);
        int Numeross = (int)NumeroEscaneadoFloat;
        String Numeros = Integer.toString(Numeross);
        
    if (Numeros.contains("0") || Numeros.contains("2")|| Numeros.contains("4")|| Numeros.contains("6")|| Numeros.contains("8")){
        System.out.println("é um numero par");
    }else{
        System.out.println("é impar, que nojo");
    }
    ScanearNumeros.close();
    }
}
