/*
 * Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
 */
public class Bat extends Mammal {

  public void batEnergyLevel() {
    this.setEnergyLevel(this.getEnergyLevel() + 200);
  }

  public void fly() {
    this.setEnergyLevel(this.getEnergyLevel() - 50);
    System.out.println("The bats taking off. ");
  }

  public void eatHumans() {
    this.setEnergyLevel(this.getEnergyLevel() + 25);
    System.out.println("The bat fed on some humans. ");
  }

  public void attackTown() {
    this.setEnergyLevel(this.getEnergyLevel() - 100);
    System.out.println("The bat attacked a town. ");
  }
}
