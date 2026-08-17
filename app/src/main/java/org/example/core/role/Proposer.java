public class Proposer{
    private enum Phase {IDLE, PREPARING, ACCEPTING}
    private int nodeId;
    private Ballot currentBallot;
    private int prefValue;
    private Phase phase;
    private Map<Integer, PromiseMsg> promCollection;
    private Map<Integer, Accepted> acceptCollection;
    private int quorumSize;
    public Proposer(int n, Ballot cb, int pv, Phase p, Map<Integer, PromiseMsg> pc, Map<Integer, Accepted> ac, int qs){
        this.nodeId = n;
        this.currentBallot = cb;
        this.prefValue = pv;
        this.phase = p;
        this.promCollection = pc;
        this.acceptCollection = ac;
        this.quorumSize = qs; 
    }
    public int getNodeId(){
        return nodeId;
    }
    public void setNodeId(int n){
        this.nodeId = n;
    }
    public Ballot getCurrentBallot(){
        return currentBallot; 
    }
    public void setCurrentBallot(Ballot c){
        this.currentBallot = c; 
    }
    
}