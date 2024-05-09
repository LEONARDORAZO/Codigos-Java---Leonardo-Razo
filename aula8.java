public class aula8 {
    public static void main(String[] args) {
        int[] listagem = {1,2,3,10,0}, listagem1 = {12,3,1}; //todas as variaveis cradas nesta linha são Arrays (listas)
        int List[] = {1,1,1,1}, List1 = 10; //todas as variaveis cradas nesta linha são int mas não necessariamente array
        int[] L1st[] = {listagem, List}; //todas as variaveis cradas nesta linha são Arrays de Arrays (listas de listas)

        for(int i = 0; i < L1st.length; i++){
            for (int a = 0; i<L1st[i].length; a++)
                System.out.println(L1st[i][a]);
                
        }
}}