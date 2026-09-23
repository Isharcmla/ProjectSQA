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
import java.lang.IllegalArgumentException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DefaultKeyedValues2D_addValue_1002920778125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28181;
     Object term28345;

    public DefaultKeyedValues2D_addValue_1002920778125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28233 = new ArrayList();
        ArrayList term28285 = new ArrayList();
        term28181 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term28181, term28181.getClass(), "sortRowKeys", false);
        setField(term28181, term28181.getClass(), "rowKeys", term28233);
        setField(term28181, term28181.getClass(), "rows", term28285);
        term28345 = newInstance(Class.forName("java.nio.DirectFloatBufferS"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term28345;
        args[2] = null;
        try {
            callMethod(klass, "addValue", argTypes, term28181, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


