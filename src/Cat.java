public class Cat {
    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String toString(){
        return "Cat: "+catName;
    }
}
