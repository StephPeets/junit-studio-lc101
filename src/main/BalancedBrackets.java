package main;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if the input
     * string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing brackets
     * (in that order), none of which mis-nest. We consider a bracket to be
     * square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets: "[LaunchCode]", "Launch[Code]",
     * "[]LaunchCode", "", "[]"
     *
     * While these do not: "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

        int firstOpenBracket = str.indexOf('[');
        int firstCloseBracket = str.indexOf("]");

        int lastOpenBracket = str.lastIndexOf('[');
        int lastCloseBracket = str.lastIndexOf("]");

        boolean noClosingBracket = firstCloseBracket == -1;
        boolean noOpeningBracket = firstOpenBracket == -1;

        boolean evenOpenOneCloseBrackets = (
            firstOpenBracket != lastOpenBracket && 
            firstCloseBracket == lastCloseBracket
        );

        boolean evenCloseOneOpenBrackets = (
            firstCloseBracket != lastCloseBracket && 
            firstOpenBracket == lastOpenBracket
        );

        boolean answer;
        if (noClosingBracket || noOpeningBracket) {
            answer = false;
        } else if (evenOpenOneCloseBrackets || evenCloseOneOpenBrackets) {
            answer = false;
        } else {
            answer = lastOpenBracket < lastCloseBracket;
        }

        return answer;
    }

}
