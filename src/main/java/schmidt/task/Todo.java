package schmidt.task;

/**
 * Represents a todo task.
 */
public class Todo extends Task {
    /**
     * Constructs a todo task with the specified description.
     *
     * @param description the description of the task
     */
    public Todo (String description) {
        super(description);
    }

    /**
     * Returns a string representation of the todo task.
     *
     * @return a string representation of the todo task
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
