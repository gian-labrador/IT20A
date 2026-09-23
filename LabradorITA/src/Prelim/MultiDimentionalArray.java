
package Prelim;

public class MultiDimentionalArray {
    public static void main (String[] args){
        int marks [][] = {
            {10,20,35,},
            {26,27,12,},
            {48,55,16}   
    };
        for (int i =0; i< marks.length; i++){
            for (int j= 0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + "");
            }
        System.out.println();  
        }
    } 
}
