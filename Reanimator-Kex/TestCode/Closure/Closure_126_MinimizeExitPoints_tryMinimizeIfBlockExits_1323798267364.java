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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137991;
     Object term138083;
     Object term138175;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137991 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term138083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term138083, term138083.getClass(), "type", 0);
        setField(term138083, term138083.getClass(), "first", null);
        term138175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138369 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term138471 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term138541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138267, term138267.getClass(), "type", 105);
        setField(term138175, term138175.getClass(), "next", term138267);
        setIntField(term138369, term138369.getClass(), "propType", 0);
        setIntField(term138471, term138471.getClass(), "propType", 0);
        setField(term138471, term138471.getClass(), "next", null);
        setField(term138369, term138369.getClass(), "next", term138471);
        setField(term138175, term138175.getClass(), "propListHead", term138369);
        setIntField(term138175, term138175.getClass(), "sourcePosition", 0);
        setField(term138175, term138175.getClass(), "last", null);
        setField(term138175, term138175.getClass(), "first", null);
        setField(term138175, term138175.getClass(), "parent", term138541);
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
        args[0] = term138083;
        args[1] = null;
        args[2] = term138175;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term137991, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


