import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : input){
            list.add(Integer.parseInt(s));

        }
        System.out.print("Reversed list: ");

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
