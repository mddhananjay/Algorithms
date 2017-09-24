public class GasStation {


    public Integer[] gas = new Integer[] {2,7,4,8};
    public Integer[] cost = new Integer[] {3,4,1,2};
    public static boolean isSolutionFound = false;
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        gasStation.printArray(gasStation.gas);
        gasStation.printArray(gasStation.cost);

        System.out.println(gasStation.whereToBegin(gasStation.gas,gasStation.cost));
    }

    private void printArray(Integer[] input){
        for (Integer i:input) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    private Integer whereToBegin(Integer[] gas,
                              Integer[] cost)
    {
        Integer[] diff = new Integer[gas.length];

        for (int i = 0; i < gas.length ; i++) {
            diff[i] = gas[i]-cost[i];
        }
        printArray(diff);

        Integer sum = 0;

        for (int i = 0; i <diff.length ; i++) {
            Integer iterCount=0;
            for (int j = i+iterCount % diff.length; iterCount < diff.length ; iterCount++) {

                    sum = sum+diff[j];
                    if (sum < 0){
                        sum = 0;
                        break;
                    }

                    if (iterCount == diff.length-1){
                        return i;
                    }


            }
        }

        return -1;
    }
}
