// The WorldState class represents the state of the rooms and objects in the
// simulation at a given point in the plan
public class WorldState {
    private String roomMonkeyIn;
    private String roomBoxIn;
    private String roomBananasIn;
    private String monkeyHeight;
    private boolean monkeyHasBananas;
    private String lastAction; // the action taken between the previous state and the current state

    // Worldstate empty constructor
    public WorldState() {};

    // Worldstate constructor
    public WorldState(String roomMonkeyIn, String roomBoxIn, String roomBananasIn, String monkeyHeight) {
        this.roomMonkeyIn = roomMonkeyIn;
        this.roomBoxIn = roomBoxIn;
        this.roomBananasIn = roomBananasIn;
        this.monkeyHasBananas = false;
        this.monkeyHeight = monkeyHeight;
    }

    // Overridden clone function, performs a deep clone
    public WorldState clone() {
        WorldState result = new WorldState();
        result.roomMonkeyIn = this.roomMonkeyIn;
        result.roomBoxIn = this.roomBoxIn;
        result.roomBananasIn = this.roomBananasIn;
        result.monkeyHeight = this.monkeyHeight;
        result.monkeyHasBananas = this.monkeyHasBananas;

        return result;
    }

    // Monkey room getter
    public String getRoomMonkeyIn(){
        return this.roomMonkeyIn; 
    }

    // Monkey room setter
    public void setRoomMonkeyIn(String room){
        this.roomMonkeyIn = room; 
    }

    // Monkey room checker
    public boolean isMonkeyAt(String room) {
        return this.roomMonkeyIn.equalsIgnoreCase(room);
    }

    // Box room getter
    public String getRoomBoxIn() {
        return this.roomBoxIn;
    }

    // Box room setter
    public void setRoomBoxIn(String room) {
        this.roomBoxIn = room;
    }

    // Box room checker
    public boolean isBoxAt(String room) {
        return this.roomBoxIn.equals(room);
    }
    
    // Bananas room getter
    public String getRoomBananasIn() {
        return this.roomBananasIn;
    }

    // Bananas room setter
    public void setRoomBananasIn(String room) {
        this.roomBananasIn = room;
    }

    // Bananas room checker
    public boolean isBanasAt(String room) {
        return this.roomBananasIn.equals(room);
    }

    // Monkey height getter
    public String getMonkeyHeight() {
        return this.monkeyHeight;
    }

    // Monkey height setter
    public void setMonkeyHeight(String height) {
        this.monkeyHeight = height;
    }

    // Monkey height checker
    public boolean isMonkeyHeight(String height) {
        return this.monkeyHeight.equals(height);
    }

    // Monkey has bananas checker
    public boolean getMonkeyHasBananas() {
        return this.monkeyHasBananas;
    }
    
    // Monkey has bananas setter
    public void grabBananas(){
        this.monkeyHasBananas = true; 
    }

    // Last action setter
    public void setLastAction(String action){
        this.lastAction = action;
    }

    // Last action getter
    public String getLastAction(){
        return this.lastAction;
    }
}