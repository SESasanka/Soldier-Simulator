
class Sniper extends Gun{
    public Sniper(int bullets){
        super("Sniper", bullets);
    }
    
    @Override
    public void shoot(){
        if(bullets > 0){
            bullets --;
            System.out.println("Sniper fired! Bullets left : " + bullets);
        }else{
            System.out.println("Sniper is out of bullets! Reload required.");
        }
    }
}
