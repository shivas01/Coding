class largestElementNext {
    public static void main(String[] args) {
        int arr[] = {10,4,2,4,1};
        int i = 0;

        while (i < arr.length) {
            int large = arr[i];
            int index = i;

             for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > large) {
                    large = arr[j];
                    index = j;
                }
            }

            System.out.print(large + " ");
            i = index + 1;
        }
    }
}
