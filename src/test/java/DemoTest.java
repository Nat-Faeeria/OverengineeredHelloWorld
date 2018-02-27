import org.junit.Before;

import static org.junit.Assert.*;

public class DemoTest {

    private Demo demo;

    @Before
    public void setUp() throws Exception {
        demo = new Demo();
    }

    @org.junit.Test
    public void giveHello() {
        assertEquals("Test giveHello", this.demo.giveHello(), "Hello");
    }

    @org.junit.Test
    public void giveWorld() {
        assertEquals("Test giveWorld", this.demo.giveWorld(), "World");
    }

    @org.junit.Test
    public void addExclamation() {
        assertEquals("Test addExclamation", this.demo.addExclamation("Truc"), "Truc !");
    }

    @org.junit.Test
    public void addSpace() {
        assertEquals("Test addSpace", this.demo.addSpace("a","b"), "a b");
    }

    @org.junit.Test
    public void sayHelloWorld() {
        assertEquals("Test sayHelloWorld", this.demo.sayHelloWorld(), "Hello World !");
    }

}