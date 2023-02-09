public class Mammal {

  private int energyLevel = 100;

  public int displayEnergy() {
    System.out.println("Energy: " + this.energyLevel);
    return this.energyLevel;
  }

  public int getEnergyLevel() {
    return this.energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }
}
