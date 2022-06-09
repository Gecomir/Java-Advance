package DefiningClasses.Google;
//created by J.M.

import java.util.List;

public class Person {

    private final String name;
    private final List<Pokemon> pokemonList;
    private final List<Parent>parentList;
    private final List<Children>childrenList;
    private Company company;
    private Car car;

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(String name, List<Pokemon> pokemonList, List<Parent> parentList, List<Children> childrenList) {
        this.name = name;
        this.pokemonList = pokemonList;
        this.parentList = parentList;
        this.childrenList = childrenList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }
    public void printFormat(){
        System.out.println(name);
        System.out.println("Company:");
        if(company!=null) {
            System.out.println(company.format());
        }
        System.out.println("Car:");
        if(car!=null) {
            System.out.println(car.format());
        }
        System.out.println("Pokemon:");
        if(!getPokemonList().isEmpty()) {
            getPokemonList().forEach(e -> System.out.printf("%s%n", e.format()));
        }
        System.out.println("Parents:");
        if(!getParentList().isEmpty()) {
            getParentList().forEach(e -> System.out.printf("%s%n", e.format()));
        }
        System.out.println("Children:");
        if(!getChildrenList().isEmpty()) {
            getChildrenList().forEach(e -> System.out.printf("%s%n", e.format()));
        }
    }
}
