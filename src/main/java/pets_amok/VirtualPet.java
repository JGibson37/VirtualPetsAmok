package pets_amok;

public abstract class VirtualPet {

    protected String name;
    protected int health;
    protected int boredom;
    protected int happiness;


    public VirtualPet(String name, int happiness, int health, int boredom) {
        this.name = name;
        this.happiness = happiness;
        this.health = health;
        this.boredom = boredom;
    }

    public String getName(){
        return name;
    }

    public void addHealth() {
        health += 10;
    }

    public int getHealth() {
        return health;
    }

    public void play() {
        boredom -= 25;
        happiness += 10;
    }

    public int getBoredom(){
        return boredom;
    }

    public int getHappiness() {
        return happiness;
    }

    public void tickAll() {
        happiness -= 5;
        health -= 5;
        boredom += 5;
        }
    @Override
    public String toString() {
        return name + "•"+
                happiness + "•"+
                + health + "•"+
                + boredom ;
    }
    }

