 class Grade 
 {
    public static void main(String args[])
    {
        java.lang.String s="kumar";
        int rollno=1001,m1=70,m2=90,m3=85,total, avg;
        total=m1+m2+m3;
        avg=total/3;
        System.out.println("the student details are");
        System.out.println("student rollno="+rollno);
        System.out.println("student name="+s);
        System.out.println("sub1 marks="+m1);
        System.out.println("sub2 marks="+m2);
        System.out.println("sub3 marks="+m3);
        System.out.println("total marks="+total);
        System.out.println("average marks="+avg);
        if(avg>=90)
        {
            System.out.println("first class");
        }
        else if(avg>=80)
        {
            System.out.println("second class");
        }
        else if(avg>=70)
        {
            System.out.println("third class");
        }
        else 
        {
            System.out.println("fail");
        }

    }
    
}
