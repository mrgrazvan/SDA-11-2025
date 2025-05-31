public class myGoodPairs {
    public static void main(String[] args) {
        //int[] array = { 1, 2, 3, 1, 1, 3 };
        //int[] array = { 1,1,1,1};
        int[] array = {1,2,3};

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j])
                    System.out.println(array[i] + " : (" + i + "," + j + ")");

        System.err.println();
    }
}
