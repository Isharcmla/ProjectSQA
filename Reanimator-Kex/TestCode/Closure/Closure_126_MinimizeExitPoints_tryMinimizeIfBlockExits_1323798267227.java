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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73193;
     Object term73263;
     Object term73610;
     Object term73403;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73193 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term73263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73263, term73263.getClass(), "type", 4);
        setField(term73263, term73263.getClass(), "first", null);
        term73610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73610, term73610.getClass(), "type", 0);
        setField(term73610, term73610.getClass(), "propListHead", null);
        setIntField(term73610, term73610.getClass(), "sourcePosition", 0);
        setField(term73610, term73610.getClass(), "next", null);
        setField(term73610, term73610.getClass(), "parent", null);
        term73403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73575 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term73680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73473, term73473.getClass(), "type", 0);
        setField(term73403, term73403.getClass(), "next", term73473);
        setIntField(term73575, term73575.getClass(), "propType", 0);
        setField(term73575, term73575.getClass(), "next", null);
        setField(term73403, term73403.getClass(), "propListHead", term73575);
        setIntField(term73403, term73403.getClass(), "sourcePosition", 0);
        setField(term73403, term73403.getClass(), "first", term73610);
        setField(term73403, term73403.getClass(), "last", term73680);
        setField(term73403, term73403.getClass(), "parent", term73473);
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
        args[0] = term73263;
        args[1] = term73610;
        args[2] = term73403;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term73193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


