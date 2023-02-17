package podstawy;

public class StringDemo {
    public static void main(String[] args) {

        String name = "Gienek";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name);

    }
}
