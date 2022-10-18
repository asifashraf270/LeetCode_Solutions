import java.util.ArrayList;
import java.util.List;

public class Problem1 {

public static int[] sum(int[] input,int target){
    List<Integer> output=new ArrayList<>();
    int initialCount=0;
    for (int i=0;i<input.length;i++){
        for (int j=i+1;j<input.length;j++){
            if(input[i]+input[j]==target){
                output.add(i);
                output.add(j);
            }
        }
    }
    int[] result=new int[output.size()];
 for (int i=0;i<output.size();i++){
     result[i]=output.get(i);
 }
 return  result;
}
}
