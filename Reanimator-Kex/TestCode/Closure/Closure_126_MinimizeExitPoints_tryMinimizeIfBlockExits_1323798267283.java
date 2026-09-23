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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98368;
     Object term98460;
     Object term98552;
     Object term98644;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98368 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term98460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98460, term98460.getClass(), "type", 0);
        setField(term98460, term98460.getClass(), "first", null);
        term98552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98552, term98552.getClass(), "type", 0);
        setField(term98552, term98552.getClass(), "propListHead", null);
        term98644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98644, term98644.getClass(), "next", term98714);
        setField(term98644, term98644.getClass(), "propListHead", null);
        setIntField(term98644, term98644.getClass(), "sourcePosition", 0);
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
        args[0] = term98460;
        args[1] = term98552;
        args[2] = term98644;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term98368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


