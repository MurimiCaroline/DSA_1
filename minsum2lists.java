public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<String> b=new ArrayList<String>();
        int temp=0;
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].compareTo(list2[j])==0){
                    temp=i+j;
                    a.add(temp);
                    b.add(list1[i]);
                }
                temp=0;
            }
        }
        int g=Collections.min(a); //finding minimum in an array fumction
        ArrayList<String> kl=new ArrayList<String>();
        for(int i=0; i<a.size(); i++){
            if(a.get(i)==g){
                kl.add(b.get(i));
            }
        }
        String mk[]=new String[kl.size()];
        for(int i=0; i<kl.size(); i++){
            mk[i]=kl.get(i);
        }
        return mk;
    }
} {
    
}
