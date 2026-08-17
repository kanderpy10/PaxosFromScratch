public class Nack{
    private Ballot rejectedBallot;
    private int acceptorID;
    private Ballot higherBallot;
    public Nack(Ballot rb, int aID, Ballot hb){
        this.rejectedBallot = rb;
        this.acceptorID = aID;
        this.higherBallot = hb;
    }
    public Ballot getRejectedBallot(){
        return rejectedBallot;
    }
    public void setRejectedBallot(Ballot rejbal){
        this.rejectedBallot = rejbal;
    }
    public int getAcceptorId(){
        return acceptorID;
    }
    public void setAcceptorId(int acceptId){
        this.acceptorID = acceptId;
    }
    public Ballot getHigherBallot(){
        return higherBallot; 
    }
    public void setHigherBallot(Ballot highbal){
        this.higherBallot = highbal; 
    }

}