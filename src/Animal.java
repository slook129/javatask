public class Animal {

    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void Run(int distance){
        System.out.println(name +" ran " + distance);
    }
    public void Swim(int distance){
        System.out.println(name + " swam " + distance);
    }
}
