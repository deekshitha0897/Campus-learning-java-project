 class Stu2 
 {
    String name;
    int rollno;
    String branch;

    Stu2(String name, int rollno, String branch) 
    {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + branch);
    }
    public static void main(String[] args) 
    {
        Stu2 s1 = new Stu2("John", 101, "Computer Science");
        s1.display();
        Stu2 s2 = new Stu2("Alice", 102, "Electrical Engineering");
        s2.display();
    }
        
        
    
}
