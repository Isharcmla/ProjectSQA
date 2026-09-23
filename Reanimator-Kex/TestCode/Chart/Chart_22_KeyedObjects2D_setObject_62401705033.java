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

public class KeyedObjects2D_setObject_62401705033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term166;

    public KeyedObjects2D_setObject_62401705033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term154 = new ArrayList();
        ArrayList term158 = new ArrayList();
        ArrayList term162 = new ArrayList();
        term153 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term153, term153.getClass(), "rowKeys", term154);
        setField(term153, term153.getClass(), "columnKeys", term158);
        setField(term153, term153.getClass(), "rows", term162);
        term166 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = term166;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setObject", argTypes, term153, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


