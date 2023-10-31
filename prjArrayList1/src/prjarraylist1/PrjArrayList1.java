
package prjarraylist1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrjArrayList1 
{
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //how many items will we have = 3
        String[] normArr = new String[3];
        
        System.out.print("Enter student name 1 ");
        String strName1 = Keyboard.nextLine();
        
        System.out.print("Enter student name 2 ");
        String strName2 = Keyboard.nextLine();
        
        System.out.print("Enter student name 3 ");
        String strName3 = Keyboard.nextLine();
        
        //array list = an array but isnt (Requires an import)
                //data type
        ArrayList<String> students = new ArrayList<>();
        students.add(strName1);
        students.add(strName2);
        students.add(strName3);
        
        int iCount = students.size();
        
        System.out.println("The number of students: "+ iCount);
        print_students(students, iCount);   
    }
    
    private static void print_students( ArrayList<String> students,  int iCount) 
    {
         for(int x=0; x<iCount; x++)
         {
             System.out.println("Student "+(x+1)+" : "+ students.get(x));
         }
    }
    
}
