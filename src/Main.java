public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bobik", 3, "orange", true);

        // геттер + проверка
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getColor());
        System.out.println(animal.getFed());


        // сеттер
        animal.setName("Bobik2");
        animal.setAge(1);
        animal.setColor("white");
        animal.setFed(false);
        animal.check(); // проверка

        // animal.name пробежал кол-во метров
        animal.run(10);
    }
}