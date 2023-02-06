/**
 * Constraints:
0 <= key, value <= 106
At most 104 calls will be made to put, get, and remove.
 */

class MyHashMap {
    int [] map;

    public MyHashMap() {
        map = new int[1000000];
        for(int i=0; i < map.length; i++) map[i] = -1;
    }
    
    public void put(int key, int value) {
        map[key] =value;
    }
    
    public int get(int key) {
        return map[key];

    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}
/*https://bit.ly/DSA_Folder
 * https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1140/
 */