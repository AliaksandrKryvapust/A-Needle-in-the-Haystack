public class Source {
    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1).equals("found the needle at position 3"));
    }
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
           if (haystack[i]=="needle") {
               return "found the needle at position " + (i); // "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
           }
        } return "the needle is not found";
    }
}
