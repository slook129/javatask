public class Dog extends Animal {
    public Dog(String name){
        this.setName(name);
    }
    @Override
    public void Run(int distance) {
        if(distance > 500){
            System.out.println(this.getName() + " didn't run distance too big(" + distance + ")");
        }
        else {
            System.out.println(this.getName() + " run " + distance);
        }
    }
    @Override
    public void Swim(int distance){
        if(distance > 10){
            System.out.println(this.getName() + " didn't swim distance too big(" + distance + ")");
        }
        else{
            System.out.println(this.getName() + " swam " + distance);
        }
    }
}
