import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random dice = new Random();
        int num = dice.nextInt(6);

        ArrayQueue queue = new ArrayQueue(num);

        queue.add(new Player(1, "Vasquez", 12));
        queue.add(new Player(21, "Ryan", 1));
        queue.add(new Player(14, "Lorenzo", 2));
        queue.add(new Player(5, "John", 120));
        queue.add(new Player(6, "Kennedy", 132));
        queue.add(new Player(8, "Luis", 412));

        queue.printQueue();

        for (int i = 0; i < 5; i++){
            queue.remove();
        }

        System.out.println("After popping: " + queue.remove());
        queue.printQueue();
    }
}