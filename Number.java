import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Number {
    private static int sum = 0;
    private static String numb = null;
    private static HashMap<String,Integer>map = new HashMap<>();

    Number(String str){
        this.numb = str;
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);

        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);

        map.put("hundred", 100);
        map.put("thousand", 1000);
    }
    static int summ(){
        int digit = 0;
        int thousand = 0;
        int hundred = 0;
        String[]arr = numb.split(" ");
        for(int i = 0;i<arr.length;i++){
            String tmp = arr[i];
            if(tmp.equals("thousand")) {
                thousand = digit;
                sum = 0;
                continue;
            }

            if(tmp.equals("hundred")){
                hundred = digit;
                sum = 0;
                continue;
            }

            digit = map.get(tmp);
            sum += digit;
        }
        return sum + (thousand * 1000) + (hundred * 100);
    }
