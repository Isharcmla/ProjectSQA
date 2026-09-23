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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141835;
     Object term141927;
     Object term142019;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141835 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term141927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term141927, term141927.getClass(), "type", 0);
        setField(term141927, term141927.getClass(), "first", null);
        term142019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term142111, term142111.getClass(), "type", 105);
        setField(term142019, term142019.getClass(), "next", term142111);
        setField(term142019, term142019.getClass(), "propListHead", null);
        setIntField(term142019, term142019.getClass(), "sourcePosition", 0);
        setField(term142019, term142019.getClass(), "last", null);
        setField(term142019, term142019.getClass(), "first", null);
        setField(term142019, term142019.getClass(), "parent", null);
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
        args[0] = term141927;
        args[1] = null;
        args[2] = term142019;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term141835, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


