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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83306;
     Object term83398;
     Object term83490;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83306 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term83398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term83398, term83398.getClass(), "type", 0);
        setField(term83398, term83398.getClass(), "first", null);
        term83490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83668 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term83776 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term83490, term83490.getClass(), "next", term83560);
        setIntField(term83668, term83668.getClass(), "propType", 40);
        setField(term83668, term83668.getClass(), "objectValue", null);
        setField(term83668, term83668.getClass(), "next", term83776);
        setField(term83490, term83490.getClass(), "propListHead", term83668);
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
        args[0] = term83398;
        args[1] = null;
        args[2] = term83490;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term83306, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


