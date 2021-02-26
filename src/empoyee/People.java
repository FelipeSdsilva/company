package empoyee;

public class People {
    
    public String name;
    public double grossalary;
    public double tax;
    public double newSalary;

    public double NetSalary()
    {
        return grossalary - tax;
    }
    public void IncreaseSalary(double percent)
    {
        newSalary = ((percent/100)*grossalary)+ NetSalary();
    }

    public String ToString()
    {
        return "Empoyee: " + name
               + ", $" + String.format("%.2f",NetSalary());
    }
}
