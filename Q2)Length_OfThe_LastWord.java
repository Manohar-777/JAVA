public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        String str = "1234 5678";
        int lastWordLength = lengthOfLastWord(str);
        System.out.println("Length of last word in '" + str + "': " + lastWordLength);
    }
}
