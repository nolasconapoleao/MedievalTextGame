package org.gameFreebies.medievalTextGame.resources.characters;

public class Human {
  private int lvl;
  private int hp;
  private int dmg;
  private int defense;
  private int magicAttack;
  private int magicDefense;

  public Human(int hp, int dmg, int defense, int magicAttack, int magicDefense) {
    this.lvl = 1;
    this.hp = hp;
    this.dmg = dmg;
    this.defense = defense;
    this.magicAttack = magicAttack;
    this.magicDefense = magicDefense;
  }

  public int getLvl() {
    return lvl;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getDmg() {
    return dmg;
  }

  public void setDmg(int dmg) {
    this.dmg = dmg;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  public int getMagicAttack() {
    return magicAttack;
  }

  public void setMagicAttack(int magicAttack) {
    this.magicAttack = magicAttack;
  }

  public int getMagicDefense() {
    return magicDefense;
  }

  public void setMagicDefense(int magicDefense) {
    this.magicDefense = magicDefense;
  }
}
