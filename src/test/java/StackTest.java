import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack;

    @Before
    public void setUp() throws Exception {
        stack=new Stack();
    }

    @Test
    public void checkEmpty(){
        assertNotNull(stack);
    }

    @Test
    public void isEmpty(){
        assertTrue(stack.isEmpty());
    }
}