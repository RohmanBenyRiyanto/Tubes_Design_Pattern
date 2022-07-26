public class TurnOffSprinklerCommand implements Command{
    SprinklerForSmoke sprinkler;

    public TurnOffSprinklerCommand(SprinklerForSmoke sprinkler) {
        super();
        this.sprinkler = sprinkler;
    }

    public void execute() {
        System.out.println("Mematikan penyemprot.");
        sprinkler.turnOff();
    }
}