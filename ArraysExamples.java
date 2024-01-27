import java.util.*;
// import java.util.Arrays;
public class ArraysExamples{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,3,4,5};
        // for(int i = arr.length-1;i>=0;i--){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int element : arr){
        //     System.out.print(element + " ");
        // }
        /*
        // sum of 5 float array
        float arr1[] = {1.5f,2.5f,3.5f,4.5f,5.5f};
        float sum = 0f;
        for(float element : arr1){
            sum+=element;
        }
        System.out.print(sum);
        */
       /*
    //    a given integer is present in an array or not
        int n = 8;
        int arr1[] = {1,2,3,4,5};
        boolean check = false;
        for(int element : arr1){
            if(element == n){
                check = true;
            }
        }
        System.out.print(check);
        */

       /*
    //    Calculate avg of Physics class
       int marksOfPhysics[] = {100,98,97,99,95,96,93,92,91};
       int totalSum = 0;
       for(int marks : marksOfPhysics){
            totalSum +=marks;
       }
       int n = marksOfPhysics.length;
       float calculatedAvg = (float)(totalSum)/n;
       System.out.print("Total avg of Physics class is : " + calculatedAvg);
       */
        /*
        // Add two matrices of size 2 * 3
        int arr1[][] = {{2,3,4},{4,3,2}};
        int arr2[][] = {{2,3,4},{4,3,2}};
        int sumOfMats[][] = new int [2][3];
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                sumOfMats[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                System.out.print(sumOfMats[i][j] + " ");
            }
            System.out.println();
        }
        */
       /*
        // Find the Maximum element of the Array
        int arr1[] = {2,4,6,7,5,9};
        int maxEl = 0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > maxEl){
                maxEl = arr1[i];
            }
        }
        System.out.println("Maximum element of the Array is : " + maxEl);
        */
        /*
        // Find the minimum element of the Array
        int arr1[] = {12,4,6,7,5,9};
        int minEl = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] < minEl){
                minEl = arr1[i];
            }
        }
        System.out.println("Minimum element of the Array is : " + minEl);
        */

    //    Whether an element is sorted or not
        int arr1[] = {9,1,2,3,4,5,6,7,8};
        int copyForSorting [] = Arrays.copyOf(arr1,arr1.length);
        Arrays.sort(copyForSorting);
        if(Arrays.equals(arr1,copyForSorting) == true){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
        // System.out.println(Arrays.equals(arr1,copyForSorting));
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(copyForSorting));


        // System.out.println("Size Of The Array..");
        // int size = sc.nextInt();
        // System.out.println("InPut Of the Array.");
        // int arr2[] = new int[size];
        // for(int i=0;i<size;i++){
        //     arr2[i] = sc.nextInt();
        // }
        // System.out.println("OutPut Of the Array.");
        // for(int i=0;i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }

        // Take an array of names as input from the user and print them on the screen.
        /* 
        System.out.print("Tell the number of Student's names : ");
        int size = sc.nextInt();
        System.out.println("Input the name of Students : ");
        String names[] = new String[size];
        for (int i=0;i<size;i++){
            names[i] = sc.next();
        }
        System.out.println("Check The Name Of The Student : ");
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        */

    //    Find the maximum & minimum number in an array of integers.
    /*
        int arr3[] = {3,4,5,6,7,7,8};
        // int min = arr3[0];
        int min = Integer.MAX_VALUE;
        // int max = arr3[0];
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr3.length;i++){
            if(arr3[i]<min){
                min = arr3[i];
            }
            if(arr3[i]>max){
                max = arr3[i];
            }
        }
        System.out.println ("Minimum element of The Array is : " + min);
        System.out.println ("Maximum element of The Array is : " + max);
        */

    //  Take an array of numbers as input and check if it is an array sorted in ascending order.
    /*  
        int size = sc.nextInt();
        int arr4 [] = new int[size];
        boolean isAscending = true;
        for(int i=0;i<size;i++){
            arr4[i] = sc.nextInt();
        }
        for(int i = 0;i<arr4.length-1;i++){
            // System.out.print(arr4[i]+" ");
            if(arr4[i] > arr4[i+1]){
                isAscending = false;
            }
        }
        if(isAscending == true){
        System.out.println("Given Array is Sorted In Ascending Order..");
        }else{
            System.out.println("Given Array is Not Sorted In Ascending Order..");
        }
     */  

        // 2D Array -- Print the Transpose of A matrix
    /*        
        int marks [] [] = {{1,2,3,4,5},{2,3,4,5,6}};
        // System.out.println(marks.length);
        int rows=marks.length;
        int cols=marks[0].length;
        // System.out.println(rows + " "+cols);
        int trans_marks [][] = new int[cols][rows];
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                // System.out.println(marks[i][j] + " ");
                trans_marks[j][i]=marks[i][j];
            }
            // System.out.println();
        }
        for(int i=0;i<trans_marks.length;i++){
            for(int j=0;j<trans_marks[i].length;j++){
                System.out.print(trans_marks[i][j] + " ");
            }
            System.out.println();
        }
    */

        // Taking a matrix as an input and printing its elements.
        /*
        System.out.println("Enter the number of Rows and Columns for Your Matrix : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Start entering numbers of your 2d Array - ");
        int arr [][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your 2d Array is : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     */

    // Searching for an element x in a matrix
    /*
    System.out.println("Enter the number of Rows and Columns for Your Matrix : ");
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int arr [][] = new int[rows][cols];
    System.out.println("Start entering numbers of your 2d Array - ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter the number which you want to search : ");
    int x = sc.nextInt();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(arr[i][j]==x){
            System.out.print("Your Number x is found at the location " + i + " " + j);
            }
        }
    }
    */

//    Print the spiral order matrix as output for a given matrix of numbers.
    /* 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // Left to Right
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
            // Top to Bottom
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
            // Right to Left
            if(rowStart<=rowEnd){
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            }
            // Bottom to Top
            if(colStart<=colEnd){
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            }
        }
    */
//    int numbers[]=getNumbers();
//    printArray(numbers);

/*

    //Create a menu program 
    ArrayList <Integer> numbers = new ArrayList<>();
    // Scanner sc = new Scanner(System.in);
    while(true){
        menuProgram();
        int choice = sc.nextInt();
        if(choice == 1){
            // add
            System.out.print("Enter a number : ");
            numbers.add(sc.nextInt());
            System.out.println("Added");
        }else if(choice == 2){
            // remove
            System.out.print("Enter a number to remove : ");
            int temp = sc.nextInt();
            if(numbers.contains(temp)){
                numbers.remove(Integer.valueOf(temp));
                System.out.println("Removed.");
            }else{
                System.out.println("Not Found");
            }
        }else if(choice == 3){
            // display
            System.out.print("Array List : " + " ");
            System.out.println(numbers);
        }else if(choice == 4){
            System.out.println("Good Byee.");
            break;
        }else{
            System.out.println("Invalid Choice");
        }
    }
    }
    public static void menuProgram(){
        System.out.println("Enter Your choice : ");
        System.out.println("1: Add a number");
        System.out.println("2: Remove a number");
        System.out.println("3: Display numbers");
        System.out.println("4: Exit");
    }

    */
    /*
    public static int [] getNumbers(){
        return new int[]{1,2,3,4,5}; //Anonymous Array
    }
    public static void printArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
    */
    }
}


