public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone; //Можно было использовать long
    private double salary;
    private int age;
    Worker(String name,String position,String email,String phone,double salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }//Это конструктор класса для работников
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
