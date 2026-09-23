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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27267;
     Object term27337;
     Object term27407;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27267 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term27337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27337, term27337.getClass(), "type", 4);
        setField(term27337, term27337.getClass(), "first", null);
        term27407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27579 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term27649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27477, term27477.getClass(), "type", 0);
        setField(term27407, term27407.getClass(), "next", term27477);
        setIntField(term27579, term27579.getClass(), "propType", 0);
        setField(term27579, term27579.getClass(), "next", null);
        setField(term27407, term27407.getClass(), "propListHead", term27579);
        setIntField(term27407, term27407.getClass(), "sourcePosition", 0);
        setField(term27407, term27407.getClass(), "last", null);
        setField(term27407, term27407.getClass(), "first", null);
        setField(term27407, term27407.getClass(), "parent", term27649);
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
        args[0] = term27337;
        args[1] = null;
        args[2] = term27407;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term27267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


