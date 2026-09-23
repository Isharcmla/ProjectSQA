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
import java.lang.Double;

public class DefaultKeyedValues_setValue_9141055992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18436;
     Object term18530;

    public DefaultKeyedValues_setValue_9141055992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18484 = new HashMap();
        term18436 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term18436, term18436.getClass(), "indexMap", term18484);
        term18530 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term18530;
        args[1] = 0.0;
        try {
            callMethod(klass, "setValue", argTypes, term18436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


