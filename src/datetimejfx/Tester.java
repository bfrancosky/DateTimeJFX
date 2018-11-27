/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimejfx;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class Tester {
    public static void main(String[] args) {
        //TestJFrame myTestGUI = new TestJFrame();
        //myTestGUI.setVisible(true);
        /*
        Calendar userdate = Calendar.getInstance();
        */
        int myDay, myMonth, myYear;
        //String line;
	String[] linevector;        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date: ");
   
        String userstring = input.nextLine();
        
        System.out.println("You have entered " + userstring);
        
        linevector = userstring.split("/");
        
        myMonth = Integer.parseInt(linevector[0]);
	myDay = Integer.parseInt(linevector[1]);
	myYear = Integer.parseInt(linevector[2]);
        
        System.out.println("This was split to " + myMonth + "," + myDay + "," + myYear);

        
        PickedClassDateTime someDate = new PickedClassDateTime(myMonth, myDay, myYear);
        System.out.println(someDate.toString());
        someDate.toString();
        someDate.showMinMaxMonth();
        someDate.showNextDay();
        someDate.showPrevDay();
        someDate.showShoppingDays();
        someDate.setMonthTable();
        someDate.showZodiac();
        
               
    }
}
