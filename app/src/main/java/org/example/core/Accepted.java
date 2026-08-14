public class Accepted{
    private Ballot bal;
    private int val; 
    private int acceptorID;
    public Accepted(Ballot bt, int v, int aID){
        this.bal = bt;
        this.val = v;
        this.acceptorID = aID; 
    }
    public void setBallot(Ballot b){
        this.bal = b;
    }
    public Ballot getBallot(){
        return bal; 
    }
    public void setVal(int v){
        this.val = v;
    }
    public int getVal(){
        return val; 
    }
}