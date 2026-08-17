public class PromiseMsg{
    private Ballot promisedBallot;
    private int acceptorID;
    private int value; 
    public PromiseMsg(Ballot pb, int aID, int v){
        this.promisedBallot = pb;
        this.acceptorID = aID;
        this.value = v; 
    }
    public void setPromisedBallot(Ballot i){
        promisedBallot = i;
    }
    public Ballot getPromisedBallot(){
        return promisedBallot;
    }
    public void setAcceptorId(int l){
        this.acceptorID = l;
    }
    public int getAcceptorId(){
        return acceptorID; 
    }
    public int getValue(){
        return value;
    }
    public void setValue(int va){
        this.value = va; 
    }
}