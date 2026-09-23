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
import java.util.HashMap;

public class DefaultKeyedValues_getIndex_201068939126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public DefaultKeyedValues_getIndex_201068939126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48 = new ArrayList();
        ArrayList term52 = new ArrayList();
        HashMap term56 = new HashMap();
        term47 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term47, term47.getClass(), "keys", term48);
        setField(term47, term47.getClass(), "values", term52);
        setField(term47, term47.getClass(), "indexMap", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getIndex", argTypes, term47, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


