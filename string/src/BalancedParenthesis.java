import java.util.Stack;

public class BalancedParenthesis {

    public static boolean checkBalanceParenthesis(String s){

        Stack<Character> stack= new Stack<>();

        char[] c=s.toCharArray();

        for(Character cc:c){
            if(cc=='(' || cc=='[' || cc=='{'){
                stack.push(cc);
            }else {
                if(stack.isEmpty()){
                    return false;
                } else if (cc==')' && stack.peek()!='(') {
                    return false;
                } else if (cc==']' && stack.peek()!='[') {
                    return false;
                } else if (cc=='}' && stack.peek()!='{') {
                    return false;
                }else {
                     stack.pop();
                }
            }
        }

      return stack.isEmpty();
    }

    public static void main(String[] args){

        String s= "{}([[]])";
        System.out.println(checkBalanceParenthesis(s));
    }
}
