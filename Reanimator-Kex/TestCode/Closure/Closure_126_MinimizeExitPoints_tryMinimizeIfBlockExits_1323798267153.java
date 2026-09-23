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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44520;
     Object term44590;
     Object term44660;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44520 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term44590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44590, term44590.getClass(), "type", 4);
        setField(term44590, term44590.getClass(), "first", null);
        term44660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44832 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term44934 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term45004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44730, term44730.getClass(), "type", 0);
        setField(term44660, term44660.getClass(), "next", term44730);
        setIntField(term44832, term44832.getClass(), "propType", 1);
        setIntField(term44934, term44934.getClass(), "propType", 0);
        setField(term44934, term44934.getClass(), "next", null);
        setField(term44832, term44832.getClass(), "next", term44934);
        setField(term44660, term44660.getClass(), "propListHead", term44832);
        setIntField(term44660, term44660.getClass(), "sourcePosition", 0);
        setField(term44660, term44660.getClass(), "last", null);
        setField(term44660, term44660.getClass(), "first", null);
        setField(term44660, term44660.getClass(), "parent", term45004);
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
        args[0] = term44590;
        args[1] = null;
        args[2] = term44660;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term44520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


