package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;

import java.util.List;


public class UniqueFinder {
    public String uniqueChars(String s) {

        if (s == null) { throw new IllegalArgumentException();
        }


        List<Character> chars = new ArrayList();
        for (char c: s.toCharArray()) {
            if (Character.isDefined(c))
                chars.add(c);
        }
        return chars.toString();
    }
}
