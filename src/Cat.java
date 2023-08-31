public class Cat extends Animal {
    public Cat(String name){
        this.setName(name);
    }
    @Override
    public void Run(int distance) {
        if(distance > 200){
            System.out.println(this.getName() + " didn't run distance too big (" + distance + ")");
        }
        else {
            System.out.println(this.getName() + " run " + distance);
        }
    }
    @Override
    public void Swim(int distance){
        System.out.println(this.getName() + " can not swim (" + distance + ")");
    }
}
