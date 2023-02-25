class Sorting
 {
public static void main(String args[])
{
int a[]=new int[5];
try{
      for(int i=0;i<5;i++)
         a[i]=Integer.parseInt(args[i]);
      System.out.println("\n Before sorting \n");

     for(int i=0;i<5;i++)
     System.out.println(" "+a[i]);

bubbleSort(a,5);

System.out.print("\n\n After Sorting \n");
System.out.println("Ascending order \n");
for (int i=0;i<5;i++)
     System.out.println(" "+a[i]);
System.out.println("\n\n Descending order \n");
for (int i=4;i>=0;i--)
     System.out.println(" "+a[i]);

}
catch (NumberFormatException e) {
System.out.println("Enter only integers");
}

catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Enter only 5 integers");
}
}


private static void bubbleSort(int[] arr,int length) {
int temp, i, j;
for(i=0;i<length-1;i++) {
for(j=0;j<length-1-i;j++) {
if(arr[j] >arr[j+1]) {
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
}
}