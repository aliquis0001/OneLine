import java.util.*;
import java.util.stream.Collectors;
public class normalProgram {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the amount of integers: ");
        int intAmt = kb.nextInt();
        int randLimit = (int) Math.pow(10, Math.ceil(Math.log10(intAmt)));
        ArrayList<Integer> fullList = new ArrayList<Integer>(new Random().ints(intAmt, 0, randLimit).boxed().collect(Collectors.toList()));
        ArrayList<Integer> evensList = new ArrayList<Integer>();
        ArrayList<Integer> oddsList = new ArrayList<Integer>();
        fullList.forEach(i -> {
            if (i % 2 == 0) {
                evensList.add(i);
            } else {
                oddsList.add(i);
            }
        });
        Collections.sort(evensList);
        Collections.sort(oddsList, Collections.reverseOrder());
        System.out.println();
        System.out.println(" Array of " + intAmt + " random integers between 0 and " + randLimit + " :");
        System.out.println(fullList);
        System.out.println(" ==============================");
        System.out.println(" Sorted even elements of array:");
        System.out.println(evensList);
        System.out.println(" =====================================");
        System.out.println(" Reverse sorted odd elements of array:");
        System.out.println(oddsList);
    }
}
