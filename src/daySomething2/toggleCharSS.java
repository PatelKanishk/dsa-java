package daySomething2;

public class toggleCharSS {
    
    public static void main(String[] args) {
        String str = "xvWzjL";
        String result = toggle(str);
        System.out.println(result);
    }

    public static String toggle(String str) { // character manipulation
        // 1. create a sb
        StringBuilder sb = new StringBuilder(str);

        // 2. get current char, and set new char
        for (int i = 0; i < sb.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // lower case
                char nc = (char) (ch - 'a' + 'A');
                sb.setCharAt(i, nc);
            } else if (ch >= 'A' && ch <= 'Z') { // upper case
                char nc = (char) (ch - 'A' + 'a');
                sb.setCharAt(i, nc);
            }

        }

        return sb.toString();
    }
}
