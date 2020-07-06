class Student{

    private String name;
    private static int id;

    Student()
    {
        System.out.println("Student() ������ ȣ��");
        this.name = "Park";
        this.id = 123;
    }

    Student(String name)
    {
        System.out.println("Student(String name) ������ ȣ��");

        this.name = "name";
        this.id = 1234;
    }

    Student(String name, int id)
    {
        System.out.println("Student(String name, int id) ������ ȣ��");

        this.name = "name";
        if(id<0)
        {
            System.out.println("�й��� ������ �Է� �� �� �����ϴ�.");
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
            System.out.println("�̸��� �Էµ��� �ʽ��ϴ�.");
        }
        else
        {
            
            if(this.id == 0)
            {
                System.out.println("�й��� �Էµ��� �ʽ��ϴ�.");
            }
            else
            {
                System.out.println("�̸�: " + this.name + " �й�: " + this.id);
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