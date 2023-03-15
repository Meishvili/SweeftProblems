import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    * ქვევთ მოცემულ minSplit() ფუნქციაში ვიგებთ
    * მონეტების მინიმალურ რაოდენობას.
    * */

    int minSplit(int amount){
        /*
        * count ცვლადი ითვლის მონეტების რაოდენობას
        */
        int count = 0;
        int key = 0;
        while(amount>0){
            if(amount>=50){
                key = amount - (amount%50);
                amount=amount%50;
                count += key/50;
            }
            else if(amount< 50 && amount>=20){
                key = amount - (amount%20);
                amount=amount%20;
                count += key/20;
            }
            else if(amount <20 && amount>=10){
                key = amount - (amount%10);
                amount=amount%10;
                count += key/10;
            }
            else if(amount <10 && amount>=5){
                key = amount - (amount%5);
                amount=amount%5;
                count += key/5;
            }
            else if(amount<5 && amount >=1){
                count += amount;
                amount=0;
            }
        }
        return count;
    }

    /*
    * ქვემოთ მოცემულ main()-ში ვქმნით int ტიპის ცვლად,
    * შემდეგ ვანთავსებთ მას Main კლასის minSplit() ფუნქციაში
    * პასუხის მისაღებად.
    * */
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(bf.readLine());
        Main object = new Main();
        System.out.print(object.minSplit(amount));
    }
}
