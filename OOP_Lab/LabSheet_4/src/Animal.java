public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
