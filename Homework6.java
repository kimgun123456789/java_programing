class Course{
    private String code;
    private String name;
    Course(String code, String name){
        this.code = code;
        this.name = name;
        toString();
    }
    public String toString(){return "code"+code+"name"+name;}
    public String  getCode(){return this.code;}
    public String getName(){return this.name;}
}

class onlineCourse extends Course{
    onlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        return "Code: "+getCode()+" Name: "+getName()+" ,type: Online";
    }
}
class offlineCourse extends Course{
    offlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        return "Code: "+getCode()+" Name: "+getName()+" ,type: Offline";
    }
}
public class Homework6 {

    public static void main(String[] args) {
        offlineCourse course1 = new offlineCourse("HAEA9201","Object Oriented Programming");
        onlineCourse course2 = new onlineCourse("HAFL0012","C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
