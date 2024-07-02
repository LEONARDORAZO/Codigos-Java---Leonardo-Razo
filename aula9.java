import java.util.Scanner;
public class aula9 {
    public static void main(String[] args) {
        
        /*int OrdemNumerica[] = {0,1,2,3,4,5,6,7,8,9};
        String OrdemAlfabetica[] = {"AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"};*/

        Scanner ScanVar = new Scanner(System.in);
        String ScannerString = ScanVar.nextLine();
        ScannerString.toLowerCase();

        if( ScannerString.contains("a") ||
            ScannerString.contains("b") ||
            ScannerString.contains("c") ||
            ScannerString.contains("d") ||
            ScannerString.contains("e") ||
            ScannerString.contains("f") ||
            ScannerString.contains("g") ||
            ScannerString.contains("h") ||
            ScannerString.contains("i") ||
            ScannerString.contains("j") ||
            ScannerString.contains("k") ||
            ScannerString.contains("l") ||
            ScannerString.contains("m") ||
            ScannerString.contains("n") ||
            ScannerString.contains("o") ||
            ScannerString.contains("p") ||
            ScannerString.contains("q") ||
            ScannerString.contains("r") ||
            ScannerString.contains("s") ||
            ScannerString.contains("t") ||
            ScannerString.contains("u") ||
            ScannerString.contains("v") ||
            ScannerString.contains("w") ||
            ScannerString.contains("x") ||
            ScannerString.contains("y") ||
            ScannerString.contains("z")){
            System.out.println("é String");
        }else{
            System.out.println("é integer");
        }
        

    }
}
