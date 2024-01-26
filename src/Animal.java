public class Animal {
    private String name;
    private int age;
    private String color;
    private boolean fed;

    public Animal(String name, int age, String color, boolean fed){
        this.name = name;
//        this.age = age;
        this.color = color;
        this.fed = fed;
        if(age >= 0){
            this.age = age;
        }
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean getFed(){
        return fed;
    }
    public String getColor() {
        return color;
    }
    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public void run(int dist){
        System.out.println(name + " пробежал " + dist + " метров");
    }
    public void check(){
        System.out.println(name + " " + age + " " + color + " " + fed);
    }

}
