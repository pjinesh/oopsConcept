public class Student {
    String name, course;
    double phy, chem, mat, total, ave;
    char grade;

    public Student() {}

    public Student(String name, String course, double phy, double chem, double mat) {
        this.name = name;
        this.course = course;
        this.phy = phy;
        this.chem = chem;
        this.mat = mat;

        total = calTotalMarks(phy, chem, mat);
        ave = calculateAvg(total, 3);
        grade = getGrade(ave);
        studentCard();
    }

    public void studentCard(){
        System.out.println("+----------------------------+");
        System.out.println("|       Name:   \"Jinesh\"     |");
        System.out.println("|        Age:   \"25\"         |");
        System.out.println("|       City:   \"Surat\"      |");
        System.out.println("|    Country:   \"India\"      |");
        System.out.println("|    Physics:   " + phy + "         |");
        System.out.println("|  Chemistry:   " + chem + "         |");
        System.out.println("|      Maths:   " + mat + "         |");
        System.out.println("|      Total:   " + total + "        |");
        System.out.println("|    average:   " + ave + "         |");
        System.out.println("|      Grade:   "+grade+"            |");
        System.out.println("+----------------------------+");
    }

    public double calTotalMarks(double a, double b, double c) {
        return a + b + c;
    }

    public double calculateAvg(double total, int num) {
        return (double) total / num;
    }

    public char getGrade(double avg) {
        if(100 >= avg && avg >= 80) return 'A';
        else if(80 >= avg && avg >= 60) return 'B';
        else if(60 >= avg && avg >= 35) return 'C';
        else if(35 > avg && avg >= 0) return 'F';
        else return '-';
    }

    public static void main(String[] args) {
        Student Jinesh = new Student("Jinesh", "Scince", 90, 80, 70);
    }
}
