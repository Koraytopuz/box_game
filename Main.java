public class Main {
    public static void main(String[] args){
        Fighter f1=new Fighter("Kry",10,100,100,40,50);
        Fighter f2=new Fighter("Topuz",10,100,85,40,50);
        Match match=new Match(f1,f2,85,100);
        match.run();
    }
}