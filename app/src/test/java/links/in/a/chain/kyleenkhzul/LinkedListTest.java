package links.in.a.chain.kyleenkhzul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList chainList;

    @BeforeEach
    void setUp() {
        // Initialize a new LinkedList before each test
        chainList = new LinkedList();
    }

    @Test
    void testAppendAndGet() {
        // Create ChainLink objects
        ChainLink linkOne = new ChainLink("red");
        ChainLink linkTwo = new ChainLink("blue");
        ChainLink linkThree = new ChainLink("green");

        // Append ChainLink objects to the LinkedList
        chainList.append(linkOne);
        chainList.append(linkTwo);
        chainList.append(linkThree);

        // Test if the elements are stored correctly
        assertEquals("red", chainList.get(0).color);
        assertEquals("blue", chainList.get(1).color);
        assertEquals("green", chainList.get(2).color);
    }

    @Test
    void testGetOutOfBounds() {
        // Append a single ChainLink object
        chainList.append(new ChainLink("yellow"));

        // Attempt to access an index out of bounds and check for exception
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            chainList.get(1);
        });
        assertEquals("Index 1 out of bounds for LinkedList.", exception.getMessage());
    }

    @Test
    void testAppendToEmptyList() {
        // Append to an initially empty list
        ChainLink newLink = new ChainLink("purple");
        chainList.append(newLink);

        // Verify that the element is added correctly
        assertEquals("purple", chainList.get(0).color);
    }

    @Test
    void testMultipleAppends() {
        // Append multiple ChainLink objects
        chainList.append(new ChainLink("orange"));
        chainList.append(new ChainLink("yellow"));
        chainList.append(new ChainLink("pink"));

        // Verify list size and content
        assertEquals("orange", chainList.get(0).color);
        assertEquals("yellow", chainList.get(1).color);
        assertEquals("pink", chainList.get(2).color);
    }
}
