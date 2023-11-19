import java.util.Scanner;
import java.util.Arrays;

class Binary
{
    public static void BinarySearch(int Array[], int k, int size)
    {
        int flag = 0; //flag = condition checker
        int left = 0;
        int right = size;
        int mid = (left + right)/2;
        while (left <= right)
        {
            if (k == Array[mid])
            {
                System.out.println("The searched element is found at position "+(mid+1)+".");
                flag = 1;
                break;
            }
            else if (k > Array[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        if (flag == 0)
        {
            System.out.println("The element does not exist.");
        }
    }
}

public class Binary_Search extends Binary
{
    public static void main(String args[])
    {
        int size, i, k; //i = looping variable, k = element to be searched
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = obj.nextInt();
        int Array[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < size; i++)
        {
            Array[i] = obj.nextInt();
        }
        Arrays.sort(Array);
        System.out.println("Sorted array:");
        for (i = 0; i < size; i++)
        {
            System.out.println(Array[i]);
        }
        System.out.print("Enter the element to be searched: ");
        k = obj.nextInt();
        BinarySearch(Array, k, size);
    }
}
