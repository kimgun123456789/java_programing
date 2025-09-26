
import java.util.Scanner;

class Student {
    private int num;
    private String name;
    private String major;
    private long phone;

    // 기본 생성자 (입력 받아서 setter로 저장)
    Student(Scanner sc) {
        setNum(sc.nextInt());
        setName(sc.next());
        setMajor(sc.next());
        setPhone(sc.nextLong());
    }

    // Getter & Setter
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public long getPhone() { return phone; }
    public void setPhone(long phone) { this.phone = phone; }

    // 전화번호 포맷
    public String getPhoneFormatted() {
        String phn = Long.toString(phone);
        if (!phn.startsWith("0")) phn = "0" + phn; // 맨 앞 0 복구
        return phn.substring(0,3) + "-" + phn.substring(3,7) + "-" + phn.substring(7);
    }

    // 한 줄 출력
    public void printInfo() {
        System.out.println(getNum() + " " + getName() + " " + getMajor() + " " + getPhoneFormatted());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("학번 이름 전공 전화번호 (띄어쓰기로 구분) 입력:");

        for (int i = 0; i < 3; i++) {
            students[i] = new Student(sc);  // 입력은 Student에서 처리
        }

        System.out.println("\n입력된 학생 정보:");
        for (Student s : students) {
            s.printInfo();
        }
    }
}
