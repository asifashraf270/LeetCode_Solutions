import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem4 {
    public static void  main(String[] args){
        System.out.println(isValid("){"));
    }

    public static boolean isValid(String s){
        Stack<String> output=new Stack<>();
        Map<String,String> rules=new HashMap<>();
        rules.put("(",")");
        rules.put("[","]");
        rules.put("{","}");
        if(s.length()==1)
            return false;
        for (int i=0;i<s.length();i++){

                if(String.valueOf(s.charAt(i)).equalsIgnoreCase("(") || String.valueOf(s.charAt(i)).equalsIgnoreCase("[")|| String.valueOf(s.charAt(i)).equalsIgnoreCase("{"))
                    output.push(s.charAt(i)+"");
                else if(output.size()>0 && String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(rules.get(output.peek())))){
                    output.pop();
                }else
                    return false;




        }
        if(output.size()==0){
            return true;
        }else {
            return false;
        }
    }
}
