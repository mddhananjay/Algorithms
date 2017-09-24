import java.util.ArrayList;
import java.util.LinkedHashSet;

public class GenerateAllPermuatationsOfString {

    public static void main(String[] args) {

    }

    public void permute(String[] input, LinkedHashSet<String> temp){
        if (temp.size() == input.length){
            printArray(temp);
            return;
        }else {

        }
    }

    private void printArray(LinkedHashSet<String> input){
        for (String i:input) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
