public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hogwarts[] people = {
                new Gryffindor("Гарри Поттер", 90, 95,90,90,99),
                new Gryffindor("Гермиона Грейнджер", 85, 60,90,89,90),
                new Gryffindor("Рон Уизли", 80, 75,85,95,90),
                new Hufflepuff("Захария Смит", 72, 58,80,85,99),
                new Hufflepuff("Седрик Диггори", 50, 55,63,65,75),
                new Hufflepuff("Джастин Финч-Флетчли", 50, 50,50,50,50),
                new Ravenclaw("Чжоу Чанг", 80, 60,75,83,91,70),
                new Ravenclaw("Падма Патил", 70, 67,70,91,32,99),
                new Ravenclaw("Маркус Белби", 40, 50,66,82,57,70),
                new Slytherin("Драко Малфой", 90, 90,90,90,90,90,90),
                new Slytherin("Грэхэм Монтегю", 55, 69,70,70,70,70,70),
                new Slytherin("Грегори Гойл", 60, 60,60,60,60,60,60)
        };
        System.out.println(people[8].toString() );
        people[1].compare(people[10]);
        people[4].compare(people[6]);
    }

}