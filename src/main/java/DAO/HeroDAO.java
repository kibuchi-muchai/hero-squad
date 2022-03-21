package DAO;

import modules.Hero;

import java.util.List;

public interface HeroDAO {
    //List
    List<Hero> getAllHeroes();

    void addHero(Hero hero);

    //create a way to get a specific hero through id
    Hero getHeroById(int id);

    //create a delete method for a hero

    void deleteHeroById(int id);

    //create update method for hero

    void updateHero(int id, String name, String power, String weakness, String gender, int age, int squadId);
}
