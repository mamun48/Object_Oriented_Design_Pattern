interface Laptop {
   
   void keyBoard();
   void monitor();
}

interface Desktop {
    void power();

}

class Computer implements Laptop, Desktop{
    public void monitor()
    {
        System.out.println("Laptop computer has attached monitor");
    }
    public void keyBoard()
    {
        System.out.println("Laptop computer has attached keyboard");
    }
    public void power()
    {
        System.out.println("Desktop always need to powe on");
    }
}
    


class Main{
public static void main(String[] args) {

    Computer computer = new Computer();
    computer.monitor();
    computer.power();
    computer.keyBoard();
}
}