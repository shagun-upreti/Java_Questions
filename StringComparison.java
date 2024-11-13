public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Using .equals() - case-sensitive comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (case-sensitive)");
        } else {
            System.out.println("Strings are not equal (case-sensitive)");
        }

        // Using .equalsIgnoreCase() - case-insensitive comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal (ignoring case)");
        }

        // Using compareTo() - lexicographical comparison
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are equal (lexicographically)");
        } else if (result < 0) {
            System.out.println("str1 is lexicographically less than str2");
        } else {
            System.out.println("str1 is lexicographically greater than str2");
        }

        // Using compareToIgnoreCase() - lexicographical comparison ignoring case
        result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("Strings are equal (lexicographically, ignoring case)");
        } else if (result < 0) {
            System.out.println("str1 is lexicographically less than str2 (ignoring case)");
        } else {
            System.out.println("str1 is lexicographically greater than str2 (ignoring case)");
        }
    }
}