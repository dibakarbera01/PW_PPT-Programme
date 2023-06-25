import java.util.*;

public class Test1 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
  
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; 
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String s = scanner.nextLine();
            
            int index = firstUniqChar(s);
            System.out.println("Output " + index);
        }
    }
}
