package DAY_10.VsCode;
class Name{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class getterSetter{
    public static void main(String[] args){
        Name n=new Name();
        n.setName("Sugasri");
        System.out.println(n.getName());
    }
}
//Mainly used in java springboot