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
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84270;
     Object term84362;
     Object term84486;
     Object term84487;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84270 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term84362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term84362, term84362.getClass(), "type", 0);
        setField(term84362, term84362.getClass(), "first", term84454);
        term84486 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term84486, term84486.getClass(), "compiler", null);
        term84487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term84487, term84487.getClass(), "number", 0.0);
        setIntField(term84487, term84487.getClass(), "type", 0);
        setField(term84487, term84487.getClass(), "next", null);
        setDoubleField(term84488, term84488.getClass(), "number", 0.0);
        setIntField(term84488, term84488.getClass(), "type", 0);
        setField(term84488, term84488.getClass(), "next", null);
        setField(term84488, term84488.getClass(), "first", null);
        setField(term84488, term84488.getClass(), "last", null);
        setField(term84488, term84488.getClass(), "propListHead", null);
        setIntField(term84488, term84488.getClass(), "sourcePosition", 0);
        setField(term84488, term84488.getClass(), "jsType", null);
        setField(term84488, term84488.getClass(), "parent", null);
        setField(term84487, term84487.getClass(), "first", term84488);
        setField(term84487, term84487.getClass(), "last", null);
        setField(term84487, term84487.getClass(), "propListHead", null);
        setIntField(term84487, term84487.getClass(), "sourcePosition", 0);
        setField(term84487, term84487.getClass(), "jsType", null);
        setField(term84487, term84487.getClass(), "parent", null);
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
        args[0] = term84362;
        args[1] = null;
        args[2] = null;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term84270, args);
        assertTrue(recursiveEquals(term84270, term84486));
        assertTrue(recursiveEquals(term84362, term84487));
    }

};


