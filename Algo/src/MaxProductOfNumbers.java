public class MaxProductOfNumbers {

    public static void main(String[] args) {
        MaxProductOfNumbers maxProductOfNumbers = new MaxProductOfNumbers();

        Integer[] input = new Integer[]{-5,1,2,3,4};

        Integer first = maxProductOfNumbers.findMax(input, 0);
        Integer second = maxProductOfNumbers.findMax(input, 0);

        Integer signOfThird = first*second > 0 ? 1: -1;

        Integer third = maxProductOfNumbers.findMax(input, signOfThird);

        System.out.println(first*second*third);
    }


    //-1 neg
    //+1 pos
    //0 both
    Integer findMax(Integer[] input,Integer sign){
        Integer max = 0;
        Integer maxPosition = 0;

        if (sign.equals(0)){
            for (int i = 0; i < input.length ; i++) {
                if (Math.abs(input[i]) > max ){
                    max = Math.abs(input[i]);
                    maxPosition = i;
                }
            }
        } else if(sign.equals(-1)){
            for (int i = 0; i < input.length ; i++) {
                if (input[i] * -1 > max ){
                    max = input[i] *-1;
                    maxPosition = i;
                }
            }
        } else {
            for (int i = 0; i < input.length ; i++) {
                if (input[i] > max ){
                    max = input[i];
                    maxPosition = i;
                }
            }

        }

        Integer result = input[maxPosition];
        input[maxPosition] = 0;
        return result;
    }
}
