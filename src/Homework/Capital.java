package Homework;

public class Capital {

    public static void main(String[] args) {

        String name = "The Walking Dead";
        char[] chars = name.toCharArray();

        int length = name.length();


        String result = "";
        for (int i = 0; i < length; i++) {

            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                result += c;
            }

        }

//        for (char c : chars) {
    //        if (Character.isUpperCase(c)) {
  //              result = result + c;                  // to tez moze byc
      //      }
      //  }
        System.out.println(result);
        String sub1 = name.substring(1);                // usuwa mi pierwsza litere
        System.out.println(sub1);


        String o = new String(chars);
        System.out.println(o);

        // to moje probowanie:

   //     name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();  // to daje tylko pierwsza litere duza
     //   name = name.toUpperCase(); // to zmienia cale zdanie na duze litery
       // System.out.println(name);

    }
}