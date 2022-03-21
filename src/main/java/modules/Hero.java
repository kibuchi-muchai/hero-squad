package modules;

public class Hero {
    private String heroName;
    private String heroPower;
    private String heroWeakness;
    private String heroGender;
    private int heroAge;
    private int squadId;
    private int id;
    /* the property attributes have to be private to avoid being accessed directly without getters and setters or modified, thus, reducing the pesky bugs. */
    //squadId determines the hero's squad id and it will be useful in the interface
    public Hero(String heroName, String heroPower, String heroWeakness, String heroGender, int heroAge, int squadId) {
        this.heroName = heroName;
        this.heroPower = heroPower;
        this.heroWeakness = heroWeakness;
        this.heroGender = heroGender;
        this.heroAge = heroAge;
        this.squadId = squadId;
        // generate constructor argument. However, the id will not be generated since it will be generated and defined in the database
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroPower() {
        return heroPower;
    }

    public void setHeroPower(String heroPower) {
        this.heroPower = heroPower;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public void setHeroWeakness(String heroWeakness) {
        this.heroWeakness = heroWeakness;
    }

    public String getHeroGender() {
        return heroGender;
    }

    public void setHeroGender(String heroGender) {
        this.heroGender = heroGender;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public void setHeroAge(int heroAge) {
        this.heroAge = heroAge;
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Generate setters and getters to access the private variables
}
