import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String[] numbers1 = input1.split("\\s+");
        List<Integer> list1 = new ArrayList<>();
        for(String num : numbers1){
            list1.add(Integer.parseInt(num));
        }
        String input2 = scanner.nextLine();
        String[] numbers2 = input2.split("\\s+");
        List<Integer> list2 = new ArrayList<>();
        for (String num : numbers2){
            list2.add(Integer.parseInt(num));
        }
        Set<Integer> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);

        System.out.print("Merged list: ");
        for(Integer num : mergedSet){
            System.out.print(num + " ");

        }
        System.out.println();

        scanner.close();
    }
}
