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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62183;
     Object term62275;
     Object term62367;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62183 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term62275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term62275, term62275.getClass(), "type", 0);
        setField(term62275, term62275.getClass(), "first", null);
        term62367 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term62567 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term62637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62459, term62459.getClass(), "type", 0);
        setField(term62367, term62367.getClass(), "next", term62459);
        setIntField(term62567, term62567.getClass(), "propType", 0);
        setField(term62567, term62567.getClass(), "next", null);
        setField(term62367, term62367.getClass(), "propListHead", term62567);
        setIntField(term62367, term62367.getClass(), "sourcePosition", 0);
        setField(term62367, term62367.getClass(), "last", null);
        setField(term62367, term62367.getClass(), "first", null);
        setField(term62367, term62367.getClass(), "parent", term62637);
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
        args[0] = term62275;
        args[1] = null;
        args[2] = term62367;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term62183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


