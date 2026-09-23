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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52598;
     Object term52668;
     Object term52760;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52598 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term52668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52668, term52668.getClass(), "type", 0);
        setField(term52668, term52668.getClass(), "first", null);
        term52760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52932 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term52760, term52760.getClass(), "next", term52830);
        setIntField(term52932, term52932.getClass(), "propType", 51);
        setField(term52932, term52932.getClass(), "next", null);
        setField(term52760, term52760.getClass(), "propListHead", term52932);
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
        args[0] = term52668;
        args[1] = null;
        args[2] = term52760;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term52598, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


