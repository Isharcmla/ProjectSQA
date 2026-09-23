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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134122;
     Object term134192;
     Object term134262;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134122 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term134192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term134192, term134192.getClass(), "type", 4);
        setField(term134192, term134192.getClass(), "first", null);
        term134262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134434 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term134536 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term134638 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term134740 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term134262, term134262.getClass(), "next", term134332);
        setIntField(term134434, term134434.getClass(), "propType", 1008434829);
        setIntField(term134536, term134536.getClass(), "propType", -1071607981);
        setIntField(term134638, term134638.getClass(), "propType", -1009909728);
        setIntField(term134740, term134740.getClass(), "propType", 40);
        setField(term134638, term134638.getClass(), "next", term134740);
        setField(term134536, term134536.getClass(), "next", term134638);
        setField(term134434, term134434.getClass(), "next", term134536);
        setField(term134262, term134262.getClass(), "propListHead", term134434);
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
        args[0] = term134192;
        args[1] = null;
        args[2] = term134262;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term134122, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


