public class Library {
    public static void main(String[] args) {
        // Отделы библиотеки

        Fiction_Literature fiction_literature = new Fiction_Literature();
        Law_Literature law_literature = new Law_Literature();
        Technical_Literature technical_literature = new Technical_Literature(true);

        Book whiteSteamship = new Book("Чынгыз Айтматов",616507,"Белый пароход",1970);
        Book firstTeacher = new Book("Чынгыз Айтматов",391017,"Первый учитель",1962);
        Book theQueenOfSpades = new Book("Александр Пушкин",598134,"Пиковая дама",1833);
        Book warAndPeace = new Book("Лев Толстой", 610566,"Война и мир",1865);

        System.out.println(fiction_literature.getName());

        fiction_literature.addBooks(whiteSteamship);
        fiction_literature.addBooks(firstTeacher);
        fiction_literature.addBooks(theQueenOfSpades);
        fiction_literature.addBooks(warAndPeace);

        fiction_literature.printBooks();
        fiction_literature.searchAuthor();
        System.out.println();
        fiction_literature.printInfoDepartment();
        System.out.println("------------------------------------------------------------------------------------------");

        Book civilCodeForDummies1 = new Book("Дмитрий Усольцев",920624,"Гражданский кодекс для чайников 1",2016);
        Book civilCodeForDummies2 = new Book("Дмитрий Усольцев",930534,"Гражданский кодекс для чайников 2",2018);

        System.out.println(law_literature.getName());

        law_literature.addBooks(civilCodeForDummies1);
        law_literature.addBooks(civilCodeForDummies2);

        law_literature.printBooks();
        law_literature.searchAuthor();
        System.out.println();
        law_literature.printInfoDepartment();
        System.out.println("------------------------------------------------------------------------------------------");

        Book javaWebServices = new Book("Тимур Машнин",97752,"Web-сервисы Java",2011);
        Book digitalTransformation = new Book("Александр Чесалов",982970,"Цифровая трансформация",2020);

        System.out.println(technical_literature.getName());

        technical_literature.addBooks(javaWebServices);
        technical_literature.addBooks(digitalTransformation);

        technical_literature.printBooks();
        technical_literature.searchAuthor();
        System.out.println();
        technical_literature.printInfoDepartment();
    }
}
