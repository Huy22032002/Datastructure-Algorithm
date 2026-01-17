package fresher.string.easy;

public class ReverseString {

    /*
        Use loop
        Disadvantage: create new String in Heap for = total loop
     */
    public String reverseString(String s) {
        String reverseStr = "";
        for(int i = s.length() - 1 ; i >= 0; i--) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }

    /*
        Use String Builder
        Advantage: just create 1 Object in Heap
     */
    public String reverseString2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String reverseString3(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("Reverse String in Loop Method: " + reverseString.reverseString("huy"));
        System.out.println("Reverse String in StringBuilder Method: " + reverseString.reverseString2("huy"));
        System.out.println("Reverse String in StringBuilder Method 2: " + reverseString.reverseString3("huyy"));

    }
}
