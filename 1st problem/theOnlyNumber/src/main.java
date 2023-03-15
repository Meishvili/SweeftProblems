import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {

    /*
    * ქვემოთ მოცემულ singleNumber() ფუნქციაში ვაწვდი array-ის,
    * ვალაგებ ზრდის მიხედვით და ვეძებ რომელი რიცხვია მხოლოდ ერთხელ მოცემული.
    * */
    int singleNumber(int[] number){
        int answer=0;
        /*Arrays.sort(number)-ის მიხედვით ზრდადობით ვალაგებ რიცხვებს array-ში.
        * რიცხვების ზრდადობით დალაგება შეიძლობოდა სხვადასხვა ალგორითმის გამოყენებთ,
        * მაგრამ პირობაში არიყო დაკონკრეტებული და ამიტომაც შემოვიფარგლე Arrays.sort() მეთოდით.;*/
        Arrays.sort(number);

        for(int i=1; i<number.length; i+=2){
            if(number[i]!=number[i-1]){
                answer = number[i-1];break;
            }
            else {answer = number[i+1];}
        }
        return answer;
    }

    /*
    * ქვევით მოცემულ main() ტანში ვქმნი array-ის,
    * ვავსებ რიცვებით, შემდგომ ვაწვდი singleNumber()
    * ფუნქციას და ბოლოს გამომაქვს პასუხი.
    * */

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int intArray[] = new int[n];

        for(int i=0; i<n; i++){
            intArray[i] = Integer.parseInt(bf.readLine());
        }
        main object = new main();
        System.out.print(object.singleNumber(intArray));
    }
}
