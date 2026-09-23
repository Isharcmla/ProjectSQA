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

public class ReferenceCollectingCallback_isBlockBoundary_684698721848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223593;
     Object term223685;
     Object term223699;
     Object term223700;

    public ReferenceCollectingCallback_isBlockBoundary_684698721848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term223685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term223685, term223685.getClass(), "type", 12);
        term223699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223699, term223699.getClass(), "number", 0.0);
        setIntField(term223699, term223699.getClass(), "type", 12);
        setField(term223699, term223699.getClass(), "next", null);
        setField(term223699, term223699.getClass(), "first", null);
        setField(term223699, term223699.getClass(), "last", null);
        setField(term223699, term223699.getClass(), "propListHead", null);
        setIntField(term223699, term223699.getClass(), "sourcePosition", 0);
        setField(term223699, term223699.getClass(), "jsType", null);
        setField(term223699, term223699.getClass(), "parent", null);
        term223700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term223700, term223700.getClass(), "number", 0.0);
        setIntField(term223700, term223700.getClass(), "type", 0);
        setField(term223700, term223700.getClass(), "next", null);
        setField(term223700, term223700.getClass(), "first", null);
        setField(term223700, term223700.getClass(), "last", null);
        setField(term223700, term223700.getClass(), "propListHead", null);
        setIntField(term223700, term223700.getClass(), "sourcePosition", 0);
        setField(term223700, term223700.getClass(), "jsType", null);
        setField(term223700, term223700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term223593;
        args[1] = term223685;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term223593, term223699));
        assertTrue(recursiveEquals(term223685, term223700));
        assertTrue(recursiveEquals(retValue, false));
    }

};


