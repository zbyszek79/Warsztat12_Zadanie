package pl.zajavka.case1;

public abstract class Animal {

    private String name;

    protected String whatIsYourName() {
        return "I don't have any";
    }

    protected void whatDoYouEat(String eat) {
        System.out.println(eat);
    }
}
