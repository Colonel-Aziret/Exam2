public class Fiction_Literature extends Department {
    private final String name = "Художественная литература";
    private static int i;

    public Fiction_Literature() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void addBooks(Book book) {
        for (; i < getBooks().length; ) {
            if (this.getBooks()[i] == null) {
                this.getBooks()[i] = book;
                break;
            } else this.getBooks()[i + 1] = book;
            break;
        }
        i++;
    }

    @Override
    public String toString() {
        return String.format("Отдел: %s | Число книг %s", name, getCountBooks());
    }
}
