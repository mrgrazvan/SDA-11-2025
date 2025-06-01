public class myDuplicates {
    public static void main(String[] args) {
        // int[] array = { 1, 2, 3, 1 };
        // int[] array = { 1, 2, 3, 4};
        int[] array = { 1,1,1,3,3,4,3,2,4,2 };

        boolean isFound = false;

        for (int i = 0; i < array.length & !isFound; i++)
            for (int j = i + 1; j < array.length & !isFound; j++)
                if (array[i] == array[j])
                    isFound = true;

        System.out.println(isFound);
    }
}
