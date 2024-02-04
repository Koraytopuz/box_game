public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    public  void run(){
        if (isCheck()){
        while (this.f1.health>0 && this.f2.health>0){
            System.out.println("=====New Round=====");
            this.f2.health=this.f1.hit(this.f2);
            if (isWİn()){
                break;
            }
            this.f1.health=this.f2.hit(this.f1);
            if (isWİn()){
                break;
            }
            System.out.println(this.f1.name+" Health: "+this.f1.health);
            System.out.println(this.f2.name+" Health: "+this.f2.health);

        }
        }else {
            System.out.println("The weights of the athletes do not match");
        }
     }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight&& (this.f2.weight>=minWeight&& this.f2.weight<=maxWeight) );
    }
    boolean isWİn(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" Win!");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" Win!" );
            return true;

        }
    return false;
    }

 }

