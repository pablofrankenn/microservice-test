import java.math.BigInteger;

class Puzzle {

    final static BigInteger M = new BigInteger("2021");

    private static BigInteger compute(long n) {

        String s = "";

        for (long i = 0; i < n; i++) {

            s = s + n;
            System.out.println(s);

        }

        return new BigInteger(s).mod(M);

    }

    public static void main(String args[]) {


        for (long n : new long[] {  67489454811002199L  }) {

            System.out.println("" + n + ": " + computeshort(n));

        }

    }

    public static BigInteger computeshort(long n){

        String s = "";
        String a = new BigInteger(n+"").mod(M)+"";
        System.out.println("a:"+a);
        for (long i = 0; i < Integer.parseInt(a); i++) {
            s = s + a ;
            System.out.println(s);
            s = new BigInteger(s).mod(M)+"";
            System.out.println(s);
        }
        return new BigInteger(s.toString()).mod(M);
    }

}
