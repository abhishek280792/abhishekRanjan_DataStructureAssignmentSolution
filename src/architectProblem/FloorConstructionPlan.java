package architectProblem;

import java.util.*;

/**
 * @author Abhishek Ranjan
 *
 */
public class FloorConstructionPlan {
    public void constructionPlan(int[] areaArray){
        List<Integer> comparatorList = new ArrayList<>();
        int maxEle = -1;
        int index = 0;
        for(int i=0;i<areaArray.length;i++){
            if(areaArray[i]>maxEle){
                maxEle = areaArray[i];
                index=i;
            }
        }
        int i=0;
        while(i<areaArray.length){
            if(i<index){
                comparatorList.add(areaArray[i]);
                System.out.println("\n Day:"+(i+1));
            }if(i==index){
                System.out.println("\n Day:"+(i+1));
                comparatorList.add(areaArray[i]);
                Collections.sort(comparatorList,Collections.reverseOrder());
                for(int k=0;k<comparatorList.size();k++){
                    System.out.print(comparatorList.get(k)+" ");
                }
                System.out.println();
                comparatorList.clear();
            }if(i>index){
                maxEle=-1;
                for(int j=i;j<areaArray.length;j++){
                    if(areaArray[j]>maxEle){
                        maxEle=areaArray[j];
                        index=j;
                    }
                }
                i--;
            }
            i++;
        }
    }
}
