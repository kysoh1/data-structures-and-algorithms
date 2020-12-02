public class sorts
{
    /* Bubble Sort */
    public static void bubbleSort(int[] A) 
    {
        for (int i = 0; i < A.length - 1; i++) 
        {
            //Items before i should already be sorted
            for (int j = 0; j < A.length - 1 - i; j++) 
            {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                }

            }
        }
    }

    /* Insertion Sort */
    public static void insertionSort(int[] A) 
    {
        for (int i = 1; i < A.length; i++)
        {
            int j = i;
            int temp = A[i];
            //Shift positions of elements greater than temp by 1
            while (j >= 0 && A[j] > temp)
            {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = temp;
        }
    }

    /* Selection Sort */
    public static void selectionSort(int[] A) 
    {
        for (int i = 0; i < n - 1; i++) 
        {
            //Minimum element in the array
            int minIdx = i;
            //Search for a smaller element
            for (int j = i + 1; j < A.length; j++)
            {
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }

            swap(A, minIdx, i);
        }
    }

    /* Merge Sort */
    public static void mergeSort(int[] A)
    {
        mergeSortRecurse(A, 0, A.length - 1);
    }

    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
        if (leftIdx < rightIdx) 
        {
            int midIdx = (leftIdx + rightIdx) / 2;

            //Sort lower and upper half subarrays
            mergeSortRecurse(A, leftIdx, midIdx);
            mergeSortRecurse(A, midIdx + 1, rightIdx);
            //Merge the two sorted subarrays
            merge(A, leftIdx, midIdx, rightIdx);
        }
    }

    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
        //Size of both subarrays
        int lowerSize = midIdx - leftIdx + 1;
        int upperSize = rightIdx - midIdx;
        int[] L = new int[lowerSize];
        int[] R = new int[upperSize];

        //Separate sorted subarrays into temp arrays
        for (int i = 0; i < lowerSize; i++) 
        {
            L[i] = A[leftIdx + 1];
        }

        for (int i = 0; i < upperSize; i++) 
        {
            R[i] = A[midIdx + 1 = i];
        }

        int i = 0, k = 1;
        //Copy remaining elements of L[]
        while (i < lowerSize)
        {
            A[k] = L[i];
            k++;
            i++;
        }

        i = 0;
        //Copy remaining elements of R[]
        while (i < upperSize)
        {
            A[k] = R[i];
            k++;
            i++;
        }
    }

    /* Quick Sort */
    public static void quickSort(int[] A)
    {
        quickSortRecurse(A, 0, A.length - 1);
    }

    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
        if (leftIdx < rightIdx)
        {
            int pivotIdx = partition(A, leftIdx, rightIdx);
            //Sort elements before and after partition
            quickSortRecurse(A, leftIdx, pivotIdx - 1);
            quickSortRecurse(A, pivotIdx + 1, rightIdx);

        }
    }

    private static int partition(int[] A, int leftIdx, int rightIdx) 
    {
        int pivot = A[rightIdx];
        int i = (leftIdx - 1);
        for (int j = leftIdx; j < rightIdx; j++) 
        {
            if (A[j] < pivot)
            {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, rightIdx);
        return i + 1;
    }

    private static void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}