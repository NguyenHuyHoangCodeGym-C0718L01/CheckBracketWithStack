package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "s*(s-a)*(s-b)*(s-c)";
        MyStack stack = new MyStack();
        char[] charArray = str.toCharArray();
        if(check(stack, charArray)){
            System.out.println("Well");
        }else{
            System.out.println("Not Well");
        }
    }

    public static boolean check(MyStack stack, char[] charArray){
        int countFalse = 0;
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == '('){
                stack.push(String.valueOf(charArray[i]));
            }else if(charArray[i] == ')'){
                if(stack.isEmpty()){
                    countFalse++;
                }else{
                    String left = stack.pop();
                    if(!left.equals("(")){
                        countFalse++;
                    }
                }
            }
        }
        if(countFalse != 0 || !stack.isEmpty()){
            return false;
        }
        return true;
    }
}
