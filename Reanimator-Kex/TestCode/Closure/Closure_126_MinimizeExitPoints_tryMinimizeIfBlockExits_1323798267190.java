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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59268;
     Object term59360;
     Object term59452;
     Object term59646;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59268 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term59360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59360, term59360.getClass(), "type", 0);
        setField(term59360, term59360.getClass(), "first", null);
        term59452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59554 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term59452, term59452.getClass(), "type", 0);
        setIntField(term59554, term59554.getClass(), "propType", 40);
        setField(term59452, term59452.getClass(), "propListHead", term59554);
        term59646 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59646, term59646.getClass(), "next", term59716);
        setField(term59646, term59646.getClass(), "propListHead", null);
        setIntField(term59646, term59646.getClass(), "sourcePosition", 0);
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
        args[0] = term59360;
        args[1] = term59452;
        args[2] = term59646;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term59268, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


