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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104372;
     Object term104464;
     Object term104556;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104372 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term104464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term104464, term104464.getClass(), "type", 0);
        setField(term104464, term104464.getClass(), "first", null);
        term104556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term104750 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term104820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104648, term104648.getClass(), "type", 105);
        setField(term104556, term104556.getClass(), "next", term104648);
        setIntField(term104750, term104750.getClass(), "propType", 0);
        setField(term104750, term104750.getClass(), "next", null);
        setField(term104556, term104556.getClass(), "propListHead", term104750);
        setIntField(term104556, term104556.getClass(), "sourcePosition", 0);
        setField(term104556, term104556.getClass(), "last", null);
        setField(term104556, term104556.getClass(), "first", null);
        setField(term104556, term104556.getClass(), "parent", term104820);
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
        args[0] = term104464;
        args[1] = null;
        args[2] = term104556;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term104372, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


