package coreJavaOops.COmpositionAndAggregation;


    class Student{
        //String stuName="Vaish";
        IdCard stId;
        Student(IdCard id){
           //this.stId = new IdCard();
            this.stId = id;
        }
    }

    class IdCard{
        int s1Id=1;
    }

    class Address{

    }

    class Subject{

    }

    class School{

    }

    class Teacher{

    }



public class CompositionAndAgreegation {

    public static void main(String[] args) {
        IdCard id = new IdCard();
        Student stuId=new Student(id);
        System.out.println(stuId.stId.s1Id);
    }
}
