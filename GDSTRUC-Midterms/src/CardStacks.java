import java.io.*;
import java.util.*;

public class CardStacks {
    private Cards[] stack;
    private int top;

    public CardStacks(int capacity) {
        stack = new Cards[capacity];

    }

    public void stack_push(Cards cards) {
        if (top == stack.length) {
            Cards[] newStack = new Cards[2 * stack.length]; //To resize the array
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = cards;

    }

    public void stack_PlayerPush(Cards cards) {
        if (top == stack.length) {
            Cards[] newPlayerStack = new Cards[2 * stack.length]; //To resize the array
            System.arraycopy(stack, 0, newPlayerStack, 0, stack.length);
            stack = newPlayerStack;
        }

        stack[top++] = cards;

    }

    public Cards pop() {
        if (isEmpty()) {

            throw new EmptyStackException();
        }

        Cards poppedCards = stack[--top];
        stack[top] = null;
        //stack_PlayerPush(poppedCards);

        return poppedCards;
    }

    //For accessing element
    public Cards peek() {
        if (isEmpty()) {

            throw new EmptyStackException();
        }

        //In stack, topmost value is always empty
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack(){
        System.out.println("Card Deck:");
        for(int i = top - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

}
