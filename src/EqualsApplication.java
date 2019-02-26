public class EqualsApplication {

    public static void main(String[] args) {

        Person p1 = new Person ("Steven", "Grey");
        Person p2 = new Person ("Steven", "Grey");
        Person p3 = p2;

        System.out.println("Reflective");
        System.out.println(p1.equals(p1));

        System.out.println("Transitive");
        boolean p1Ep2 = p1.equals(p2);
        boolean p2Ep3 = p2.equals(p3);
        System.out.println(p1.equals(p3));

        System.out.println("Symmetric");
        boolean p1Ep3 = p1.equals(p2);
        boolean p2Ep1_ = p2.equals(p1);
        System.out.println(p2Ep1_);

        System.out.println("Consistent");
        System.out.println("invocation1: " + p1.equals(p2));
        System.out.println("invocation2: " + p1.equals(p2));
        System.out.println("invocation3: " + p1.equals(p2));
        p2.setAge(35);
        System.out.println("invocation 4: " + p1.equals(p2));

        System.out.println("null-safe");     //null safe
        System.out.println(p1.equals(null));


/*
        if(p1 == p2) {
            System.out.println("objects are the same");
        }else {
            System.out.println("objects are not the same");
        }

        if (p2 == p3) {
            System.out.println("objects p2 and p3 are the same");
        }else {
            System.out.println("objects p2 and p3 are not the same");
        }

        boolean p1EqualsP2 = p1.equals(p2);
        if (p1EqualsP2) {
            System.out.println("objects p1 is equal to p2");
        }else {
            System.out.println("object p1 is not equal to p2");
        }
        System.out.println("p1 equals string: " + p1.equals("asasdsa"));
        */

    }
}
