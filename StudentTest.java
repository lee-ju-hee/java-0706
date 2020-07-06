class Student{

    private String name;
    private static int id;

    Student()
    {
        System.out.println("Student() 생성자 호출");
        this.name = "Park";
        this.id = 123;
    }

    Student(String name)
    {
        System.out.println("Student(String name) 생성자 호출");

        this.name = "name";
        this.id = 1234;
    }

    Student(String name, int id)
    {
        System.out.println("Student(String name, int id) 생성자 호출");

        this.name = "name";
        if(id<0)
        {
            System.out.println("학번에 음수는 입력 할 수 없습니다.");
        }
        else
        {
            this.id = id;
        }
    }

    public void studentPrint()
    {
        if(this.name == null)
        {
            System.out.println("이름이 입력되지 않습니다.");
        }
        else
        {
            
            if(this.id == 0)
            {
                System.out.println("학번이 입력되지 않습니다.");
            }
            else
            {
                System.out.println("이름: " + this.name + " 학번: " + this.id);
            }
        }
    }
}

public class StudentTest{

    public static void main(String[] args){

        Student std1 = new Student();
        Student std2 = new Student("Lee");
        Student std3 = new Student("Kim", 12345);

        std1.studentPrint();
        std2.studentPrint();
        std3.studentPrint();
    }
}