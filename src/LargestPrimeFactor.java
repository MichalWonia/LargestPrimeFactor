public class LargestPrimeFactor {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        } else {
            int max = 0;
            int j;
            for (int i = 1; i <= number; i++) {
                int counter = 0;
                if (number % i == 0) {
                    for (j = i; j >= 1; j--) {
                        if (i % j == 0) {
                            counter += 1;
                        }
                    }
                    if (counter == 2) {
                        if(i > max){
                            max = i;
                        }
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int largestPrime = getLargestPrime(36);
        System.out.println(largestPrime);
    }
}
