import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list0 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma plavara para a primeira lista:");
        String word = input.nextLine();
        list0.add(word);

        while (word != "") {
            System.out.println("Insira uma plavara para a primeira lista ou tecle enter para continuar:");
            word = input.nextLine();
            list0.add(word);
        }

        System.out.println("Insira uma plavara para a segunda lista:");
        word = input.nextLine();
        list1.add(word);
        while (word != "") {
            System.out.println("Insira uma plavara para a segunda lista ou tecle enter para continuar:");
            word = input.nextLine();
            list1.add(word);
        }

        for (int i = 0; i < list0.size(); i++) {
            String wordToCheck = list0.get(i);
            if (list1.contains(wordToCheck)) {
                System.out.println(wordToCheck);
            }
        }
    }
}
