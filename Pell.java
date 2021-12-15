package edu.neu.coe.info6205;

public class Pell {
    //static long fourtynine = 0l;
    //static long fifty = 0l;

    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        //for these cases the result is the same as n
        if (n<=2){
            return n;
        }

        //for other cases it needs to be calculated
        long a = 1;
        long b = 2;
        long c = 0;
        for (int i = 3; i <= n; i++){
            c = 2 * b+a;
            b=c;
            a=b;
        }
        return c;
    }


    //looks like recursive takes forever.
   /* public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        if(n==0) return 0;
        else if(n==1) return 1;
        else {
            long x;
            if(n==49)
                if(fourtynine == 0l)
                    x = fourtynine = 2*(get(n-1))+get(n-2);
                else
                    x = fourtynine;

            if(n==50)
                if(fifty == 0l)
                    x = fifty = 2*(get(n-1))+get(n-2);
                else
                    x = fourtynine;

            if( x = 0

            return 2*(get(n-1))+get(n-2);
        }*/
}

