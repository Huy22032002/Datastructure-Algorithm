package fresher.string.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1 ; i < strs.length ; i++) {
            while(strs[i].startsWith(prefix)) {
                if(!strs[i].equals(prefix) && prefix.length() > strs[i].length()) {

                }

                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("while loop: prefix = " + prefix);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = new String[]{"huy", "hauy123", "hauy456"};
        System.out.println("Longest common Prefix: " + longestCommonPrefix.longestCommonPrefix(arr));
    }
}
