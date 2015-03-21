public class Dragon {
    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
       String dragon = "F";
       String nogard = "F";
       String temp;

       for (int i = 1; i <= N; i++) {
         temp = dragon;                     // save away copy of dragon
         dragon = dragon + "L" + nogard;
         nogard = temp   + "R" + nogard;    // use old value of dragon
     }
     System.out.println(dragon);
 }

}
