public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Create final banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
            );
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for letter O
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[] {
                "  ****** ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[] {
                "  ****** ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }
}