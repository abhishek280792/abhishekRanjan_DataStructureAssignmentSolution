package architectProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FloorConstructionPlan fp = new FloorConstructionPlan();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n enter the total no of floors in the building");
        int floors = sc.nextInt();
        int[] areaArray = new int[floors];
        for(int i=0;i<floors;i++){
            System.out.println("\n enter the floor size given on day :"+(i+1));
            areaArray[i]=sc.nextInt();
        }
        fp.constructionPlan(areaArray);
        sc.close();
    }
}
