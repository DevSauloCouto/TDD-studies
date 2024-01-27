import static org.junit.jupiter.api.Assertions.*;

import com.data_structure.stack.Stack;
import com.data_structure.stack.exceptions.StackException;
import org.junit.jupiter.api.*;


public class TestStack {

    private Stack stack;

    @BeforeEach
    public void setup() {
        stack = new Stack(10);
    }

    @Test
    @DisplayName("should return true to stack empty")
    public void stackEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    @DisplayName("should return false to stack empty, size one and element equals piled up")
    public void stackAElement() {
        stack.stackUp("primeiro");

        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals("primeiro", stack.top());
    }

    @Test
    @DisplayName("should stack two elements and after unstack a element")
    public void stackAndUnstack() {
        stack.stackUp("primeiro");
        stack.stackUp("segundo");

        assertEquals(2, stack.size());
        assertEquals("segundo", stack.top());

        String elementUnstacked = stack.unstack();

        assertEquals(1, stack.size());
        assertEquals("primeiro", stack.top());
        assertEquals("segundo", elementUnstacked) ;
    }

    @Test
    @DisplayName("should throw exception because a stack empty can't remove element")
    public void removeElementOfStackEmpty() {
        StackException exception = Assertions.assertThrowsExactly(StackException.class, () -> stack.unstack());

        assertTrue(exception.getMessage().contains("Stack empty: don't possible unstack element"));
    }

    @Test
    @DisplayName("should throw exception if the stack is full")
    public void stackInStackFull() {
        for (int i = 0; i < 10; i++) {
            stack.stackUp("element" + i);
        }

        StackException exception = assertThrowsExactly(StackException.class, () -> stack.stackUp("should don't add"));

        assertTrue(exception.getMessage().contains("Stack full: don't possible stack up element if the stack is full"));
    }

}
