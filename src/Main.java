public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.box(3);
        magicBox.add("Green");
        magicBox.add("Blue");
        magicBox.add("Red");
        magicBox.add("White");
        System.out.println(magicBox.pick());

        MagicBox magicBox1 = new MagicBox();
        magicBox1.box(5);
        magicBox1.add(12);
        magicBox1.add(15);
        magicBox1.add(14);
        magicBox1.add(20);
        System.out.println(magicBox1.pick());
    }
}
