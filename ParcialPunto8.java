
public class ParcialPunto8 {
    public static void main(String[] args) {
        int num = 5;
 
        System.out.println();
        for(int a = 1; a<=num; a++){
            //Espacios en blanco
            for(int b = 1; b<=num-a; b++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int x=1; x<=(a*2)-1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}