package pl.zajavka.case1;

public class Cat extends Animal {

    private String milk;
    private String name;

    public Cat(String milk) {
        this.milk = milk;
    }

    @Override
    public String whatIsYourName() {
        return "My name is Cat";
    }
}
