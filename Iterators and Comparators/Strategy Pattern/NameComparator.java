package IteratorsAndComparators.Strategy_Pattern;

import java.util.Comparator;
import java.util.Locale;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if (first.getName().length() == second.getName().length()) {
            char firstPerson = first.getName().toLowerCase(Locale.ROOT).charAt(0);
            char secondPerson = second.getName().toLowerCase(Locale.ROOT).charAt(0);
            return Character.compare(firstPerson, secondPerson);
        }
        return Integer.compare(first.getName().length(), second.getName().length());
    }
}
