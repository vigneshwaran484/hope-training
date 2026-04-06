package DAY_10.Task;

class Car{
    private String model;
    private int CC;
    private int price;
    private String color;
    public void setModel(String model){
        this.model=model;
    }
    public void setCC(int CC){
        this.CC=CC;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getModel(){
        return model;
    }
    public int getCC(){
        return CC;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
}
public class CarCompanyEncapsulation {
    public static void main(String[] args) {
        Car car =new Car();
        car.setModel("BMW");
        car.setCC(2000);
        car.setPrice(5000000);
        car.setColor("Black");
        System.out.println("Model: "+car.getModel());
        System.out.println("CC: "+car.getCC());
        System.out.println("Price: "+car.getPrice());
        System.out.println("Color: "+car.getColor());
    }
}
