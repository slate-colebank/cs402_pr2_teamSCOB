import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("running program...");
        Scanner s = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Select which room the monkey starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.println("==> ");
        String monkeyStartingRoom = s.nextLine();
        
        System.out.println("Select which room the box starts in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.println("==> ");
        String boxStartingRoom = s.nextLine();

        System.out.println("Select which room the bananas start in:\n[1] Room A\n[2] Room B\n[3] Room C");
        System.out.println("==> ");
        String bananasStartingRoom = s.nextLine();

        

        WorldState world = new WorldState(monkeyStartingRoom, boxStartingRoom, bananasStartingRoom);
        System.out.println(Move.move("A", "B", world));
        System.out.println(Push.push("B", "C", world));
        System.out.println(ClimbUp.climbup(world));
        System.out.println(Grab.grab(world));

        System.out.println("Plan: idk..");

        System.out.println("===============================");
        if (world.getMonkeyHasBananas()) {
            System.out.println("the monkey got the bananas");
        }
    }

}
