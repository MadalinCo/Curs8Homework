package SecondEx;

public class DatabaseAdmin extends Programmer{
    private String dbTechnology;

    public String getDbTechnology() {
        return dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress(String address) {
        return ("db admin:" + super.getAddress(address));
    }
}
