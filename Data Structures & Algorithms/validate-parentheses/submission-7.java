class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hashmap = new HashMap<>();
        Stack<Character> stringStack = new Stack<>();
        hashmap.put(']','[');
        hashmap.put('}','{');
         hashmap.put(')','(');
for(int i =0;i <s.length();i++){
    
    if(hashmap.containsKey(s.charAt(i))){
        if(!stringStack.isEmpty() && hashmap.get(s.charAt(i)) == stringStack.peek()){
         stringStack.pop();
    } else{
    return false;
    }
 
} else {
     stringStack.push(s.charAt(i));
}

      
    } System.out.println(stringStack);
      return stringStack.isEmpty();

}
}
