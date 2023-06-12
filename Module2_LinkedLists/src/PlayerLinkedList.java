import java.util.ArrayList;
import java.util.List;

public class PlayerLinkedList {
    private PlayerNode head;

    private int nodeCount;
    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);

        //Sets playerNode's next to
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.println("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
            nodeCount++;
        }

        System.out.println("null");

        //2 - create a size variable that determines how many elements are present in your Linked List.
        System.out.println("No. of Nodes -> " + nodeCount);

    }


}
