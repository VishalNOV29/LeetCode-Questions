import java.util.HashMap;

class JavaMap{
    public static void main(String[] args){
        System.out.println("Code is running");
        HashMap<String,Integer> map=new HashMap<>();
        map.put("vishal", 0);
        map.put("kumar", 1);
        System.out.println(map.get("vishal"));
    }
}