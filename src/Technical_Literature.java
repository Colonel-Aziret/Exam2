public class Technical_Literature extends Department {
    private final String name = "Техническая литература";
    private boolean isComputer;
    private static int i;

    public Technical_Literature(){}

    public Technical_Literature(boolean isComputer){
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }
    @Override
    public void addBooks(Book book) {
        for (; i < getBooks().length;) {
            if (this.getBooks()[i] == null) {
                this.getBooks()[i] = book;
                break;
            } else this.getBooks()[i + 1] = book;break;
        }
        i++;
    }

    @Override
    public String toString() {
        return String.format("Отдел: %s | Число книг %s | %s" , name, getCountBooks(), isComputer ? "Компьютеры имеются" : "Нет компьютеров");
    }
}
