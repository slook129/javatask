public class Tiger extends Animal{
    public Tiger(String name){
        this.setName(name);
    }
    @Override
    public void Swim(int distance){
        if(distance > 100){
            System.out.println(this.getName() + " didn't swim distance too big(" + distance + ")");
        }
        else{
            System.out.println(this.getName() + " swam " + distance);
        }
    }
}
