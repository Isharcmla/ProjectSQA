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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96920;
     Object term97012;
     Object term97104;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96920 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term97012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97012, term97012.getClass(), "type", 0);
        setField(term97012, term97012.getClass(), "first", null);
        term97104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97276 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term97378 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term97470 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term97174, term97174.getClass(), "type", 105);
        setField(term97104, term97104.getClass(), "next", term97174);
        setIntField(term97276, term97276.getClass(), "propType", 0);
        setIntField(term97378, term97378.getClass(), "propType", 0);
        setField(term97378, term97378.getClass(), "next", null);
        setField(term97276, term97276.getClass(), "next", term97378);
        setField(term97104, term97104.getClass(), "propListHead", term97276);
        setIntField(term97104, term97104.getClass(), "sourcePosition", 0);
        setField(term97104, term97104.getClass(), "last", null);
        setField(term97104, term97104.getClass(), "first", null);
        setField(term97104, term97104.getClass(), "parent", term97470);
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
        args[0] = term97012;
        args[1] = null;
        args[2] = term97104;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term96920, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


