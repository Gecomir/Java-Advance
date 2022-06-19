package IteratorsAndComparators.Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!line.equals("END")) {
            String[] information = line.split(" ");
            String name = information[0];
            int age = Integer.parseInt(information[1]);
            String city = information[2];

            Person person = new Person(name, age, city);
            people.add(person);

            line = scanner.nextLine();
        }
        int comparePersonIndex = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(comparePersonIndex - 1);

        int totalPeople = people.size();
        int samePeople = 0;
        int differentPeople = 0;

        for (Person person : people) {
            if (person.compareTo(personToCompare) == 0) {
                samePeople++;
            } else {
                differentPeople++;
            }
        }
        if (samePeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, differentPeople, totalPeople);
        }
    }
}
