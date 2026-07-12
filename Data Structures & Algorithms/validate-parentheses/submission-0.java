class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        StringBuilder stack=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.append(ch);
            }
            else{
                if(stack.length()==0){
                    return false;
                }
                char top=stack.charAt(stack.length()-1);
                if(top=='(' && ch==')' || top=='{' && ch=='}' || top=='[' && ch==']'){
                    stack.deleteCharAt(stack.length()-1);
                }
                else{
                    return false;
                }
            }
        }
        return stack.length()==0;
    }
}
