public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int first_start;
    Fighter(String name,int damage,int health,int weight,int dodge,int first_start){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0&& dodge<=100){
            this.dodge=dodge;
        }else {
            this.dodge=0;
        }
        if (first_start >= 0 && first_start <= 100) { this.first_start = first_start; }
        else { this.first_start = 0; }

    }
    int hit (Fighter foe){
        System.out.println(this.name+" => "+foe.name+" "+this.damage+" damage hit ");
        if (foe.isDodge()){
            System.out.println(foe.name+" Blocks incoming damage");
            System.out.println("-----------");
            return  foe.health;
        }
        if (foe.health-this.damage<0){
             return 0;
        }
        return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber <= this.dodge;
     }
     boolean isFirst(){
        double randomNumber1=Math.random()*100;
        return randomNumber1<=this.first_start;
     }
}
