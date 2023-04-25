package com.harness;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Test
    public void setup() {
        app = new Application();
	assertNotNull(app);
    }
}
