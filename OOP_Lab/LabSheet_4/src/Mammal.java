class Mammal extends Animal {
    private String furColor;


    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}
