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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_canBeSideEffected_2078426861509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42398;
     Object term42487;

    public NodeUtil_canBeSideEffected_2078426861509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42398, term42398.getClass(), "type", 389427431);
        setIntField(term42468, term42468.getClass(), "type", 30);
        setField(term42398, term42398.getClass(), "first", term42468);
        term42487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42487, term42487.getClass(), "type", 389427431);
        setField(term42487, term42487.getClass(), "next", null);
        setIntField(term42488, term42488.getClass(), "type", 30);
        setField(term42488, term42488.getClass(), "next", null);
        setField(term42488, term42488.getClass(), "first", null);
        setField(term42488, term42488.getClass(), "last", null);
        setField(term42488, term42488.getClass(), "propListHead", null);
        setIntField(term42488, term42488.getClass(), "sourcePosition", 0);
        setField(term42488, term42488.getClass(), "jsType", null);
        setField(term42488, term42488.getClass(), "parent", null);
        setField(term42487, term42487.getClass(), "first", term42488);
        setField(term42487, term42487.getClass(), "last", null);
        setField(term42487, term42487.getClass(), "propListHead", null);
        setIntField(term42487, term42487.getClass(), "sourcePosition", 0);
        setField(term42487, term42487.getClass(), "jsType", null);
        setField(term42487, term42487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term42398;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term42398, term42487));
        assertTrue(recursiveEquals(retValue, true));
    }

};


