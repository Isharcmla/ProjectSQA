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
import java.util.ArrayList;

public class DefaultKeyedValues2D_removeValue_102645854279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11407;
     Object term11527;

    public DefaultKeyedValues2D_removeValue_102645854279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11459 = new ArrayList();
        term11407 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term11407, term11407.getClass(), "sortRowKeys", false);
        setField(term11407, term11407.getClass(), "rowKeys", term11459);
        term11527 = newInstance(Class.forName("java.nio.ByteBufferAsIntBufferL"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term11527;
        args[1] = null;
        try {
            callMethod(klass, "removeValue", argTypes, term11407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


