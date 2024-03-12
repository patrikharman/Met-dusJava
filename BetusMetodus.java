
package beugrometodus;


public class BetusMetodus {
    public static void main(String[] args) {
        String[] betuk = {"a","b","c","d","e","f","g"};
        sorban(betuk);
        matrix(betuk);
    }
    
    public static void sorban(String[] betuk){
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + " ");
        }
    }
    private static void matrix(String[] betuk){
        for (int i = 0; i < betuk.length; i++) {
            if (i % 3 == 0) {
                System.out.println("");
            }
            System.out.print(betuk[i] + " ");
        }
    }
}
