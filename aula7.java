import java.util.Random;

public class aula7 {
    public static void main(String[] args) {
        int i = 0;
        int RanDoM = (int)Math.floor(Math.random()*20 + 1);
        int arhey[] = {11,2,3};
        int arhey[i] = AddCasa(arhey, ValNovo: 1200);
        for(i=0; i < arhey.length; i++){
           if(arhey[i] == 11){
            arhey[i] = 22;
           }
            System.out.println(arhey[i]);
        }
            
        }
        public static int[] AddCasa(int[] arMudado, int ValNovo){
            int[] NovaAr = {1,1,1, ValNovo};
            int i = 0;
            for(i=0;i<arMudado.length;i++){
                NovaAr[i] = arMudado[i];
        }
            return NovaAr;
            }
    }
