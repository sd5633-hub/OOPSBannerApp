import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // HashMap to store character patterns
    private static Map<Character, String[]> bannerCharacterMap;

    // Static block to initialize map
    static {
        bannerCharacterMap = buildCharacterPatterns();
    }
	    // Builds and returns the HashMap containing character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }
    // Displays banner message
    public static void displayBanner(String message) {

        int height = 5;  // each character has 5 rows

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = bannerCharacterMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }
    public static void main(String[] args) {

        String word = "OOPS";

        displayBanner(word);

        System.out.println("\nProgram Exited Successfully.");
    }
}