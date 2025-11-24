import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class passwordID {
    Scanner sc=new Scanner(System.in);
    String id;
    String password;
    Map<String,String> map = new HashMap<>();
    public passwordID(){
        map.put("myld","myPass");
        map.put("myld2","myPass2");
        map.put("myld3","myPass3");
    }

    public boolean GETID() {
        System.out.printf("ID:");
        this.id = sc.nextLine();
        if (map.containsKey(id)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean GETPassword() {
        System.out.printf("Password:");
        this.password = sc.nextLine();
        String get = map.get(id);
        if (get.equals(password)){
            return true;}
        else{return false;}
    }
}

public class Homework8 {
    public static void main(String[] args) {
        passwordID ID = new passwordID();
        while (true){
            System.out.println("ID와 password를 입력해주세요:");
            if (ID.GETID()) {
                if (ID.GETPassword()) {
                    System.out.println("ID와 비밀번호가 일치합니다.");break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요.");continue;
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }

}}
