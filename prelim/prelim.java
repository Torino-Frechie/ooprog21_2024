public class Fibonnacci{
   public static void main(String[]args){
     
      int n = 10;
      int firstTerm = 0;
      int secondTerm = 1;
      
      for(int i=0; i<=n; i++){
         System.out.printf("\nfibonacci(%d)-> %d",i,firstTerm);
         
      int nextn = firstTerm + secondTerm;
                  firstTerm = secondTerm;
                  secondTerm = nextn;

       }
     }
}
