import java.util.Scanner;

public class aula12 {
    public static void main(String[] args) {
        int VezesInseridos = 0;
        Scanner ScanValue = new Scanner(System.in);
        System.out.println("Digite um numero");
        int Valor1 = ScanValue.nextInt();
        System.out.println("Digite outro numero");
        int Valor2 = ScanValue.nextInt();
        System.out.println(Valor1 + Valor2);
    
/* 

        Logica antiga

        int ValorAntigo=0;
        int ValorNovo =0;
        int ValorFinal = ScanValue.nextInt();

        while (VezesInseridos <= 2) {
        if (VezesInseridos <= 1){
            ValorFinal = ValorAntigo;
            System.out.println(ValorAntigo);
         }
         if (VezesInseridos > 1){
            ValorFinal = ValorNovo;
            System.out.println(ValorNovo);
        }
        VezesInseridos ++;
        
       }
       System.out.println(ValorAntigo + ValorNovo);
       */
    }
}
