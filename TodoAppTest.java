import static org.junit.Assert.*;

import org.junit.Test;

public class TodoAppTest {

    @Test
    public void testValidTask() {
        ToDoApp app = new ToDoApp();

        String result = app.validateTask("Complete Assignment");

        assertEquals("Complete Assignment", result);
    }

    @Test
    public void testEmptyTask() {
        ToDoApp app = new ToDoApp();

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.validateTask("")
        );

        assertEquals("Task cannot be empty.", exception.getMessage());
    }

    @Test
    public void testNullTask() {
        ToDoApp app = new ToDoApp();

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.validateTask(null)
        );

        assertEquals("Task cannot be empty.", exception.getMessage());
    }
}