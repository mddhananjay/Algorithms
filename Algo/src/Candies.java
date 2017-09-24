import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candies {
    static int[] result;
    static int candies(int n, int[] arr) {
        int valuesUpdated = 0;
        while(valuesUpdated < arr.length){
            int minimum = findMin(arr);
            result[minimum]=1;
            valuesUpdated++;
            //forward filling
            int counter =1;
            for(int i=minimum;i<arr.length-1;i++){
                if(arr[i]< arr[i+1]){
                    counter= counter+1;
                    if(result[i+1]!= 0){
                        result[i+1] = Math.max(counter,result[i+1]);
                    }else {
                        result[i+1] = counter;
                        valuesUpdated++;
                        System.out.println(valuesUpdated);
                        sumCaliculator(result);
                    }
                }else{
                    break;
                }
            }

            //backward filling
            counter =1;
            for(int i=minimum;i > 0;i--){
                if(arr[i]< arr[i-1]){
                    counter= counter+1;
                    if(result[i-1]!= 0){
                        result[i-1] = Math.max(counter,result[i-1]);
                    }else {
                        result[i-1] = counter;
                        valuesUpdated++;
                        System.out.println(valuesUpdated);
                        sumCaliculator(result);
                    }

                }else {
                    break;
                }
            }

        }
        return sumCaliculator(result);
    }
    
    static boolean resultHasZero(int[] result){
        for(int i=0;i<result.length;i++){
            if(result[i]==0)
                return true;
        }
      return false;
    }
    
    static Integer sumCaliculator(int[] result){
        int sum =0;
        for(int i=0;i<result.length;i++){
            sum+=result[i];
            System.out.print(result[i]+"\t");
        }
        System.out.println();
      return sum;
    }
    
    
    static int findMin(int[] arr){
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(result[i]==0 && arr[i]<min){
                minIndex= i;
                min = arr[i];
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,-1,0};
        result = new int[arr.length];
        int result = candies(arr.length, arr);
        System.out.println(result);
    }
}