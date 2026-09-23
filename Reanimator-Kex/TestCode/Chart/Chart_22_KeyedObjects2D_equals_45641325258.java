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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;

public class KeyedObjects2D_equals_45641325258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10911;
     Object term11054;
     Object term11055;

    public KeyedObjects2D_equals_45641325258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10911 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        term11054 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term11054, term11054.getClass(), "rowKeys", null);
        setField(term11054, term11054.getClass(), "columnKeys", null);
        setField(term11054, term11054.getClass(), "rows", null);
        term11055 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term11055, term11055.getClass(), "rowKeys", null);
        setField(term11055, term11055.getClass(), "columnKeys", null);
        setField(term11055, term11055.getClass(), "rows", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10911;
        Object retValue = callMethod(klass, "equals", argTypes, term10911, args);
        assertTrue(recursiveEquals(term10911, term11054));
        assertTrue(recursiveEquals(term10911, term11055));
        assertTrue(recursiveEquals(retValue, true));
    }

};


