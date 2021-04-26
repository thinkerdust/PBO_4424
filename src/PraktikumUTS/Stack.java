package PraktikumUTS;

import java.util.*;
import java.lang.*;

class MyArr extends Exception{

}
class Stack
{
    private char arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size)
    {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack
    public void push(char x)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }


        arr[++top] = x;
    }

    // Utility function to pop top element from the stack
    public int pop()
    {
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }


    public Boolean isFull()
    {
        return top == capacity - 1;   // or return size() == capacity;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(20);
        Scanner var=new Scanner(System.in);
        MyArr obj=new MyArr();
        System.out.println("Input data:");
        String unry=var.nextLine();
        int i=0;
        int count=0;
        int flag=0;
        int j=0;

        try{
            while(unry.charAt(i)!= '=')
            {
                char ch=unry.charAt(i);
                if(ch=='-'||ch=='*'||ch=='/')throw obj;

                if(ch=='1')
                {
                    stack.push(ch);
                    count++;
                }


                i++;


                j=i;
            }



            for(i=j+1;i<unry.length();i++)
            {
                if(unry.charAt(j+1)=='1')
                {
                    flag++;
                }
                j++;
            }


            if(count==flag)
            {


                System.out.println("Inputan valid : " +unry);
            }
            else
            {
                {


                    System.out.println("Inputan tidak valid");
                }

            }


        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        }


        catch(MyArr k)
        {
            System.out.println("Inputan tidak valid");
        }


    }
}