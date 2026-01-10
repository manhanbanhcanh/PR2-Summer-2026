package TUT1;

/*
Write a program that will print your initials to standard output in letters that are nine lines tall.
Each big letter should be made up of a bunch of *’s. For example, if your initials were “DJE”,
then the output would look something like:
******             *************     **********
**    **                **           **
**      **              **           **
**        **            **           **
**        **            **           ********
**        **     **     **           **
**      **         **   **           **
**    **             ** **           **
*****                 ****           **********
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity3 {
    private static final Map<Character, String[]> FONT = new HashMap<>();
    private static final int HEIGHT = 9;
    private static final int WIDTH = 14;

    // I used the "Prettier" plugin in VSCode to make this readable (it took me 1 hour, and it doesn't work by the way)
    // I'm deeply sorry (please turn off line warp if you have it enable)
    static {
        FONT.put('A', normalize(new String[]{"      **", "     ****", "    ** **", "   ** **", "  **********", " ** **", "** **", "** **", "** **"}));
        FONT.put('B', normalize(new String[]{"*********", "** **", "** **", "** **", "*********", "** **", "** **", "** **", "********* "}));
        FONT.put('C', normalize(new String[]{"  ********", " ** **", "**", "**", "**", "**", "**", " ** **", "  ********"}));
        FONT.put('D', normalize(new String[]{"******", "** **", "** **", "** **", "** **", "** **", "** **", "** **", "*****"}));
        FONT.put('E', normalize(new String[]{"**********", "**", "**", "**", "********", "**", "**", "**", "**********"}));
        FONT.put('F', normalize(new String[]{"**********", "**", "**", "**", "********", "**", "**", "**", "**"}));
        FONT.put('G', normalize(new String[]{"  ********", " ** **", "**", "**", "** ******", "** **", "** **", " ** **", "  ********"}));
        FONT.put('H', normalize(new String[]{"** **", "** **", "** **", "** **", "**********", "** **", "** **", "** **", "** **"}));
        FONT.put('I', normalize(new String[]{"**********", "    **", "    **", "    **", "    **", "    **", "    **", "    **", "**********"}));
        FONT.put('J', normalize(new String[]{"*************", "      **", "      **", "      **", "      **", "** **", "** **", "  ** **", "    ****"}));
        FONT.put('K', normalize(new String[]{"** **", "** **", "** **", "** **", "****", "** **", "** **", "** **", "** **"}));
        FONT.put('L', normalize(new String[]{"**", "**", "**", "**", "**", "**", "**", "**", "**********"}));
        FONT.put('M', normalize(new String[]{"** **", "*** ***", "**** ****", "** **** **", "** ** **", "** **", "** **", "** **", "** **"}));
        FONT.put('N', normalize(new String[]{"** **", "*** **", "**** **", "** ** **", "** ** **", "** ** **", "** ****", "** ***", "** **"}));
        FONT.put('O', normalize(new String[]{"  ********", " ** **", "** **", "** **", "** **", "** **", "** **", " ** **", "  ********"}));
        FONT.put('P', normalize(new String[]{"*********", "** **", "** **", "** **", "*********", "**", "**", "**", "**"}));
        FONT.put('Q', normalize(new String[]{"  ********", " ** **", "** **", "** **", "** **", "** ** **", "** **", " ** **", "  ******** **"}));
        FONT.put('R', normalize(new String[]{"*********", "** **", "** **", "** **", "*********", "** **", "** **", "** **", "** **"}));
        FONT.put('S', normalize(new String[]{"  ********", " ** **", " **", "  ********", "         **", "         **", "         **", " ** **", "  ********"}));
        FONT.put('T', normalize(new String[]{"**********", "    **", "    **", "    **", "    **", "    **", "    **", "    **", "    **"}));
        FONT.put('U', normalize(new String[]{"** **", "** **", "** **", "** **", "** **", "** **", "** **", " ** **", "  ******"}));
        FONT.put('V', normalize(new String[]{"** **", "** **", " ** **", " ** **", "  ** **", "  ** **", "   ****", "   ****", "    **"}));
        FONT.put('W', normalize(new String[]{"** **", "** **", "** **", "** ** **", "** **** **", "**** ****", "*** ***", "** **", "** **"}));
        FONT.put('X', normalize(new String[]{"** **", " ** **", "  ** **", "   ****", "    **", "   ****", "  ** **", " ** **", "** **"}));
        FONT.put('Y', normalize(new String[]{"** **", " ** **", "  ** **", "   ****", "    **", "    **", "    **", "    **", "    **"}));
        FONT.put('Z', normalize(new String[]{"**********", "       **", "      **", "     **", "    **", "   **", "  **", " **", "**********"}));
        FONT.put(' ', normalize(new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "}));
    }

    private static String[] normalize(String[] lines) {
        String[] fixedLines = new String[HEIGHT];
        for (int i = 0; i < HEIGHT; i++) {
            StringBuilder sb = new StringBuilder(lines[i]);
            while (sb.length() < WIDTH) {
                sb.append(" ");
            }
            fixedLines[i] = sb.toString();
        }
        return fixedLines;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text:");
            if (!scanner.hasNextLine()) return;
            String input = scanner.nextLine().toUpperCase();
            if (input.trim().isEmpty()) return;

            for (int row = 0; row < HEIGHT; row++) {
                StringBuilder outputLine = new StringBuilder();
                for (char c : input.toCharArray()) {
                    String[] letter = FONT.getOrDefault(c, normalize(new String[]{"*******", "* *", "* *** *", "* * * *", "* *** *", "* *", "* *", "* *", "*******"}));
                    outputLine.append(letter[row]).append("  ");
                }
                System.out.println(outputLine.toString());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}