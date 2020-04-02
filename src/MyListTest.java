public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> arrList = new MyList(10);

        System.out.println(arrList.add("STT"));
        arrList.add(1, "Player1");
        arrList.add(2, "Player2");
        arrList.add(3, "Player3");
        arrList.add("Player5");
        arrList.add("Player4");
        arrList.add("Player6");
        arrList.remove(4);
        arrList.add(5, "Player5");
        arrList.displayList();
        System.out.println("List player size : " + arrList.size());

        MyList<Object> gamerList = (MyList<Object>) arrList.clone();
        gamerList.add("Player7");
        System.out.println("\nlist gamer (clone of list player) : ");
        gamerList.displayList();
        System.out.println("clone list size: "+gamerList.size());

//        MyList<Object> gamerList = new MyList<>();
        System.out.println("\nPlayer list :");
        arrList.displayList();

        System.out.println("\nPlayer 30 in list ? " + arrList.contain("Player30"));
        System.out.println("Player 3 in list ? " + arrList.contain("Player3"));

        System.out.println("\nget player : " + arrList.get(5));

        System.out.println("\nget remove player : " + arrList.remove(4));
        arrList.displayList();

        arrList.clear();
        System.out.println("\nAfter clear list : ");
        arrList.displayList();

    }
}
