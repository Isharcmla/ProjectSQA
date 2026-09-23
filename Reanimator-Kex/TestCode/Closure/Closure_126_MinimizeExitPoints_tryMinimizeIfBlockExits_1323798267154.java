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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45159;
     Object term45229;
     Object term45299;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45159 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term45229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45229, term45229.getClass(), "type", 4);
        setField(term45229, term45229.getClass(), "first", null);
        term45299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45471 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term45573 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term45675 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term45299, term45299.getClass(), "next", term45369);
        setIntField(term45471, term45471.getClass(), "propType", 0);
        setIntField(term45573, term45573.getClass(), "propType", 0);
        setField(term45573, term45573.getClass(), "next", term45675);
        setField(term45471, term45471.getClass(), "next", term45573);
        setField(term45299, term45299.getClass(), "propListHead", term45471);
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
        args[0] = term45229;
        args[1] = null;
        args[2] = term45299;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term45159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


