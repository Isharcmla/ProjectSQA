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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58140;
     Object term58149;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58140, term58140.getClass(), "type", 89);
        term58149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58149, term58149.getClass(), "number", 0.0);
        setIntField(term58149, term58149.getClass(), "type", 89);
        setField(term58149, term58149.getClass(), "next", null);
        setField(term58149, term58149.getClass(), "first", null);
        setField(term58149, term58149.getClass(), "last", null);
        setField(term58149, term58149.getClass(), "propListHead", null);
        setIntField(term58149, term58149.getClass(), "sourcePosition", 0);
        setField(term58149, term58149.getClass(), "jsType", null);
        setField(term58149, term58149.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term58140;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term58140, term58149));
        assertTrue(recursiveEquals(retValue, true));
    }

};


