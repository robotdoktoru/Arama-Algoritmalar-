import java.util.Scanner;

/**
 *lineer search algorithm
 * @author Yasin
 */
public class Arama_algoritma {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int dizi[] = {1, 56, 87, 20, 68, 87, 29};
        Scanner giris = new Scanner(System.in);
        System.out.println("Hangi sayiyi bulalim?");
        int istek = giris.nextInt();
        for(int i=0;i+1<=dizi.length;i++){
            if(dizi[i] == istek){
                System.out.println("dizi["+i+"]");
            }
        }
    }
    
}
