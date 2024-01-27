import com.data_structure.stack.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack {

    @Test
    public void stackEmpty() {
        Stack p = new Stack();

        Assertions.assertTrue(p.isEmpty());
        Assertions.assertEquals(0, p.size());
    }

    @Test
    public void stackAElement() {
        Stack p = new Stack();

        p.stackUp("primeiro");

        Assertions.assertFalse(p.isEmpty());
        Assertions.assertEquals(1, p.size());
        Assertions.assertEquals("primeiro", p.firstElement());
    }

}
