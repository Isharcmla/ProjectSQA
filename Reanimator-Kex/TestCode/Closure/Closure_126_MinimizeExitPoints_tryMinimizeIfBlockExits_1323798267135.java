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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35518;
     Object term35610;
     Object term36923;
     Object term36924;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35518 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term35610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35610, term35610.getClass(), "type", 0);
        term36923 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term36923, term36923.getClass(), "compiler", null);
        term36924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term36924, term36924.getClass(), "number", 0.0);
        setIntField(term36924, term36924.getClass(), "type", 0);
        setField(term36924, term36924.getClass(), "next", null);
        setField(term36924, term36924.getClass(), "first", null);
        setField(term36924, term36924.getClass(), "last", null);
        setField(term36924, term36924.getClass(), "propListHead", null);
        setIntField(term36924, term36924.getClass(), "sourcePosition", 0);
        setField(term36924, term36924.getClass(), "jsType", null);
        setField(term36924, term36924.getClass(), "parent", null);
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
        args[0] = term35610;
        args[1] = null;
        args[2] = null;
        args[3] = 0;
        args[4] = "";
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term35518, args);
        assertTrue(recursiveEquals(term35518, term36923));
        assertTrue(recursiveEquals(term35610, term36924));
    }

};


