import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AClassWithOneJUnitTest {

    @Test
    void demoTestMethod() {
        assertTrue(true);
    }
    @Test
    void testDommeEen(){
        assertEquals(1, HelloWorld.domme_een());
    }
}