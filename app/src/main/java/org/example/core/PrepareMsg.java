public class PrepareMsg{
    private Ballot ballot;
    public PrepareMsg(Ballot bal){
        this.ballot = bal; 
    }
    public void setBallot(Ballot i){
        this.ballot = i;
    }
    public Ballot getBallot(){
        return ballot; 
    }
}