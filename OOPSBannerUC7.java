/**
 * OOPS Banner App - UC7
 * Demonstrates encapsulation using Inner Static Class
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store character and its 7-line pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character symbol
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern
         *
         * @return String array of pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build final banner line using StringBuilder
     *
     * @param characters array of CharacterPatternMap objects
     * @param row        current row index
     * @return constructed banner row
     */
    public static String buildBannerLine(CharacterPatternMap[] characters, int row) {
        StringBuilder sb = new StringBuilder();

        for (CharacterPatternMap cp : characters) {
            sb.append(cp.getPattern()[row]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Create character objects
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[]{
                "  ****** ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[]{
                "  ****** ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        // Store characters in array (O O P S)
        CharacterPatternMap[] word = {letterO, letterO, letterP, letterS};

        // Build and print banner
        for (int row = 0; row < 7; row++) {
            System.out.println(buildBannerLine(word, row));
        }
    }
}