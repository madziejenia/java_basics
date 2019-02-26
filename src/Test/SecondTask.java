package Test;

public class SecondTask {

    public static void main(String[] args)
    {

        String[] animals = {"Cat", "Dog", "Elephant", "Dog", "Cat"};

        for (int i = 0; i < animals.length-1; i++)
        {
            for (int j = i+1; j < animals.length; j++)
            {
                if ((animals[i] == animals [j]) && (i != j))
                {
                    System.out.println("Duplicated animal : " + animals[j]);
                }
            }
        }
    }
}

