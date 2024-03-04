public class Armstrong {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        for (int i = start; i <= end; i++) {
            int num = i;
            int rem = 0;
            int sum = 0;
            while (num != 0) {
                rem = num % 10;
                sum += ((rem * rem) * rem);
                num = num / 10;
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
