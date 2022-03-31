import java.util.Scanner;
pulic class Main{
   public static void main(String[]args){
       Scanner dape = new Scanner(System.in);
       
       System.out.print("Digite o número: ");
       int n = dape.nextInt();
       int i = 0;
           
           while(i <= n){
               int contador = 0;
               int j = i;

           while(j >= 1){
               if(i % j == 0){

               contador++;}

               j--;}

       if(contador == 2){
       System.out.println(i);}

       i++;
 
       }
   }
}
