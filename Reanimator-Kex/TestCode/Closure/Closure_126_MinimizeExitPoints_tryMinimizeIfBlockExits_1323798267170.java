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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51033;
     Object term51125;
     Object term51517;
     Object term51379;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51033 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term51125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term51125, term51125.getClass(), "type", 0);
        setField(term51125, term51125.getClass(), "first", null);
        term51517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51517, term51517.getClass(), "type", 0);
        setField(term51517, term51517.getClass(), "propListHead", null);
        setIntField(term51517, term51517.getClass(), "sourcePosition", 0);
        setField(term51517, term51517.getClass(), "next", null);
        setField(term51517, term51517.getClass(), "parent", term51552);
        term51379 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51471, term51471.getClass(), "type", 0);
        setField(term51379, term51379.getClass(), "next", term51471);
        setField(term51379, term51379.getClass(), "propListHead", null);
        setIntField(term51379, term51379.getClass(), "sourcePosition", 0);
        setField(term51379, term51379.getClass(), "first", term51517);
        setField(term51379, term51379.getClass(), "last", null);
        setField(term51379, term51379.getClass(), "parent", term51622);
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
        args[0] = term51125;
        args[1] = term51517;
        args[2] = term51379;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term51033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


