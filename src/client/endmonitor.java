package client;

public class endmonitor extends NotConnectedClientCommand {

    public endmonitor(String str, ChatClient1 myClient) {
        super(str, myClient);
    }

    public void doCmd() {
        if (getClient().isConnected()) {
            getClient().setMonitor(null);
            getClient().clientUI().display("You have ended monitoring.");
        }
        else{
            getClient().clientUI().display("Please login to end your monitoring.");
        }
    }
}