public class Human {

    private enum Actions {
        doingNothing,
        walking,
        waving
    }

    private Arm leftArm;
    private Arm rightArm;
    private Foot leftFoot;
    private Foot rightFoot;
    private Actions currentAction;


    public Human(){
        this.currentAction = Actions.doingNothing;
        this.leftArm = new Arm("left");
        this.rightArm = new Arm("right");
        this.leftFoot = new Foot("left");
        this.rightFoot = new Foot("right");
    }

    public void startWalking(){
        this.rightFoot.move();
        this.leftFoot.move();
        this.currentAction = Actions.walking;

    }

    public void startWaving(){
        this.leftArm.wave();
        this.rightArm.wave();
        this.currentAction = Actions.waving;
    }

}
