public class Main {
    public static void main(String[] args) {
        //Bubble Sort - Start
        int[] numbers = new int[10]; //Settign array to be able to store 10 elements

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        // Bubble Sort

        /*
        System.out.println("Before Bubble Sort: ");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);
        */

        // Selection Sort


        System.out.println("Before Selection Sort: ");
        printArrayElements(numbers);

        selectionSort2(numbers);

        System.out.println("\n\nAfter Selection Sort: ");
        printArrayElements(numbers);


        //System.out.println("Unsorted Array");
        //BubbleSort(numbers);
        //Bubble Sort - End
    }

    private static void bubbleSort(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){ //To make for loop last until it reaches the last index or 9
            for(int i = 0; i < lastSortedIndex; i++){ //For everytime i is less than lastSortedIndex (9)
                //To Compare first element with next element
                /*
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                */

                //Quiz 1 - 1: Descending Order (Bubble Sort) - Start

                if(arr[i] < arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                //End
            }
        }
    }

    private static void selectionSort(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){

            int largestIndex = 0;

            /*
            for(int i = 0; i < lastSortedIndex; i++){

                if(arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }

            }
            */

            //Quiz 1 - 1: Descending Order (Selection Sort) - Start
            for(int i = 0; i < lastSortedIndex; i++){

                if(arr[i] < arr[largestIndex]){
                    largestIndex = i;
                }

            }
            //End

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    //Quiz 1 - 2: Smallest Value First (Selection Sort) - Start
    private static void selectionSort2(int[] arr){
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--){

            int smallestIndex = 0;

            /*
            for(int i = 0; i < lastSortedIndex; i++){

                if(arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }

            }
            */

            for(int i = 0; i < lastSortedIndex; i++){

                if(arr[smallestIndex] > arr[i]){
                    smallestIndex = i;
                }

            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    //End

    private static void printArrayElements(int[] arr){
        for (int j : arr) { // for(int i < 0; i < array.length; i++)
            System.out.print(j + " ");
        }
    }


}