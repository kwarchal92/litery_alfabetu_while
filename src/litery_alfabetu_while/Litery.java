package litery_alfabetu_while;

public class Litery {

    public static void main(String[] args)
    {
        char znak;

        System.out.println("\nProgram wyswietla duze litery A-Z oraz Z-A.\n");

        znak = 'A';

        while(znak <= 'Z')
        {
            if (znak < 'Z')
                System.out.print(znak + ",");
            else
                System.out.print(znak + ".\n");
            znak++;
        }

        znak = 'Z';

        while(znak >= 'A')
        {
            if (znak > 'A')
                System.out.print(znak + ",");
            else
                System.out.print(znak + ".");
            znak--;
        }

    }
}
