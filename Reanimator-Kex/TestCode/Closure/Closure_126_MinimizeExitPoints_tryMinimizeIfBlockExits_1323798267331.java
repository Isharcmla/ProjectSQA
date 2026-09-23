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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120526;
     Object term120618;
     Object term121020;
     Object term120904;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120526 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term120618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term120618, term120618.getClass(), "type", 0);
        setField(term120618, term120618.getClass(), "first", null);
        term121020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term121071 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term121020, term121020.getClass(), "type", 0);
        setIntField(term121071, term121071.getClass(), "propType", 0);
        setField(term121071, term121071.getClass(), "next", null);
        setField(term121020, term121020.getClass(), "propListHead", term121071);
        setIntField(term121020, term121020.getClass(), "sourcePosition", 0);
        setField(term121020, term121020.getClass(), "next", null);
        setField(term121020, term121020.getClass(), "parent", null);
        term120904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term120974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120974, term120974.getClass(), "type", 105);
        setField(term120904, term120904.getClass(), "next", term120974);
        setField(term120904, term120904.getClass(), "propListHead", null);
        setIntField(term120904, term120904.getClass(), "sourcePosition", 0);
        setField(term120904, term120904.getClass(), "first", term121020);
        setField(term120904, term120904.getClass(), "last", null);
        setField(term120904, term120904.getClass(), "parent", term121141);
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
        args[0] = term120618;
        args[1] = term121020;
        args[2] = term120904;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term120526, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


