public class Node {

    private int data;
    private Node leftChild;
    private Node rightChild;

    private int value1;
    private int value2;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value == data){
            System.out.println("value to be inserted: " + value);
            return;
        }

        if (value < data){
            if (leftChild == null){
                leftChild = new Node(value);
            } else {
                leftChild.insert(value);
            }
        }

        else {
            if (rightChild == null){
                rightChild = new Node(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if (leftChild != null){ //leftChild
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if (rightChild != null){ //rightChild
            rightChild.traverseInOrder();
        }
    }
    public void traverseInOrderDescending(){
        if (rightChild != null){ //leftChild
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if (leftChild != null){ //rightChild
            leftChild.traverseInOrderDescending();
        }
    }

    public Node get(int value){
        if (value == data){
            return this;
        }

        if (value < data){ //<
            if (leftChild != null){
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild != null){
                return rightChild.get(value);
            }
        }

        return null;
    }

    public Node getMin(){
        if(leftChild != null){
            value1 = leftChild.data;
        }

        if(rightChild != null){
            value2 = rightChild.data;
        }

        if(value1 < value2){
            System.out.println("Min: " + value1);
        }

        return null;
    }

    public Node getMax(){
        if(leftChild != null){
            value1 = leftChild.data;
        }

        if(rightChild != null){
            value2 = rightChild.data;
        }

        if(value2 > value1){
            System.out.println("Max: " + value2);
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
