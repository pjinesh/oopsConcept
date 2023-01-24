public class Employee {
    String name;
    double salary, hra, da, med, pf, ins, ded, netsal, grosssal;

    public Employee() {
        salary =10000;
        hra=0.2;
        med=0.5;
        da=0.4;
        ins=0.3;
        pf=0.02;
    }

    public Employee(String name, double salary, double hra, double da, double med, double pf, double ins) {
        this();
        this.name = name;
        this.salary = salary;
        this.hra = hra;
        this.da = da;
        this.med = med;
        this.pf = pf;
        this.ins = ins;

        ded = calDed(grosssal, pf, ins);
        grosssal = calGrosssal(salary, hra, da, med);
        netsal = calnetsal(grosssal, ded);
        print();
    }

    public double calDed(double a, double b, double c) {
        return (a * b) + (a * c);
    }

    public double calGrosssal(double a, double b, double c, double d) {
        return a + (a * b) + (a * c) + (a * d);
    }

    public double calnetsal(double a, double b) {
        return a - b;
    }

    public void print() {
        System.out.print("Salary ");
        System.out.println(netsal);

        System.out.println("(25000 > ) " + ((netsal >= 25000) ? 'A' : ' '));
        System.out.println("(25000 - 20000) " + ((netsal < 25000) && (netsal >= 20000) ? 'B' : ' '));
        System.out.println("(20000 - 15000) " + ((netsal < 20000) && (netsal >= 15000) ? 'C' : ' '));
        System.out.println("(15000 - 10000) " + ((netsal < 15000) && (netsal >= 10000) ? 'D' : ' '));
        System.out.println("(10000 - 5000) " + ((netsal < 10000) && (netsal >= 5000) ? 'E' : ' '));
    }

    public static void main(String[] args) {
        Employee Jin = new Employee("Jinesh", 10000, 0.2,0.4, 0.5, 0.02, 0.3);
    }
}
