package jtraining.impl.customproblems;

import jtraining.common.customproblems.CustomProblem;

/**
 * partial regular expression pattern matching for . and *
 */
public class RegularExpressionMatching implements CustomProblem<Boolean> {
    private String str;
    private String pattern;

    public RegularExpressionMatching(String str, String pattern) {
        this.str = str;
        this.pattern = pattern;
    }

    @Override
    public Boolean run() {
        return isMatch(this.str, this.pattern);
    }

    private boolean isMatch(String str, String pattern){
        int i = 0;
        int j = 0;

        boolean isAsterisk = false;
        while (i < str.length() && j < pattern.length()){
            char patChar = pattern.charAt(j);
            isAsterisk = j + 1 < pattern.length() && pattern.charAt(j + 1) == '*';

            if(isAsterisk){
                while(i < str.length() && str.charAt(i) == patChar) i ++;
            } else {
                if(str.charAt(i) != patChar && patChar != '.') return false;
                i ++;
            }

            j = isAsterisk ? j + 2 : j + 1;
        }

        if(i != str.length() || j != pattern.length()) return false;

        return true;
    }
}
