import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split("[ ,]+");

        List<Integer> nums = new ArrayList<>();
        for (String p : parts) nums.add(Integer.parseInt(p));

        Map<Integer, Integer> result = new HashMap<>();
        for (int k = 1; k <= 9; k++) {
            int count = 0;
            for (int n : nums) {
                if (n % k == 0) count++;
            }
            result.put(k, count);
        }
        System.out.println(result);

        sc.close();
    }
}
