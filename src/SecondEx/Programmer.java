package SecondEx;

public class Programmer extends Employee{
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    String getPosition(String position) {
        return "programmer";
    }
}
