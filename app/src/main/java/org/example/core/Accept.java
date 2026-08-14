public class Accept{
    private Ballot ballot; 
    private int value;
    public Accept(Ballot b, int v){
        this.ballot = b;
        this.value = v; 
    }
    public void setBallot(Ballot ba){
        this.ballot = ba;
    }
    public Ballot getBallot(){
        return ballot; 
    }
    public void setValue(int va){
        this.value = va;
    }
    public int getValue(){
        return value; 
    }
}