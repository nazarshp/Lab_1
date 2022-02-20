package ua.lviv.iot.Lab_1;

public class Main {
    public static void main(String[] args) {
        Insect myInsect0 = new Insect("spider", false, 6);
        Insect myInsect = new Insect("fly", 0.0013, 0.15, true, 6);
        Insect myInsect1 = new Insect("bee", 0.0012, 0.10, true, 4);
        System.out.println(myInsect0.toString2());
        System.out.println(myInsect.toString());
        System.out.println(myInsect1.toString());
    }
}
