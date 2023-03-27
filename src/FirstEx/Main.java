package FirstEx;

public class Main {
    public static void main(String[] args){
    Fridge fridge = new Fridge();
    fridge.setPrice(2);
        System.out.println(fridge.getPrice());
        fridge.setName("Arctic");
        System.out.println(fridge.getName());
        fridge.changeTemperature(12);
        System.out.println(fridge.getTemperature());
    }
}
