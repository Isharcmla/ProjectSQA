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
import java.lang.ClassCastException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Object;

public class DefaultKeyedValues_setValue_91410559110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32309;
     Object term32568;

    public DefaultKeyedValues_setValue_91410559110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32568 = new Double(0.0);
        HashMap term32357 = new HashMap();
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put((Object)null, (Object)null);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        ((HashMap) term32357).put(term32568, term32568);
        term32309 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term32309, term32309.getClass(), "indexMap", term32357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term32568;
        args[1] = 0.0;
        try {
            callMethod(klass, "setValue", argTypes, term32309, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


