package aplication;

import java.util.*;
import empoyee.*;

public class Index {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        People x =new People();

        
        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        x.grossalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();
        System.out.println(x);
        System.out.print("Witch percentage to increase salary: ");
        double percent = sc.nextDouble();
        x.IncreaseSalary(percent);
        System.out.println("Update date: "+x.ToString());

        sc.close();
    }
}
