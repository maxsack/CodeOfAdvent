package generals;

public class CheckDuplicates {
    public static String execute(String s, int len)
    {
        String str = "";

        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);

            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
        return str;
    }
}
