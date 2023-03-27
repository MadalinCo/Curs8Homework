package SecondEx;




public class ThirdEx implements Person{
    @Override
    public String getFirstName(String firstName) {
        return Person.super.getFirstName(firstName);
    }

    @Override
    public String getLastName(String lastName) {
        return Person.super.getLastName(lastName);
    }

    @Override
    public int getBirthday(int birthday) {
        return Person.super.getBirthday(birthday);
    }

    @Override
    public String getAddress(String address) {
        return Person.super.getAddress(address);
    }
    public String fullName() {
        return getFirstName("") + (getLastName(""));
    }
    public int age(){
        return 0;
    }
}
