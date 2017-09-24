
public class MaxContigousSumSubArray {

    public static void main(String[] args) {
        Integer[] input = new Integer[]{-2,1,3,4,-1,2,1,-5,4};

        Integer startIndex = 0;
        Integer endIndex = 0;
        Integer sum = -99;
        Integer maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.length ; i++) {
            sum = sum+input[i];
            if (sum < input[i] ){
                sum = input[i];
                System.out.println("sum = "+sum+"   i==="+i);
                startIndex = i;
            }

            if (maxSum < sum){
                maxSum = sum;
                System.out.println("maxSum = "+maxSum+"   i==="+i);
                endIndex =i;
            }

        }

        System.out.println(maxSum);

        System.out.println(startIndex +"<----->"+endIndex);
        System.out.println("And the values are:");

        for (int i = startIndex; i <= endIndex ; i++) {
            System.out.print(input[i]+"\t");
        }
    }
}
