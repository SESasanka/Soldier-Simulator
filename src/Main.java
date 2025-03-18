
public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier("Sasanka");

        AK47 ak47 = new AK47(5);
        Pistol pistol = new Pistol(10);
        Sniper sniper = new Sniper(3);
        
        soldier.addGun(ak47);
        soldier.addGun(pistol);
        soldier.addGun(sniper);
        
        soldier.shoot();        // Shooting with first gun
        soldier.switchGun(1);
        soldier.shoot();        // Shooting with secod gun 
        soldier.switchGun(2);
        soldier.shoot();        // Shooting with third gun
        
        //Reload and shoot again
        soldier.reloadCurrentGun(5);
        soldier.shoot();
        
        //Drop a gun
        soldier.dropGun(1);
    }
}
