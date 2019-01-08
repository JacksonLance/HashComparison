

public class Main {


    public static void main (String args[])
    {

        System.out.println(HP.ToSHA256("Thursday".getBytes()));
        System.out.println(HP.ToSHA256("Thursday".getBytes()));
        System.out.println(HP.CompareSHA256("Thursday", "Thursday"));
        System.out.println(HP.ToSHA256("thursday".getBytes()));
        System.out.println(HP.CompareSHA256("Thursday", "thursday"));
        System.out.println(HP.ToSHA512("Thursday".getBytes()));
        System.out.println(HP.ToSHA512("thursday".getBytes()));
        System.out.println(HP.CompareSHA512("Thursday", "thursday"));
        System.out.println(HP.CompareBooleans("Thursday", "thursday"));

        System.out.println(HP.CompareBooleans("20","50"));


        System.out.println("Run Fridays. The vast majority of booleans are true. Only rare ones are not going to be.");
        String words[] = {"Friday", "FridaY", "friday", "FRIDAY", "fridayyy", "FRIDDAYY"};
        for (int i = 1; i < 6; i++)
        {
            System.out.println(HP.CompareBooleans(words[i - 1],words[i]));
        }
        System.out.println("A fun thing to think about is why thse two are so close.");
        System.out.println(HP.ToSHA256("hashed in SHA256".getBytes()));
        System.out.println(HP.ToSHA256("Hashed in SHA256".getBytes()));




    }

}
