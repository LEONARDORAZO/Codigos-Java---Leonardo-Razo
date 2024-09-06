import java.util.Scanner;

public class aula13 {
    public static void main(String[] args) {
        Scanner ScanNumeros = new Scanner(System.in);
        System.out.println("digite um numero");
        int Numero1 = ScanNumeros.nextInt();
        System.out.println("digite outro numero");
        int Numero2 = ScanNumeros.nextInt();
        ScanNumeros.close();
        int Resultado = Numero1 + Numero2;

        System.out.println("resultado:" + Resultado); // as variaveis precisam ser verdadeiras no &&
        if (Numero1 < Numero2 && Numero2 < 15) {
            System.out.println("Os dois");
        }
        if (Numero1 < Numero2 || Numero2 < 1) { // uma das variaveis precisam ser verdadeiras no ||
            System.out.println("um ou outro");
        }
        if(!(Numero1 > Numero2)){
            System.out.println("aí não né..."); // as variaveis precisam ser falsas no !  
        }

        //exercício boolean
        Boolean Mora_no_RJ = true;
        boolean Faculdade_ou_Trabalho = true;
        Boolean Refri_suco = true;
        boolean SemCerveja = true; 
        boolean Gostar_de_RPG = true;

        if (Mora_no_RJ && Faculdade_ou_Trabalho){
            if (Refri_suco && SemCerveja) {
                if(Gostar_de_RPG){
                    System.out.println("tudo certo patrão, ela pode ser sua amiga");
                    
                }else{System.out.println("que pena, ela nao gosta de RPG");}
                
            }else{System.out.println("eca, ela gosta de cerveja... sai fora");}
            
        }else{System.out.println("ela não convive com voce");}

    }
}

