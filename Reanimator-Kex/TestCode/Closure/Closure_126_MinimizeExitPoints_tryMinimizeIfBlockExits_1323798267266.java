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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91120;
     Object term91212;
     Object term91304;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91120 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term91212 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term91212, term91212.getClass(), "type", 0);
        setField(term91212, term91212.getClass(), "first", null);
        term91304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91476 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term91578 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term91374, term91374.getClass(), "type", 0);
        setField(term91304, term91304.getClass(), "next", term91374);
        setIntField(term91476, term91476.getClass(), "propType", 8388608);
        setIntField(term91578, term91578.getClass(), "propType", 0);
        setField(term91578, term91578.getClass(), "next", null);
        setField(term91476, term91476.getClass(), "next", term91578);
        setField(term91304, term91304.getClass(), "propListHead", term91476);
        setIntField(term91304, term91304.getClass(), "sourcePosition", 0);
        setField(term91304, term91304.getClass(), "last", null);
        setField(term91304, term91304.getClass(), "first", null);
        setField(term91304, term91304.getClass(), "parent", term91374);
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
        args[0] = term91212;
        args[1] = null;
        args[2] = term91304;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term91120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


