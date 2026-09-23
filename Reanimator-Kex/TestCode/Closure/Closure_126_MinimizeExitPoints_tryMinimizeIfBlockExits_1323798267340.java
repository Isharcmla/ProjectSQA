package com.google.javascript.jscomp;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125287;
     Object term125357;
     Object term125427;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125287 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term125357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125357, term125357.getClass(), "type", 4);
        setField(term125357, term125357.getClass(), "first", null);
        term125427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125599 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term125701 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term125803 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term125905 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term125427, term125427.getClass(), "next", term125497);
        setIntField(term125599, term125599.getClass(), "propType", 0);
        setIntField(term125701, term125701.getClass(), "propType", 0);
        setIntField(term125803, term125803.getClass(), "propType", 51);
        setIntField(term125905, term125905.getClass(), "propType", 0);
        setField(term125905, term125905.getClass(), "next", null);
        setField(term125803, term125803.getClass(), "next", term125905);
        setField(term125701, term125701.getClass(), "next", term125803);
        setField(term125599, term125599.getClass(), "next", term125701);
        setField(term125427, term125427.getClass(), "propListHead", term125599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term125357;
        args[1] = null;
        args[2] = term125427;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term125287, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


