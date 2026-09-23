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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class KeyedObjects2D_getObject_24089910624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term40;
     Object term42;

    public KeyedObjects2D_getObject_24089910624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28 = new ArrayList();
        ArrayList term32 = new ArrayList();
        ArrayList term36 = new ArrayList();
        term27 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term27, term27.getClass(), "rowKeys", term28);
        setField(term27, term27.getClass(), "columnKeys", term32);
        setField(term27, term27.getClass(), "rows", term36);
        term40 = new Integer(568599855);
        term42 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term40;
        args[1] = term42;
        try {
            callMethod(klass, "getObject", argTypes, term27, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


