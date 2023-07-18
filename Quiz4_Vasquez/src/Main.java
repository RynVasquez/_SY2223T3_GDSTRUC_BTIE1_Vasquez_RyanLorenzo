public class Main {
    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player loo = new Player(14, "Loo-uise", 15);
        Player plo = new Player(34, "plo-koon", 5);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(loo.getUserName(), loo);
        hashtable.put(plo.getUserName(), plo);

        //hashtable.printHashtable();
        System.out.println(hashtable.remove("Plooful"));
    }
}