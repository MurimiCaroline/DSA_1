/*
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
*/
class MyHashSet {
    private int numBuckets = 15000;
    List<Integer>[] buckets;  

   private int hash_function(int key){
    return key % numBuckets;
    }
    
public MyHashSet() {
    buckets = new LinkedList[numBuckets];
}

public void add(int key) {
    int i = hash_function(key);
    if(buckets[i] == null) buckets[i] = new LinkedList<>();
    if(buckets[i].indexOf(key) == -1)
        buckets[i].add(key);
}

public void remove(int key) {
    int i = hash_function(key);
    if(buckets[i] == null) return;
    if(buckets[i].indexOf(key) != -1) buckets[i].remove(buckets[i].indexOf(key));     
}

public boolean contains(int key) {
    int i = hash_function(key);
    if(buckets[i] == null || buckets[i].indexOf(key) == -1) return false;
    return true;
}
}
/*
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
 */