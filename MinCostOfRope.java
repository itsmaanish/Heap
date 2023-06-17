class Solution
{
    //Function to return the minimum cost of connecting the ropes.
     long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq= new PriorityQueue<Long>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long solution=0;
        while(pq.size()>1){
            long num1=pq.poll();
            long num2=pq.poll();
            
            solution=solution+(num1+num2);
            pq.add(num1+num2);
           
        }
        return solution;
        }
    }
