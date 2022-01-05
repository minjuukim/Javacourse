package ch05;

import ch03.MyArray;

public class MyArrayStack {

	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		
		if( isFull() ) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		
		if( isEmpty() ) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);	// �����ؼ� ���� ��.
	}
	
	public int peek() {
		if( isEmpty() ) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	public int getSize()
	{
		return top;
	}
	
	// �迭�� ������ ��� �迭�� �� á���� Ȯ������� ��.
	public boolean isFull() {
		if( top == arrayStack.ARRAY_SIZE ) {
			return true;
		} 
		return false;
	}
	
	public boolean isEmpty() {
		if( top == 0 ) {
			System.out.println("stack is empty");
			return true;
		}
		else 
			return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
}