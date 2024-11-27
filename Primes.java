public class Primes {
    public static void main(String[] args) {
           int len = Integer.parseInt(args[0]);
        boolean [] arr =new boolean[len+1];
        arr[0] = false;
        arr[1]= false;
        int p = 2;
        for (int i =2; i < arr.length; i++) {
            arr[i] = true;
        }


        while( p < Math.sqrt(len))
        {
            for (int i = p+1; i < arr.length; i++) {

                if( i % p == 0)
                arr[i] = false;
            }
            p++;
        }
       System.out.println("Prime numbers up to " + len + ":");
       int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true)
            {
                System.out.println(i);
                cnt++;

            }
        
        }
        System.err.println("There are " + cnt + " primes bewtween 2 and " + len +  " (" + (100*cnt)/len + "% are primes)");
    }
}
