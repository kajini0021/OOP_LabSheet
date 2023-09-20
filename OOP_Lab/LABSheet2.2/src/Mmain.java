
    public class Mmain {
        public static void main(String []args){
            Student obj1=new Student();
            System.out.println("Student 1 Information");
            obj1.displayInfo();

            Student obj2=new Student("kajini", 21, 'B');
            System.out.println("Student 2 Information");
            obj2.displayInfo();

            Student obj3 =new Student("kalara", 22);
            System.out.println("Student 3 Information");
            obj3.displayInfo();


        }
    }

