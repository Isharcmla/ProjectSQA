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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20389;
     Object term20459;
     Object term20529;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20389 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term20459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20459, term20459.getClass(), "type", 4);
        setField(term20459, term20459.getClass(), "first", null);
        term20529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20701 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term20529, term20529.getClass(), "next", term20599);
        setIntField(term20701, term20701.getClass(), "propType", 40);
        setField(term20529, term20529.getClass(), "propListHead", term20701);
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
        args[0] = term20459;
        args[1] = null;
        args[2] = term20529;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term20389, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


