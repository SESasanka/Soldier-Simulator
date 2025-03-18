
class Pistol extends Gun{
    public Pistol(int bullets){
        super("Pistol", bullets);
    }
    
    @Override
    public void shoot(){
        if(bullets > 0){
            bullets --;
            System.out.println("Pistol fird! Bullets left : " + bullets);
        }else{
            System.out.println("Pistol is out of bullets! Reload required.");
        }
    }
}
