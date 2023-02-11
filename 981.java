import java.util.HashMap;

// // import java.security.Timestamp;
// // import java.sql.Time;
// import java.util.ArrayList;
// // import java.util.Collection;
// import java.util.Comparator;
// import java.util.HashMap;
// // import java.util.Iterator;
// // import java.util.ArrayList;
// import java.util.ListIterator;
// import java.util.Collections;

class TimeMap {


    class SortByTimestamp implements Comparator<Node>{
        public int compare(Node a,Node b){
            return a.timestamp-b.timestamp;
        }

    }

    class Node {
        String value;
        int timestamp;

        public Node(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    HashMap<String, ArrayList<Node>> map = null;

    public TimeMap() {
        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new Node(value,timestamp));
        }else{
            ArrayList<Node> arr=new ArrayList<>();
            arr.add(new Node(value, timestamp));
            map.put(key,arr);
        }

    }

    public String get(String key, int timestamp) {
        if (map.containsKey(key)){
            ArrayList<Node> myArr=map.get(key);
            Collections.sort(myArr,new SortByTimestamp());

            ListIterator<Node> itr=myArr.listIterator();
            while (itr.hasPrevious()){
                Node temp=itr.previous();
                if (temp.timestamp<timestamp){
                    return temp.value;
                }
                
            }
        }
        return "";

    }
}

// /**
//  * Your TimeMap object will be instantiated and called as such:
//  * TimeMap obj = new TimeMap();
//  * obj.set(key,value,timestamp);
//  * String param_2 = obj.get(key,timestamp);
//  */
