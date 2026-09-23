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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39516;
     Object term39608;
     Object term40010;
     Object term39894;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39516 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term39608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term39608, term39608.getClass(), "type", 0);
        setField(term39608, term39608.getClass(), "first", null);
        term40010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40061 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term40010, term40010.getClass(), "type", 0);
        setIntField(term40061, term40061.getClass(), "propType", 0);
        setField(term40061, term40061.getClass(), "next", null);
        setField(term40010, term40010.getClass(), "propListHead", term40061);
        setIntField(term40010, term40010.getClass(), "sourcePosition", 0);
        setField(term40010, term40010.getClass(), "next", null);
        term39894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39894, term39894.getClass(), "next", term39964);
        setField(term39894, term39894.getClass(), "propListHead", null);
        setIntField(term39894, term39894.getClass(), "sourcePosition", 0);
        setField(term39894, term39894.getClass(), "first", term40010);
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
        args[0] = term39608;
        args[1] = term40010;
        args[2] = term39894;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term39516, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


