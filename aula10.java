public class aula10 {
    public static void main(String[] args) {
        String valor = "ALAAAA";
        valor = Numerador(valor); //6 caracteres ao total
        int x = 0;
        char ListaString[] = valor.toCharArray();
        while(ListaString.length >= x){
            System.out.println("Nao tem caracteres o suficiente");
            x++;

            
        }
        if(ListaString.length == x){
            System.out.println("Possui: " + x + "Caracteres");
        }
        
       }

    public static String Numerador(String Srting){
        String NumeroRand = Srting;
        return NumeroRand;
    }  
}
