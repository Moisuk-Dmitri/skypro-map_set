import java.util.ArrayList;
import java.util.List;

import service.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums_1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("PrintService.printOnlyOdd(nums_1) = " + PrintService.printOnlyOdd(nums_1));

        List<Integer> nums_2 = new ArrayList<>(List.of(1, 8, 10, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("PrintService.printEvenUniqueOrdered(nums_2) = " + PrintService.printEvenUniqueOrdered(nums_2));

        List<String> str_1 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println("PrintService.printUniqueWords(str_1) = " + PrintService.printUniqueWords(str_1));

        List<String> str_2 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println("PrintService.printNumberOfUniqueWords(str_2) = " + PrintService.printNumberOfUniqueWords(str_2));

    }
}
