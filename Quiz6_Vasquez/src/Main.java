public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(20);
        tree.insert(5);
        tree.insert(15);
        tree.insert(12);
        tree.insert(24);
        tree.insert(21);
        tree.insert(70);
        tree.insert(10);

        tree.traverseInOrderDescending();
        System.out.println(tree.get(70));
        System.out.println(tree.getMin());
        System.out.println(tree.getMax());
    }
}