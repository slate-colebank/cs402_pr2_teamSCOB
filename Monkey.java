import java.util.Scanner;

public class Monkey {
    public static void run() {
        System.out.println("running program...");
        Scanner s = new Scanner(System.in);

        // Get user input for the location of the monkey
        System.out.println("===============================");
        System.out.println("Select which room the monkey starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==> ");
        String monkeyStartingRoom = s.nextLine();
        System.out.println();
        
        // Get user input for the location of the box
        System.out.println("Select which room the box starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==> ");
        String boxStartingRoom = s.nextLine();
        System.out.println();

        // Get user input for the location of the bananas
        System.out.println("Select which room the bananas start in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.print("==> ");
        String bananasStartingRoom = s.nextLine();
        System.out.println();

        Planner p = new Planner();
        // Set goal state;
        p.perfectWorld = new WorldState(bananasStartingRoom, bananasStartingRoom, bananasStartingRoom, "HIGH");
        // Set current state
        WorldState world = new WorldState(monkeyStartingRoom, boxStartingRoom, bananasStartingRoom, "LOW");

        System.out.println("Plan:");
        // Sun the planner until the monkey grabs the bananas
        while (!world.getMonkeyHasBananas()) {
            world = p.bestWorld(p.checkActions(world));
            System.out.println(world.getLastAction());   
        }
        System.out.println("\n===============================");
        s.close();
    }
}
