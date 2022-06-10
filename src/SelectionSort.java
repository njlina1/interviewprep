// Java program for implementation of Selection Sort
public class SelectionSort {

    void sort(int arr[]){

        int n = arr.length;
        //one by one move boundary of unsorted array
        for(int i=0; i<n-1;i++) {
            //find the minimum element in unsorted array
            int mi_idx =i;
            for(int j=i+1;j<n;j++)
                if(arr[j]< arr[mi_idx])
                    mi_idx=j;

            //swap the found minimum element with the first element

            int temp=arr[mi_idx];
            arr[mi_idx]=arr[i];
            arr[i]=temp;

        }

    }

    //Print the array
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+"");
        System.out.println();

    }

    //Driver code to test
    public static void main(String args[]){
        SelectionSort ob =new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("sorted array");
        ob.printArray(arr);

    }



}
