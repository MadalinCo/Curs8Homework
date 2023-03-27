package SecondEx;

public interface Person {

     default String getFirstName( String firstName){

         return firstName;
     }
     default String getLastName(String lastName){
         return lastName;
     }
     default int getBirthday (int birthday){
         return birthday;
     }
      default String getAddress(String address){
         return address;
     }
}

