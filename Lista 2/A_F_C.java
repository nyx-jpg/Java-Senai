package temperatura;

import java.util.Scanner;

public class Temperatura {

    private int cels;

    public Temperatura() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a temperatura Celsius: ");
        setCels(sc.nextInt());
        System.out.println("A Temperatura convertida é de: " + getCels());
    }

    public int getCels() {
        return cels;
    }

    public void setCels(int cels) {
        this.cels = (cels * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        new Temperatura();
    }
}
