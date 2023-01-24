public class User {
    String name, city;
    int adarid, age;
    char gender;

    public User(){}

    //Constructor
    public User( String name, String city, int adarid, int age, char gender){
        this.name=name;
        this.age=age;
        this.adarid=adarid;
        this.city=city;
        this.gender=gender;
        idCard();                   //Called idCard method
    }

    //Method
    public void idCard(){
        System.out.println("+--------------------------+");
        System.out.println("|       Name:   "+name+"     |");
        System.out.println("|        Age:   "+age+"         |");
        System.out.println("|   Adhar ID:   "+adarid+"     |");
        System.out.println("|       City:   "+city+"      |");
        System.out.println("|     Gender:   "+gender+"          |");
        System.out.println("+--------------------------+");
    }


    public static void main(String[] args) {
        User Jinesh = new User("Jinesh","Surat", 112233,25,'M');
    }
}
