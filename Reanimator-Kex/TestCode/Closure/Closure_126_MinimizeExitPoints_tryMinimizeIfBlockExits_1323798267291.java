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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102561;
     Object term102653;
     Object term102745;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102561 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term102653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term102653, term102653.getClass(), "type", 0);
        setField(term102653, term102653.getClass(), "first", null);
        term102745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102837 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102939 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term103009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102837, term102837.getClass(), "type", 105);
        setField(term102745, term102745.getClass(), "next", term102837);
        setIntField(term102939, term102939.getClass(), "propType", 0);
        setField(term102939, term102939.getClass(), "next", null);
        setField(term102745, term102745.getClass(), "propListHead", term102939);
        setIntField(term102745, term102745.getClass(), "sourcePosition", 0);
        setField(term102745, term102745.getClass(), "last", null);
        setField(term102745, term102745.getClass(), "first", null);
        setField(term102745, term102745.getClass(), "parent", term103009);
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
        args[0] = term102653;
        args[1] = null;
        args[2] = term102745;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term102561, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


