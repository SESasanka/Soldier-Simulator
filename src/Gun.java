
abstract class Gun {
    protected String name;
    protected int bullets;
    
    public Gun(String name, int bullets){
        this.name = name;
        this.bullets = bullets;
    }
    
    public abstract void shoot();
    
    public void reload(int newBullets){
        this.bullets += newBullets;
        System.out.println(name + " Reload with " + newBullets + " bullets.");
    }
    
    public String getName(){
        return name;
    }
    
    public int getBullets(){
        return bullets;
    }
}
