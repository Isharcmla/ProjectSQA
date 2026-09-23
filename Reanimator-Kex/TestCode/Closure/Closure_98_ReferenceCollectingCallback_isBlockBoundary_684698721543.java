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

public class ReferenceCollectingCallback_isBlockBoundary_684698721543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146558;
     Object term146650;
     Object term147341;
     Object term147342;

    public ReferenceCollectingCallback_isBlockBoundary_684698721543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146558 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term146650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term146650, term146650.getClass(), "type", 12);
        term147341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147341, term147341.getClass(), "str", null);
        setIntField(term147341, term147341.getClass(), "type", 12);
        setField(term147341, term147341.getClass(), "next", null);
        setField(term147341, term147341.getClass(), "first", null);
        setField(term147341, term147341.getClass(), "last", null);
        setField(term147341, term147341.getClass(), "propListHead", null);
        setIntField(term147341, term147341.getClass(), "sourcePosition", 0);
        setField(term147341, term147341.getClass(), "jsType", null);
        setField(term147341, term147341.getClass(), "parent", null);
        term147342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term147342, term147342.getClass(), "str", null);
        setIntField(term147342, term147342.getClass(), "type", 0);
        setField(term147342, term147342.getClass(), "next", null);
        setField(term147342, term147342.getClass(), "first", null);
        setField(term147342, term147342.getClass(), "last", null);
        setField(term147342, term147342.getClass(), "propListHead", null);
        setIntField(term147342, term147342.getClass(), "sourcePosition", 0);
        setField(term147342, term147342.getClass(), "jsType", null);
        setField(term147342, term147342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term146558;
        args[1] = term146650;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term146558, term147341));
        assertTrue(recursiveEquals(term146650, term147342));
        assertTrue(recursiveEquals(retValue, false));
    }

};


