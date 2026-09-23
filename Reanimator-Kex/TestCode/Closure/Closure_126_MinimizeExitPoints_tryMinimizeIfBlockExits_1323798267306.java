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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111460;
     Object term111530;
     Object term111600;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111460 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term111530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111530, term111530.getClass(), "type", 0);
        setField(term111530, term111530.getClass(), "first", null);
        term111600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111778 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term111848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111670, term111670.getClass(), "type", 105);
        setField(term111600, term111600.getClass(), "next", term111670);
        setIntField(term111778, term111778.getClass(), "propType", 0);
        setField(term111778, term111778.getClass(), "next", null);
        setField(term111600, term111600.getClass(), "propListHead", term111778);
        setIntField(term111600, term111600.getClass(), "sourcePosition", 0);
        setField(term111600, term111600.getClass(), "last", null);
        setField(term111600, term111600.getClass(), "first", term111848);
        setField(term111600, term111600.getClass(), "parent", null);
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
        args[0] = term111530;
        args[1] = null;
        args[2] = term111600;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term111460, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


