package org.jfree.data;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultKeyedValues2D_getValue_136129810777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10974;
     Object term11064;

    public DefaultKeyedValues2D_getValue_136129810777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10974 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        term11064 = newInstance(Class.forName("java.nio.DirectShortBufferU"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term11064;
        args[1] = term11064;
        try {
            callMethod(klass, "getValue", argTypes, term10974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


