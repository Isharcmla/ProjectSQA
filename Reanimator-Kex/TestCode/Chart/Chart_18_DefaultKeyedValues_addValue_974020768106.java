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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Double;

public class DefaultKeyedValues_addValue_974020768106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26600;
     Object term26888;

    public DefaultKeyedValues_addValue_974020768106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26648 = new HashMap();
        ArrayList term26842 = new ArrayList();
        term26600 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term26600, term26600.getClass(), "indexMap", term26648);
        setField(term26600, term26600.getClass(), "keys", term26842);
        term26888 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term26888;
        args[1] = 0.0;
        try {
            callMethod(klass, "addValue", argTypes, term26600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


