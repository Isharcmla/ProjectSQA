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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344586;
     Object term344678;
     Object term345249;
     Object term345250;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term344678 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term344678, term344678.getClass(), "type", 12);
        term345249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term345249, term345249.getClass(), "str", null);
        setIntField(term345249, term345249.getClass(), "type", 12);
        setField(term345249, term345249.getClass(), "next", null);
        setField(term345249, term345249.getClass(), "first", null);
        setField(term345249, term345249.getClass(), "last", null);
        setField(term345249, term345249.getClass(), "propListHead", null);
        setIntField(term345249, term345249.getClass(), "sourcePosition", 0);
        setField(term345249, term345249.getClass(), "jsType", null);
        setField(term345249, term345249.getClass(), "parent", null);
        term345250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term345250, term345250.getClass(), "str", null);
        setIntField(term345250, term345250.getClass(), "type", 0);
        setField(term345250, term345250.getClass(), "next", null);
        setField(term345250, term345250.getClass(), "first", null);
        setField(term345250, term345250.getClass(), "last", null);
        setField(term345250, term345250.getClass(), "propListHead", null);
        setIntField(term345250, term345250.getClass(), "sourcePosition", 0);
        setField(term345250, term345250.getClass(), "jsType", null);
        setField(term345250, term345250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term344586;
        args[1] = term344678;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term344586, term345249));
        assertTrue(recursiveEquals(term344678, term345250));
        assertTrue(recursiveEquals(retValue, false));
    }

};


