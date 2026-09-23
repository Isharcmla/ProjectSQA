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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24057;
     Object term24149;
     Object term24241;
     Object term24435;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24057 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term24149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term24149, term24149.getClass(), "type", 0);
        setField(term24149, term24149.getClass(), "first", null);
        term24241 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24343 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term24241, term24241.getClass(), "type", 0);
        setField(term24241, term24241.getClass(), "propListHead", term24343);
        term24435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term24527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term24435, term24435.getClass(), "next", term24527);
        setField(term24435, term24435.getClass(), "propListHead", null);
        setIntField(term24435, term24435.getClass(), "sourcePosition", 0);
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
        args[0] = term24149;
        args[1] = term24241;
        args[2] = term24435;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term24057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


