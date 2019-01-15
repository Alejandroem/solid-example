package Human;

public class Foot {
    private String name;

    public Foot(String name){
        this.name = name;
    }

    public void move(){
        System.out.println("Moving "+name+" foot");
    }
}
