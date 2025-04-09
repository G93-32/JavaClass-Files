package abstraction;

public class cpu extends computer {
    int generation;
    int speed;

    public cpu(int storage, String name, int screensize, int memory, int generation, int speed) {
        super(storage, name, screensize, memory);
        this.generation = generation;
        this.speed = speed;
    }

    public void displaycpu() {
        System.out.println("Generation: " + generation);
        System.out.println("Speed: " + speed + " hertz");
    }
}
