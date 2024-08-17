import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        textModifier();

    }

    public static String textModifier() {
        String text = "";
        String fin = "";
        int sum = 0 ;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше предложение :");
        text = in.nextLine();
        String[] arr = text.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ") && arr[i + 1].equals(" ")) {
                continue;
            } else if (arr[i].equals("-")) {
                fin = fin.substring( 0,fin.length()-1)+ arr[i+1];
                arr[i+1] = arr[i-1];
                continue;
            } else if (arr[i].equals("+")) {
                arr[i] = "!";
            }
            switch (arr[i]) {
                case "0":
                    continue;
                case  "1", "2", "3", "4", "5", "6", "7", "8", "9":
                    sum = sum + Integer.parseInt(arr[i]);
                    continue;
            }
            fin = fin + arr[i];
        }if(sum !=0){
        String strSum =Integer.toString(sum);
        fin = fin + " " + strSum;
        System.out.println(fin);
        }
        System.out.println(fin);
        return text;
    }
}

