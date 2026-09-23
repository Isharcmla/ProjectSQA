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

public class DefaultKeyedValues2D_equals_7510442172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9802;
     Object term9878;

    public DefaultKeyedValues2D_equals_7510442172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9802 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        term9878 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9878;
        try {
            callMethod(klass, "equals", argTypes, term9802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


