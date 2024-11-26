public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
      return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
          int cnt = 0;
        int checkcnt =0;
        for (int i = 0; i < str1.length(); i++) {
            cnt = i;
            if(str2.charAt(0) ==str1.charAt(i))
            {
                for (int j = 0; j < str2.length(); j++) {
                    if(str2.charAt(j) ==str1.charAt(cnt))
                    {
                        checkcnt ++;
                        cnt ++;
                    }
                }
                if(checkcnt == str2.length())
                    return true;
                else checkcnt=0;
            }


        }
        return false;
    }
}
