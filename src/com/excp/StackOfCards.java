package com.excp;

import java.util.Stack;

public class StackOfCards {
    public static void main(String[] args) {

        Stack <String> stackOfCards = new Stack<>();

        // Pushing new items to the StackOfCards
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("StackOfCards => " + stackOfCards);
        System.out.println();

        // Popping items from the StackOfCards
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("StackOfCards.pop() => " + cardAtTop);
        System.out.println("Current StackOfCards => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("StackOfCards.peek() => " + cardAtTop);
        System.out.println("Current StackOfCards => " + stackOfCards);

    }
}
