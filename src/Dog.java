public class Dog {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void bark(){
        System.out.println("woof");
    }

    public String toString(){
        return "Dog: "+dogName;
    }
}
