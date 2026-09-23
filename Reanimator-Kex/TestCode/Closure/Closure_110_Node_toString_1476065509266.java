package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class Node_toString_1476065509266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2354;
     Object term2381;
     Object term2383;
     Object term2385;

    public Node_toString_1476065509266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2354, term2354.getClass(), "type", -1984436481);
        setIntField(term2356, term2356.getClass(), "type", -407582855);
        setIntField(term2358, term2358.getClass(), "type", 1190753616);
        setIntField(term2360, term2360.getClass(), "type", -752378450);
        setIntField(term2362, term2362.getClass(), "type", 848907965);
        setField(term2362, term2362.getClass(), "next", null);
        setField(term2362, term2362.getClass(), "first", null);
        setField(term2362, term2362.getClass(), "last", null);
        setField(term2362, term2362.getClass(), "propListHead", null);
        setIntField(term2362, term2362.getClass(), "sourcePosition", 0);
        setField(term2362, term2362.getClass(), "jsType", null);
        setField(term2362, term2362.getClass(), "parent", null);
        setField(term2360, term2360.getClass(), "next", term2362);
        setIntField(term2365, term2365.getClass(), "type", 1865070548);
        setField(term2365, term2365.getClass(), "next", null);
        setField(term2365, term2365.getClass(), "first", null);
        setField(term2365, term2365.getClass(), "last", term2362);
        setField(term2365, term2365.getClass(), "propListHead", null);
        setIntField(term2365, term2365.getClass(), "sourcePosition", 0);
        setField(term2365, term2365.getClass(), "jsType", null);
        setField(term2365, term2365.getClass(), "parent", null);
        setField(term2360, term2360.getClass(), "first", term2365);
        setField(term2360, term2360.getClass(), "last", term2358);
        setField(term2360, term2360.getClass(), "propListHead", null);
        setIntField(term2360, term2360.getClass(), "sourcePosition", 0);
        setField(term2360, term2360.getClass(), "jsType", null);
        setField(term2360, term2360.getClass(), "parent", null);
        setField(term2358, term2358.getClass(), "next", term2360);
        setField(term2358, term2358.getClass(), "first", term2362);
        setIntField(term2369, term2369.getClass(), "type", 1361126430);
        setIntField(term2371, term2371.getClass(), "type", 1728588701);
        setField(term2371, term2371.getClass(), "next", null);
        setField(term2371, term2371.getClass(), "first", term2365);
        setField(term2371, term2371.getClass(), "last", term2360);
        setField(term2371, term2371.getClass(), "propListHead", null);
        setIntField(term2371, term2371.getClass(), "sourcePosition", 0);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2369, term2369.getClass(), "next", term2371);
        setField(term2369, term2369.getClass(), "first", term2356);
        setField(term2369, term2369.getClass(), "last", term2356);
        setField(term2369, term2369.getClass(), "propListHead", null);
        setIntField(term2369, term2369.getClass(), "sourcePosition", 0);
        setField(term2369, term2369.getClass(), "jsType", null);
        setField(term2369, term2369.getClass(), "parent", null);
        setField(term2358, term2358.getClass(), "last", term2369);
        setField(term2358, term2358.getClass(), "propListHead", null);
        setIntField(term2358, term2358.getClass(), "sourcePosition", 0);
        setField(term2358, term2358.getClass(), "jsType", null);
        setField(term2358, term2358.getClass(), "parent", null);
        setField(term2356, term2356.getClass(), "next", term2358);
        setIntField(term2376, term2376.getClass(), "type", -355769268);
        setField(term2376, term2376.getClass(), "next", term2369);
        setField(term2376, term2376.getClass(), "first", term2371);
        setField(term2376, term2376.getClass(), "last", term2354);
        setField(term2376, term2376.getClass(), "propListHead", null);
        setIntField(term2376, term2376.getClass(), "sourcePosition", 0);
        setField(term2376, term2376.getClass(), "jsType", null);
        setField(term2376, term2376.getClass(), "parent", null);
        setField(term2356, term2356.getClass(), "first", term2376);
        setField(term2356, term2356.getClass(), "last", term2376);
        setField(term2356, term2356.getClass(), "propListHead", null);
        setIntField(term2356, term2356.getClass(), "sourcePosition", 0);
        setField(term2356, term2356.getClass(), "jsType", null);
        setField(term2356, term2356.getClass(), "parent", null);
        setField(term2354, term2354.getClass(), "next", term2356);
        setField(term2354, term2354.getClass(), "first", term2360);
        setField(term2354, term2354.getClass(), "last", term2362);
        setField(term2354, term2354.getClass(), "propListHead", null);
        setIntField(term2354, term2354.getClass(), "sourcePosition", 0);
        setField(term2354, term2354.getClass(), "jsType", null);
        setField(term2354, term2354.getClass(), "parent", null);
        term2381 = new Boolean(false);
        term2383 = new Boolean(false);
        term2385 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term2381;
        args[1] = term2383;
        args[2] = term2385;
        try {
            callMethod(klass, "toString", argTypes, term2354, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


