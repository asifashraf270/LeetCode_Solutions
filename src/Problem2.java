import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    public static void main(String args[]) {
        System.out.println(romanToIntV2("MCMXCIV"));
    }
    public static int romanToIntV2(String s) {
        Map<String, Integer> rules = new HashMap<>();
        rules.put("I", 1);
        rules.put("V", 5);
        rules.put("X", 10);
        rules.put("L", 50);
        rules.put("C", 100);
        rules.put("D", 500);
        rules.put("M", 1000);

        int sum = 0;
        int i = 0;
        while (i < s.length()){

            if( i < s.length() - 1 && rules.get((s.charAt(i) + "")) < rules.get((s.charAt(i+1) + ""))) {
                sum += rules.get((s.charAt(i+1) + "")) - rules.get((s.charAt(i) + ""));
                i+=2;
            } else {
                sum += rules.get((s.charAt(i) + ""));
                i += 1;
            }
        }

        return sum;

    }


    public static int romanToInt(String s){
        Map<String,Integer> rules=new HashMap<>();
        rules.put("I",1);
        rules.put("V",5);
        rules.put("X",10);
        rules.put("L",50);
        rules.put("C",100);
        rules.put("D",500);
        rules.put("M",1000);
        int result=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='I' || s.charAt(i)=='X' || s.charAt(i)=='C'){
                    if(i<s.length()-1) {
                        if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                            result = result + (rules.get(String.valueOf(s.charAt(i + 1))) - rules.get(String.valueOf(s.charAt(i))));
                        }else {
                            result=result+rules.get(String.valueOf(s.charAt(i)));

                        }
                    }else {
                        result=result+rules.get(String.valueOf(s.charAt(i)));
                    }
            }else {
                result=result+rules.get(String.valueOf(s.charAt(i)));

            }
/*
            result=result+rules.get(String.valueOf(s.charAt(i)));
*/
        }
        return result;

    }
}
