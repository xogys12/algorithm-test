
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        insertionSort();
        bubbleSort();
        mergeSort();
    }


    //변하는 값.. 변하지 않는 값을 명확히 정의하라

    public static void insertionSort() {

        int[] array = {6, 5, 3, 4, 2, 1};

        int[] temp = new int[array.length];


        for (int index = 1; index < array.length; index++) {

            int position = 0;
            int key = array[index];
            for (int subIndex = index - 1; 0 <= subIndex ; subIndex--) {

                if(key < array[subIndex]) {
                    array[subIndex + 1] = array[subIndex];
                    position = subIndex;
                }
            }

            array[position] = key;
        }


        System.out.println(array);
    }

    public static void bubbleSort() {

        int[] array = {6, 5, 3, 4, 2, 1};


        for(int index = array.length; 0 < index; index--) {

            for(int subIndex = 1; subIndex < index; subIndex++) {

                if(array[subIndex - 1] > array[subIndex]) {
                    int temp;
                    temp = array[subIndex - 1];
                    array[subIndex - 1] = array[subIndex];
                    array[subIndex] = temp;
                }
            }
        }

        System.out.println(array);
    }

    public static void mergeSort() {

        int[] array = {602, 5, 6, 3, 4, 2, 2000, 1, 100, 203, 506, 1035};
        //입력으로 하나의 배열을 받고 연산중에 두개의 배욜로 계속 쪼게 나간 튀 합치면서 정렬해 최후에는
        //하는 정렬을 출력한다.
        //두개의 배열을 비교하여, 기준에 맞는 값을 다른 배열에 저장해간다.

        //크기의 반을 쪼개서 두 배열로 나눈다.
        //쪼갠 배열의 크기가 0이거나 1일때 까지 반복반복


        divide(array, 0, array.length - 1);


        System.out.println(array);
    }


    public static int[] divide(int[] array, int begin, int end) {


        int[] result = new int[end - begin + 1];
        int resultCount = 0;

        if(begin == end) {
            result[0] = array[begin];
            return result;
        }

        int[] firstArray = divide(array, begin, (begin + end) / 2);
        int[] secondArray = divide(array, (begin + end) / 2 + 1, end);


        int firstArrayIndex = 0, secondArrayIndex = 0;
        while (firstArrayIndex < firstArray.length  && secondArrayIndex < secondArray.length) {

            if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                result[resultCount++] = firstArray[firstArrayIndex++];
            } else {
                result[resultCount++] = secondArray[secondArrayIndex++];
            }
        }


        if(firstArrayIndex ==  firstArray.length) {
            result[resultCount] = secondArray[secondArrayIndex];
        } else if(secondArrayIndex == end) {
            result[resultCount] = firstArray[firstArrayIndex];
        }

        return result;
    }

    static void quickSort() {

    }
}
