import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CardStacks stack = new CardStacks(30);

            System.out.println("Input a number:");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

        while(input > 5){
            System.out.println("Input a number:");
            scanner = new Scanner(System.in);
            input = scanner.nextInt();
        }

        if(input >= 1 && input <= 5) {

            //Cards
            stack.stack_push(new Cards("Card1"));
            stack.stack_push(new Cards("Thing1"));
            stack.stack_push(new Cards("Ep1"));
            stack.stack_push(new Cards("A1"));
            stack.stack_push(new Cards("Card2"));

            stack.stack_push(new Cards("kitten"));
            stack.stack_push(new Cards("dog"));
            stack.stack_push(new Cards("raccoon"));
            stack.stack_push(new Cards("parrot"));
            stack.stack_push(new Cards("shark"));

            stack.stack_push(new Cards("Jack"));
            stack.stack_push(new Cards("Queen"));
            stack.stack_push(new Cards("King"));
            stack.stack_push(new Cards("Joker"));
            stack.stack_push(new Cards("Ace"));

            stack.stack_push(new Cards("Clover"));
            stack.stack_push(new Cards("Roller Coaster"));
            stack.stack_push(new Cards("Cheetos"));
            stack.stack_push(new Cards("Potato Chips"));
            stack.stack_push(new Cards("Vcut"));

            stack.stack_push(new Cards("Brain"));
            stack.stack_push(new Cards("Arm"));
            stack.stack_push(new Cards("Leg"));
            stack.stack_push(new Cards("Feet"));
            stack.stack_push(new Cards("Hand"));

            stack.stack_push(new Cards("Iphone"));
            stack.stack_push(new Cards("Ipad"));
            stack.stack_push(new Cards("Android"));
            stack.stack_push(new Cards("PC"));
            stack.stack_push(new Cards("Laptop"));

            stack.printStack();

            System.out.println("");

            for (int i = 0; i < input; i++) {

                System.out.println("Popping: " + stack.pop());
            }

            System.out.println("");

            stack.printStack();

            System.out.println("");

        }

    }
}