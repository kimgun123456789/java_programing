class computer{
    private String CPU;
    private String Memory;
    private String HDD;
    private String Color;
    private String Power;

    public computer(String CPU, String Memory, String HDD, String Color, String Power) {
        this.CPU = CPU;
        this.Memory = Memory;
        this.HDD = HDD;
        this.Color = Color;
        this.Power = Power;
    }
    public String getCPU() {return CPU;}
    public String getMemory() {return Memory;}
    public String getHDD() {return HDD;}
    public String getColor() {return Color;}
    public String getPower() {return Power;}
    public String turnon(){
        return "Turning on the computer.";
    }
}


class Monitor{
    private int size;
    private String Color;
    private int Power;
    public Monitor(int size, String Color, int Power) {
        this.size = size;
        this.Color = Color;
        this.Power = Power;
    }
    public int getSize(){return size;}
    public String getColor(){return Color;}
    public  int getPower(){return Power;}

    public String turnon(){
            return "Truning on the Monitor.";
    }}


class PersonalComputer{
        private computer computer;
        private Monitor monitor;

        public PersonalComputer(computer computer, Monitor monitor){
            this.computer = computer;
            this.monitor = monitor;
        }
        public String turnOn(){
            return computer.turnon() + "\n" +monitor.turnon();

        }

        public void printinfo(){
            System.out.println(computer.turnon());
            System.out.println(monitor.turnon());

            System.out.println("The spec of the computer\n CPU:"+computer.getCPU()+"\n Memory:"+computer.getMemory()+"\n HDD:"+computer.getHDD()+"\n Color:"+computer.getColor()+ "\n Power:"+computer.getPower());
            System.out.println("The spec of the monitor\n Size:"+monitor.getSize()+" inch\n Color:"+monitor.getColor()+"\n Power:"+monitor.getPower()+"W");
        }

}




public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer PC = new PersonalComputer(new computer("CORE i7","16GB","2TB","White","500W"),new Monitor(24,"Black",45));
        PC.printinfo();
    }
}
