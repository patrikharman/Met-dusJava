
package beugrometodus;


public class Uj {
    public static void main(String[] args) {
        nehanySzamGyokenekMegjelenitese();
    }

    private static void nehanySzamGyokenekMegjelenitese() {
        haromSzamGyokeKonzolon();
    }

    private static void haromSzamGyokeKonzolon() {
        int osszeg = szamok(8,szamok(21,10));
        double a = gyokvonas(osszeg);
        konzolraIr(a,osszeg);
    }
    
   public static int szamok(int a, int b){
       return a+b;
   }
   private static double gyokvonas(double a){
       return Math.sqrt(a);
   }
   private static void konzolraIr(double a,int c){
       System.out.printf("%d gyöke: %.4f",c,a);
   }
   public static int osszegzes(int[] tomb){
       int osszeg = 0;
       for (int i = 0; i < tomb.length; i++) {
           osszeg += tomb[i];
       }
       return osszeg;
   }
}
