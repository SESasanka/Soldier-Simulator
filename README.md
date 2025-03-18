# README.md

# Simulation of code Hierarchy  

    │── src/
        │   ├── Main.java  
        │   ├── Gun.java
        │   ├── AK47.java
        │   ├── Pistol.java
        │   ├── Sniper.java
        │   ├── Soldier.java

      
# Key Features Implemented
    |
    |── Encapsulation – Keeps data private in classes
    |── Abstraction – Uses an abstract [Gun] class (Prevents Direct Instantiation).
    |── Inheritance – [AK47], [Pistol], and [Sniper] inherit from [Gun].
    |── Polymorphism – Different [shoot()] methods for each gun.
    |── Dynamic Weapon Management – Add, switch, shoot, reload, and drop weapons.
    |── Error Handling – Prevents crashes when switching guns or shooting without ammo.
    
