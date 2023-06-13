
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] a,int K) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<K;i++){
            for(int j=0;j<a[i].length;j++){
                list.add(a[i][j]);
            }
        }
        Collections.sort(list);
        return list;    
    }
}
