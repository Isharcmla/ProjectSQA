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

public class KeyedObjects2D_getObject_8114537431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public KeyedObjects2D_getObject_8114537431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term127 = new ArrayList();
        ArrayList term131 = new ArrayList();
        ArrayList term135 = new ArrayList();
        term126 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term126, term126.getClass(), "rowKeys", term127);
        setField(term126, term126.getClass(), "columnKeys", term131);
        setField(term126, term126.getClass(), "rows", term135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getObject", argTypes, term126, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


