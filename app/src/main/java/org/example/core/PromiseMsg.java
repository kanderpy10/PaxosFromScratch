public class PromiseMsg{
    private Ballot promisedBallot;
    private int acceptorID;
    public PromiseMsg(Ballot pb, int aID){
        this.promisedBallot = pb;
        this.acceptorID = aID; 
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
}