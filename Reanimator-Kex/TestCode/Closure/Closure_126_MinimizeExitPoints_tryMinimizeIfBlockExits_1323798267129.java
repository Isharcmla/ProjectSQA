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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33663;
     Object term33755;
     Object term33985;
     Object term33939;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33663 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term33755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33755, term33755.getClass(), "type", 0);
        setField(term33755, term33755.getClass(), "first", null);
        term33985 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33985, term33985.getClass(), "type", 0);
        setField(term33985, term33985.getClass(), "propListHead", null);
        setIntField(term33985, term33985.getClass(), "sourcePosition", 0);
        setField(term33985, term33985.getClass(), "next", null);
        term33939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term33939, term33939.getClass(), "next", term33985);
        setField(term33939, term33939.getClass(), "propListHead", null);
        setIntField(term33939, term33939.getClass(), "sourcePosition", 0);
        setField(term33939, term33939.getClass(), "first", term33985);
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
        args[0] = term33755;
        args[1] = term33985;
        args[2] = term33939;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term33663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


