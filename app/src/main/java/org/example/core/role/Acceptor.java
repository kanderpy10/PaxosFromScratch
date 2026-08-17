public class Acceptor{
    private Ballot promisedBallot;
    private Ballot acceptedBallot;
    private int acceptedValue;
    private int id; 
    public Acceptor(Ballot pb, Ballot ab, int av, int i){
        this.promisedBallot = pb;
        this.acceptedBallot = ab;
        this.acceptedValue = av;
        this.id = i; 
    }
    public Ballot getPromisedBallot(){
        return promisedBallot;
    }
    public void setPromisedBallot(Ballot p){
        this.promisedBallot = p;
    }
    public Ballot getAcceptedBallot(){
        return acceptedBallot;
    }
    public void setAcceptedBallot(Ballot a){
        this.acceptedBallot = a;
    }
    public int getAcceptedValue(){
        return acceptedValue; 
    }
    public void setAcceptedValue(int v){
        this.acceptedValue = v;
    }
    public int getId(){
        return id; 
    }
    public void setId(int d){
        this.id = d; 
    }
    public void handlePrepare(PrepareMsg pm){
        Ballot i = pm.getBallot();
        int incoming = i.getBalnum();
        int ai = promisedBallot.getBalnum();
        if(incoming > ai){
            Ballot newPromise = new Ballot(incoming);
            promisedBallot = newPromise;
            PromiseMsg prom = new PromiseMsg(newPromise, id, acceptedValue);  
        }
        else{
            Nack na = new Nack(i, id, promisedBallot);
        }
    }
}