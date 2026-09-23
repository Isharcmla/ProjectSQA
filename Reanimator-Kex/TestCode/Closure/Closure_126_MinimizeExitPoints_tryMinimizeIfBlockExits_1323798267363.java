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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137363;
     Object term137433;
     Object term137525;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137363 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term137433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term137433, term137433.getClass(), "type", 0);
        setField(term137433, term137433.getClass(), "first", null);
        term137525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137697 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term137799 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term137525, term137525.getClass(), "next", term137595);
        setIntField(term137697, term137697.getClass(), "propType", 51);
        setIntField(term137799, term137799.getClass(), "propType", 0);
        setField(term137799, term137799.getClass(), "next", null);
        setField(term137697, term137697.getClass(), "next", term137799);
        setField(term137525, term137525.getClass(), "propListHead", term137697);
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
        args[0] = term137433;
        args[1] = null;
        args[2] = term137525;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term137363, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


