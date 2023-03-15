import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    * მოცემულ ამოცანაში გვთხოვენ დავითვალოთ n სართულზე ასვლის ვარიანტების რაოდენობას.
    * ამასთანავე შეგვიძლია მხოლოდ 1 ან 2 საფეხურით ასვლა. კიბეზე ასვლის რაოდენობები გავს
    * ფიბონაჩის მიმდებრობის პრინციპს. ამ ამოცანის ამოხსნა შეიძლება რეკურსიულად და არარეკურსიულად.
    * ქვემოთ მოცემულია რეკურსიული შემთხვევა. სადაც base case შემთხვევაში n=1 და n=2.
    */

    int fibSequence(int n){
        if(n==1) {return 1;}
        else if (n==2){return 2;}
        return fibSequence(n-1) + fibSequence(n-2);
    }

    /*
    *  main()-ში ვქმნით ცვლადს და ვაწვდით fibSequence()- ფუნქციაში.
    */
    public static void main(String args []) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Main object = new Main();
        System.out.print(object.fibSequence(n));
    }
}
