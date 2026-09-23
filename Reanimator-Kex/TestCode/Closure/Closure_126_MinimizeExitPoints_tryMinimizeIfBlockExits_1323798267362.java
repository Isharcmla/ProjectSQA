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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136509;
     Object term136579;
     Object term136649;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136509 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term136579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term136579, term136579.getClass(), "type", 4);
        setField(term136579, term136579.getClass(), "first", null);
        term136649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136821 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term136923 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term137025 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term137127 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term137197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term136719, term136719.getClass(), "type", 105);
        setField(term136649, term136649.getClass(), "next", term136719);
        setIntField(term136821, term136821.getClass(), "propType", 16777216);
        setIntField(term136923, term136923.getClass(), "propType", 4194304);
        setIntField(term137025, term137025.getClass(), "propType", 1);
        setIntField(term137127, term137127.getClass(), "propType", 0);
        setField(term137127, term137127.getClass(), "next", null);
        setField(term137025, term137025.getClass(), "next", term137127);
        setField(term136923, term136923.getClass(), "next", term137025);
        setField(term136821, term136821.getClass(), "next", term136923);
        setField(term136649, term136649.getClass(), "propListHead", term136821);
        setIntField(term136649, term136649.getClass(), "sourcePosition", 0);
        setField(term136649, term136649.getClass(), "last", null);
        setField(term136649, term136649.getClass(), "first", term137197);
        setField(term136649, term136649.getClass(), "parent", null);
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
        args[0] = term136579;
        args[1] = null;
        args[2] = term136649;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term136509, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


