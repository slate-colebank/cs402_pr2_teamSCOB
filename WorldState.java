public class WorldState {
    private String roomMonkeyIn;
    private String roomBoxIn;
    private String roomBananasIn;
    private String monkeyHeight;
    private boolean monkeyHasBananas;

    public static final String ROOM_A = "A";
    public static final String ROOM_B = "B";
    public static final String ROOM_C = "C";

    public static final String ON_BOX = "ON";
    public static final String ON_FLOOR = "OFF";

    public static final String HEIGHT_LOW = "LOW";
    public static final String HEIGHT_HIGH = "HIGH";

    public WorldState(String roomMonkeyIn, String roomBoxIn, String roomBananasIn) {
        this.roomMonkeyIn = roomMonkeyIn;
        this.roomBoxIn = roomBoxIn;
        this.roomBananasIn = roomBananasIn;
        this.monkeyHasBananas = false;
        this.monkeyHeight = "LOW";
    }
    // Monkey room getter
    public String getRoomMonkeyIn(){
        return this.roomMonkeyIn; 
    }

    // Monkey room setter
    public void setRoomMonkeyIn(String room){
        this.roomMonkeyIn = room; 
    }

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

    public boolean isMonkeyHeight(String height) {
        return this.monkeyHeight.equals(height);
    }

    public boolean getMonkeyHasBananas() {
        return this.monkeyHasBananas;
    }
    
    public void grabBananas(){
        this.monkeyHasBananas = true; 
    }

}