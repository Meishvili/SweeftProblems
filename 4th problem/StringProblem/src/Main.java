import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
     ქვემოთ მოცემული ფუნქცია იღებს პარამეტრად ორ სტრინგს, რომლებშიც
    ჩაწერილია ორობით სისტემაში ჩაწერილი რიცხვები, ხოლო პასუხად აბრუნებს მათ ჯამს,
    კვლავ ორობით სისტემასში.
    */
    String sumBinaryString(String a,String b){
        int aInteger = Integer.parseInt(a,2);
        int bInteger = Integer.parseInt(b,2);
        int c = aInteger + bInteger;
        String finalAnswer = Integer.toBinaryString(c);
        return finalAnswer;
    }

    /*
     ქვემოთ მოცემულ main()-ტანში ვქმნით ორ სტრინგს და შემდეგ
    პარამეტრებად ვაწვდით sumBinaryString() ფუნქციას და ვბეჭდავთ
    მიღებულ პასუხს.
     */
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = new String();
        String b = new String();
        a = bf.readLine();
        b = bf.readLine();
        Main object = new Main();
        System.out.println(object.sumBinaryString(a,b));
    }
}
