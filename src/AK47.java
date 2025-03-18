
 class AK47 extends Gun{
    public AK47(int bullets) {
        super("AK47", bullets);
    }

    @Override
    public void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("AK47 fired! Bullets left: " + bullets);
        } else {
            System.out.println("AK47 is out of bullets!");
        }
    }
}
