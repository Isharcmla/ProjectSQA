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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106772;
     Object term106864;
     Object term106956;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106772 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term106864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106864, term106864.getClass(), "type", 0);
        setField(term106864, term106864.getClass(), "first", null);
        term106956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term107150 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term107220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107048, term107048.getClass(), "type", 105);
        setField(term106956, term106956.getClass(), "next", term107048);
        setIntField(term107150, term107150.getClass(), "propType", 0);
        setField(term107150, term107150.getClass(), "next", null);
        setField(term106956, term106956.getClass(), "propListHead", term107150);
        setIntField(term106956, term106956.getClass(), "sourcePosition", 0);
        setField(term106956, term106956.getClass(), "last", null);
        setField(term106956, term106956.getClass(), "first", null);
        setField(term106956, term106956.getClass(), "parent", term107220);
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
        args[0] = term106864;
        args[1] = null;
        args[2] = term106956;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term106772, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


