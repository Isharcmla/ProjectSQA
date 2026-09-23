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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82223;
     Object term82293;
     Object term82385;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82223 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term82293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82293, term82293.getClass(), "type", 0);
        setField(term82293, term82293.getClass(), "first", null);
        term82385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82557 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term82659 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term82751 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term82455, term82455.getClass(), "type", 0);
        setField(term82385, term82385.getClass(), "next", term82455);
        setIntField(term82557, term82557.getClass(), "propType", 8388608);
        setIntField(term82659, term82659.getClass(), "propType", 0);
        setField(term82659, term82659.getClass(), "next", null);
        setField(term82557, term82557.getClass(), "next", term82659);
        setField(term82385, term82385.getClass(), "propListHead", term82557);
        setIntField(term82385, term82385.getClass(), "sourcePosition", 0);
        setField(term82385, term82385.getClass(), "last", null);
        setField(term82385, term82385.getClass(), "first", null);
        setField(term82385, term82385.getClass(), "parent", term82751);
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
        args[0] = term82293;
        args[1] = null;
        args[2] = term82385;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term82223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


