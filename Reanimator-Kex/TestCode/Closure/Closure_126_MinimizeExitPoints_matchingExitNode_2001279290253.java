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

public class MinimizeExitPoints_matchingExitNode_2001279290253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85101;
     Object term86340;

    public MinimizeExitPoints_matchingExitNode_2001279290253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85101, term85101.getClass(), "type", 4);
        setField(term85101, term85101.getClass(), "first", term85171);
        term86340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86340, term86340.getClass(), "type", 4);
        setField(term86340, term86340.getClass(), "next", null);
        setIntField(term86341, term86341.getClass(), "type", 0);
        setField(term86341, term86341.getClass(), "next", null);
        setField(term86341, term86341.getClass(), "first", null);
        setField(term86341, term86341.getClass(), "last", null);
        setField(term86341, term86341.getClass(), "propListHead", null);
        setIntField(term86341, term86341.getClass(), "sourcePosition", 0);
        setField(term86341, term86341.getClass(), "jsType", null);
        setField(term86341, term86341.getClass(), "parent", null);
        setField(term86340, term86340.getClass(), "first", term86341);
        setField(term86340, term86340.getClass(), "last", null);
        setField(term86340, term86340.getClass(), "propListHead", null);
        setIntField(term86340, term86340.getClass(), "sourcePosition", 0);
        setField(term86340, term86340.getClass(), "jsType", null);
        setField(term86340, term86340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term85101;
        args[1] = 4;
        args[2] = null;
        Object retValue = callMethod(klass, "matchingExitNode", argTypes, null, args);
        assertTrue(recursiveEquals(term85101, term86340));
        assertTrue(recursiveEquals(retValue, false));
    }

};


