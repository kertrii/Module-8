public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);
        System.out.println("Size after removal: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}