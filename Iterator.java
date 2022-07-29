package com.company;
import java.util.Scanner;
import java.util.*;
class Student{
    public static void  MarkStudent ()
    {
        String Name;
        ArrayList<Integer>Marks=new ArrayList<Integer>();
        Scanner in =new Scanner(System.in);
        Name = in.next();
        int j,sum=0;
        Integer i;
        int n = in.nextInt();
        for(i=0;i<n;i++)
        {
                Marks.add(in.nextInt());
        }
        Iterator<Integer>itr =   Marks.iterator();
        while(itr.hasNext())
        {
            int mark = itr.next();
            if(mark<40)
            {
                System.out.println(Name+","+"Sorry You Have Failed the Exam");
                System.exit(0);
            }
            else
            {
                sum=sum+mark;
            }
        }
        System.out.println("Total Sum is " + sum + " and the avg is " + " " +sum/n + "," + Name+",Congratulations you passed the exam");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s= new Student();
        s.MarkStudent();
    }
}
