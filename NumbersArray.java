import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] input) {
        int max = 0;
        for (int i : input) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dupes = new LinkedHashSet<>();

        for (Integer i : input) {
            if (!seen.add(i)) {
                dupes.add(i);
            }
        }
        return dupes.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> dupes = new HashSet<>();

        for (Integer i : input) {
            if (!dupes.contains(i) && !unique.add(i)) {
                unique.remove(i);
                dupes.add(i);
            }
        }
        return unique.toArray(new Integer[0]);
    }
    
}

