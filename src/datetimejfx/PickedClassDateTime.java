/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimejfx;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Brian
 */


public class PickedClassDateTime {
    
    enum DayAbbv { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };
    
    LocalDate myDate, xmasday;
    int daysuntilxmas;
    
    Hashtable monthhash, yearhash;
    ArrayList<Integer> montharray, yeararray;
    
    DefaultTableModel monthTable = new DefaultTableModel(6,7);
    
    
    
    
    public PickedClassDateTime() {
        montharray = new ArrayList<Integer>();
        myDate = LocalDate.now();
    }
    
    public PickedClassDateTime(int aMonth, int aDay, int aYear) {
        montharray = new ArrayList<Integer>();
        myDate = LocalDate.of(aYear, aMonth, aDay);
    }
    
    public void showMinMaxMonth() {
        Integer day = 0;
                
        for (int y = 1; y < (myDate.lengthOfMonth() + 1); y++) {
            day++;
            montharray.add(day);
            if (y % 7 == 0) { 
                System.out.println("  " + y); 
                        } else {
                System.out.print("  " + y); 
            }
        }
        System.out.println();
        System.out.println(montharray);
    }
    
    public void showMinMaxYear() {
        // might be unused
    }
    
    public void showZodiac() {
        
        ArrayList<LocalDate> zodiacdates = new ArrayList<LocalDate>();
        HashMap zodiachash = new HashMap();
        
        LocalDate ariesstart = LocalDate.of((myDate.getYear()), 3, 21); zodiacdates.add(ariesstart);
        LocalDate taurusstart = LocalDate.of((myDate.getYear()), 4, 21); zodiacdates.add(taurusstart);
        LocalDate geministart = LocalDate.of((myDate.getYear()), 5, 21); zodiacdates.add(geministart);
        LocalDate cancerstart = LocalDate.of((myDate.getYear()), 6, 22); zodiacdates.add(cancerstart);
        LocalDate leostart = LocalDate.of((myDate.getYear()), 7, 23); zodiacdates.add(leostart);
        LocalDate virgostart = LocalDate.of((myDate.getYear()), 8, 24); zodiacdates.add(virgostart);
        LocalDate librastart = LocalDate.of((myDate.getYear()), 9, 23); zodiacdates.add(librastart);
        LocalDate scorpiostart = LocalDate.of((myDate.getYear()), 8, 24); zodiacdates.add(scorpiostart);
        LocalDate sagittariusstart = LocalDate.of((myDate.getYear()), 10, 23); zodiacdates.add(sagittariusstart);
        LocalDate capricornstart = LocalDate.of((myDate.getYear()), 12, 23); zodiacdates.add(capricornstart);
        LocalDate aquariusstart = LocalDate.of((myDate.getYear()), 1, 21); zodiacdates.add(aquariusstart);
        LocalDate piscesstart = LocalDate.of((myDate.getYear()), 2, 19); zodiacdates.add(piscesstart);
        System.out.println(zodiacdates);
        Iterator itr = zodiacdates.iterator();
        
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        
        
        
        
        
    }
    
    public void setMonthTable() {
        
        Integer COLUMNS = 7;
        Integer ROWS = 6;
        
        for (int x = 1; x < ROWS; x++) {
            
            System.out.print(" X ");
            for (int y = 1; y < COLUMNS; y++) {
                System.out.print(" Y ");
            }
            System.out.println();
            
        }
        
    }
    
    public TableModel getMonthTable() {
        
        return monthTable;
    }
    
    public void showShoppingDays() {
        
        xmasday = myDate.withMonth(12);
        xmasday = xmasday.withDayOfMonth(25);
           
        System.out.println("Shopping days until Christmas: " + (xmasday.getDayOfYear() - myDate.getDayOfYear()));
    }
    
    public void showNextDay() {
        System.out.println("The following day is " + myDate.plusDays(1));
    }
    
     public void showPrevDay() {
        System.out.println("The previous day was " + myDate.plusDays(-1));
    }
    
    public String toString() {
        return myDate.toString();
    }
    
    public ArrayList<Integer> printMonthDays() {
        return montharray;
    }
    
}
