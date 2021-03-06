import java.util.*;

class Stack{
	int max;
	int a[];
	int top1,top2;
	
	Stack(int size){
		max= size;
		a = new int[size];
		top1 = -1;
		top2 = size/2;
	}
	
	void push1(int key){
		if(top1 == max/2-1)
			return;
		a[++top1] = key;
		return;
	}
	
	void push2(int key){
		if(top2 == max-1)
			return;
		a[++top2] = key;
		return;
	}
	
	void pop1(){
		if(top1 > 0){
			int temp = a[top1];
			top1--;
			System.out.println("popped element from stack1 is "+temp);
			return;
		}
		else
		System.out.println("Stack is underflow");
		
	}
	
	void pop2(){
		if(top2 > max/2){
			int temp = a[top2];
			top2--;
			System.out.println("popped element from stack1 is "+temp);
		}
		else
		System.out.println("Stack is underflow");
		
	}
}
class Q3Demo{
	public static void main(String[] args){
		Stack s = new Stack(10);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
	}
}