import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    int notContains(int[] array){
        int minPos = 1;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i]==minPos){minPos++;}
            else if(array[i]!=minPos && array[i]>minPos){break;}
        }
        return minPos;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] intArray = new int[n];
        for(int i=0; i<n; i++){
            intArray[i] = Integer.parseInt(bf.readLine());
        }
        Main object = new Main();
        System.out.println(object.notContains(intArray));
    }
}
