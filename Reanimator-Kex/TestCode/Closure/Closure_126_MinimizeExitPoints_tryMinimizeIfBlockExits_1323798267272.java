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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93556;
     Object term93626;
     Object term93696;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93556 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term93626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93626, term93626.getClass(), "type", 0);
        setField(term93626, term93626.getClass(), "first", null);
        term93696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93766, term93766.getClass(), "type", 105);
        setField(term93696, term93696.getClass(), "next", term93766);
        setField(term93696, term93696.getClass(), "propListHead", null);
        setIntField(term93696, term93696.getClass(), "sourcePosition", 0);
        setField(term93696, term93696.getClass(), "last", null);
        setField(term93696, term93696.getClass(), "first", null);
        setField(term93696, term93696.getClass(), "parent", null);
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
        args[0] = term93626;
        args[1] = null;
        args[2] = term93696;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term93556, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


