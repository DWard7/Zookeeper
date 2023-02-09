public class Gorrila extends Mammal {

  public void throwSomething() {
    this.setEnergyLevel(this.getEnergyLevel() - 5);
    System.out.println("The gorilla threw something. ");
  }

  public void eatBananas() {
    this.setEnergyLevel(this.getEnergyLevel() + 10);
    System.out.println("The gorilla eats a banana.");
  }

  public void climb() {
    this.setEnergyLevel(this.getEnergyLevel() - 10);
    System.out.println("The gorilla climbed a tree.");
  }
}
