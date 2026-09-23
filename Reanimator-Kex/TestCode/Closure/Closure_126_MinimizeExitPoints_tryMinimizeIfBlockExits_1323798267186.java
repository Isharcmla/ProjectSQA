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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57986;
     Object term58078;
     Object term58170;
     Object term58364;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57986 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term58078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58078, term58078.getClass(), "type", 0);
        setField(term58078, term58078.getClass(), "first", null);
        term58170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58272 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term58170, term58170.getClass(), "type", 0);
        setIntField(term58272, term58272.getClass(), "propType", 51);
        setField(term58272, term58272.getClass(), "next", null);
        setField(term58170, term58170.getClass(), "propListHead", term58272);
        term58364 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58364, term58364.getClass(), "next", term58434);
        setField(term58364, term58364.getClass(), "propListHead", null);
        setIntField(term58364, term58364.getClass(), "sourcePosition", 0);
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
        args[0] = term58078;
        args[1] = term58170;
        args[2] = term58364;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term57986, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


