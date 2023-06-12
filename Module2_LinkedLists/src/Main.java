public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "asuna", 100);
        Player Lethalbacon = new Player(2, "Lethalbacon", 205);
        Player MeWontDie = new Player(3, "MeWontDie", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(Lethalbacon);
        playerLinkedList.addToFront(MeWontDie);

        playerLinkedList.printList();
    }
}