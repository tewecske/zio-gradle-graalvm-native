package zio.graalvm;

import java.lang.System;
import java.util.Properties;
import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// import static org.junit.Assert.assertEquals;

// import org.junit.Test;

public class JZioAppTest {
  
    @Test
    public void testFirst() {
        Properties p = System.getProperties();
        Enumeration keys = p.keys();
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)p.get(key);
            System.out.println(key + ": " + value);
        }

        assertEquals(true, true); 
    }

}
