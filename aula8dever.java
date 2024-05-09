import java.util.Scanner;

public class aula8dever {
    public static void main(String[] args) {
        int[] listagem = {1,2,3};
        Scanner scan =  new Scanner(System.in);
        System.out.println("Escolha uma casa Numerica entre (1,2,3)");
        int ScanRead = Integer.parseInt(scan.nextLine());
        switch (ScanRead) {
            case 0:
            System.out.println(listagem[0]);
                break;
            case 1: 
            System.out.println(listagem[1]);
            break;
            case 2: 
            System.out.println(listagem[2]);
            default:
                break;
        }
        
        
}}
