public class TurnOnSprinklerCommand implements Command{
    SprinklerForSmoke sprinkler;

    public TurnOnSprinklerCommand(SprinklerForSmoke sprinkler) {
        super();
        this.sprinkler = sprinkler;
    }

    public void execute() {
        System.out.println("Menghidupkan penyemprot.");
        sprinkler.turnOn();
    }
}