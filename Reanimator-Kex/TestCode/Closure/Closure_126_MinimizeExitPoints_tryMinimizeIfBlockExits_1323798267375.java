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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143958;
     Object term144050;
     Object term144142;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143958 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term144050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term144050, term144050.getClass(), "type", 0);
        setField(term144050, term144050.getClass(), "first", null);
        term144142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144212, term144212.getClass(), "type", 105);
        setField(term144142, term144142.getClass(), "next", term144212);
        setField(term144142, term144142.getClass(), "propListHead", null);
        setIntField(term144142, term144142.getClass(), "sourcePosition", 0);
        setField(term144142, term144142.getClass(), "last", null);
        setField(term144142, term144142.getClass(), "first", null);
        setField(term144142, term144142.getClass(), "parent", term144282);
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
        args[0] = term144050;
        args[1] = null;
        args[2] = term144142;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term143958, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


