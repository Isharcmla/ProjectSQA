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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class KeyedObjects2D_removeColumn_189593500038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public KeyedObjects2D_removeColumn_189593500038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term224 = new ArrayList();
        ArrayList term228 = new ArrayList();
        ArrayList term232 = new ArrayList();
        term223 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term223, term223.getClass(), "rowKeys", term224);
        setField(term223, term223.getClass(), "columnKeys", term228);
        setField(term223, term223.getClass(), "rows", term232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeColumn", argTypes, term223, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


