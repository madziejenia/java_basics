package Homework;

public class Capital {

    public static void main(String[] args) {

        String name = "The Walking Dead";
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();  // to daje tylko pierwsza litere duza
        name = name.toUpperCase(); // to zmienia cale zdanie na duze litery
        System.out.println(name);

    }
}