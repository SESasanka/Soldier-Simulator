
import java.util.ArrayList;

class Soldier {
   private String name;
   private ArrayList<Gun> guns = new ArrayList<>();
   private int currentGunIndex = -1;
   
   public Soldier(String name){
       this.name = name;
   }
   
   public void addGun(Gun gun){
       if(guns.size() < 3){
           guns.add(gun);
           if(currentGunIndex == -1){
               currentGunIndex = 0;
           }
           System.out.println(name + " Pick up a " + gun.getName());
       }else{
           System.out.println("Cannot carry more than 3 guns!");
       }
   }
   
   public void switchGun(int index){
       if(index >= 0 && index < guns.size()){
           currentGunIndex = index;
           System.out.println(name + " switch to " + guns.get(index).getName());
       }else{
           System.out.println("Invalid gun index!");
       }
   }
   
   public void shoot(){
       if(currentGunIndex != -1 && !guns.isEmpty()){
           guns.get(currentGunIndex).shoot();
       }else{
           System.out.println(name + "has no gun equipped!");
       }
   }
   
   public void reloadCurrentGun(int bullets){
       if(currentGunIndex != -1){
           guns.get(currentGunIndex).reload(bullets);
       }else{
           System.out.println("No gun equipped to reload");
       }
   }
   
   public void dropGun(int index){
       if(index >= 0 && index < guns.size()){
           System.out.println(guns.get(index).getName() + " dropped.");
           guns.remove(index);
           if(guns.isEmpty()){
               currentGunIndex = -1;
           }else if (currentGunIndex >= guns.size()){
               currentGunIndex = guns.size() - 1;
           }
       }else{
           System.out.println("Invalid gun index!");
       }
   }
}
