public class BatTest extends TestGorilla {

  public static void main(String[] args) {
    Bat b = new Bat();
    b.batEnergyLevel();

    b.attackTown();
    b.attackTown();
    b.attackTown();
    b.displayEnergy();

    b.eatHumans();
    b.eatHumans();
    b.displayEnergy();

    b.fly();
    b.fly();
    b.displayEnergy();
  }
}
