public class Main {
    public static void main(String[] args) {
        // LinkedList pruebas
        List<String> linked = new LinkedList<>();
        linked.add("A");
        linked.add("B");
        linked.add("C");
        System.out.println("LinkedList positiva: " + linked.get(1)); // B
        System.out.println("LinkedList negativa: " + linked.get(10)); // Error

        linked.remove(0); // elimina A
        System.out.println("LinkedList después de remove: " + linked.get(0)); // B

        // ArrayList pruebas
        List<String> array = new ArrayList<>();
        array.add("X");
        array.add("Y");
        array.add("Z");
        System.out.println("ArrayList positiva: " + array.get(2)); // Z
        System.out.println("ArrayList negativa: " + array.remove(100)); // Error

        array.add("W", 1); // inserta W en posición 1
        System.out.println("ArrayList después de insert: " + array.get(1)); // W
    }
}

