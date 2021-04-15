package memento;

/**
 * Originator creates and stores states in Memento object.
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    /// Create Memento
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento state) {
        this.state = state.getState();

    }

    public void restore(Memento state) {
        this.state = state.getState();
    }
}
