public class StringHandling2 {
    public static void main(String[] args) {
        String string1 = "United Kingdom";
        String string2 = "Germany";
        String sub1 = string1.substring(0, string1.indexOf(' '));
        String sub2 = string1.substring(string1.indexOf(' ') + 1);

        char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();
        System.out.println(charArray);
    }
}
