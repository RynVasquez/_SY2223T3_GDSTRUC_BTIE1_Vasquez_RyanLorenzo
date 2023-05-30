// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        //Bubble Sort - Start
            int[] numbers = new int[10];

            numbers[0] = 39;
            numbers[1] = 9;
            numbers[2] = 91;
            numbers[3] = 393;
            numbers[4] = 29;
            numbers[5] = 90;
            numbers[6] = 23;
            numbers[7] = 3;
            numbers[8] = 79;

            System.out.println("Unsorted Array");
            BubbleSort(numbers);
        //Bubble Sort - End

    }

    private static void BubbleSort(int[] arraySize){
        for(int unsortedValue = 1; unsortedValue < arraySize.length - 1; unsortedValue++){
            for(int i = 0; i < arraySize.length - unsortedValue; i++){
                if(arraySize[i] > arraySize[i + 1]){
                    int temp= arraySize[i + 1];
                    arraySize[i + 1] = arraySize[i];
                    arraySize[i] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] array){
        for(int unsortedValue = array.length - 1; unsortedValue > 0; unsortedValue--){

        }
    }
}

