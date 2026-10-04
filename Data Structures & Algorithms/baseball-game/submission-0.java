class Solution {
    public int calPoints(String[] operations) {
        int tot = 0;
        Stack <Integer> stack = new Stack<>();
        

        for(String oper : operations) {
         
            if(oper.equals("+")){
              int score1 = stack.pop();
              int score2 = stack.peek();
              int total = score1 + score2;
              stack.push(score1);
              stack.push(total);
            } else if(oper.equals("D")){
              stack.push(2 * stack.peek());
            } else if(oper.equals("C")){
           stack.pop();
            } else{
         stack.push(Integer.parseInt(oper));
         System.out.println(stack);
            }
             System.out.println(stack);
        }
       
        for(int s : stack){
           tot = tot + s;
        }

        return tot;
    }
}