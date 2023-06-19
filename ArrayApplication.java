package lab02;

import java.util.Scanner;

public class ArrayApplication {
    public static void main(String[] args) {


        //2D Array Type


//       int[][] arr=new int[2][3];
//       Scanner input=new Scanner(System.in);
//        System.out.println("Enter Array elements:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j]=input.nextInt();
//            }
//        }
//        System.out.println("Your array is:");
//         for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//             System.out.println("");
//        }


        //3D Array Type


        int[][][] threeDArray = {
                                 {
                                  {1,2,3,4},
                                  {5,5,5,5},
                                  {0,1,2,3}
                                 },
                                 {
                                  {0,0,0,0},
                                  {1,1,1,1},
                                  {2,2,2,2}}};

        for (int i = 0; i <threeDArray.length ; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k]+" ");
                }System.out.println("");
            }System.out.println("*****************");
        }
    }
}