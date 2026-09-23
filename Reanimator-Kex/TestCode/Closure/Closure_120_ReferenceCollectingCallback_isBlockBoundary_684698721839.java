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

public class ReferenceCollectingCallback_isBlockBoundary_684698721839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333376;
     Object term333468;
     Object term334598;
     Object term334600;

    public ReferenceCollectingCallback_isBlockBoundary_684698721839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333376 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term333468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term333560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term333468, term333468.getClass(), "type", 100);
        setField(term333468, term333468.getClass(), "first", term333560);
        term334598 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term334598, term334598.getClass(), "str", null);
        setIntField(term334598, term334598.getClass(), "type", 100);
        setField(term334598, term334598.getClass(), "next", null);
        setField(term334599, term334599.getClass(), "str", null);
        setIntField(term334599, term334599.getClass(), "type", 0);
        setField(term334599, term334599.getClass(), "next", null);
        setField(term334599, term334599.getClass(), "first", null);
        setField(term334599, term334599.getClass(), "last", null);
        setField(term334599, term334599.getClass(), "propListHead", null);
        setIntField(term334599, term334599.getClass(), "sourcePosition", 0);
        setField(term334599, term334599.getClass(), "jsType", null);
        setField(term334599, term334599.getClass(), "parent", null);
        setField(term334598, term334598.getClass(), "first", term334599);
        setField(term334598, term334598.getClass(), "last", null);
        setField(term334598, term334598.getClass(), "propListHead", null);
        setIntField(term334598, term334598.getClass(), "sourcePosition", 0);
        setField(term334598, term334598.getClass(), "jsType", null);
        setField(term334598, term334598.getClass(), "parent", null);
        term334600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term334600, term334600.getClass(), "str", null);
        setIntField(term334600, term334600.getClass(), "type", 0);
        setField(term334600, term334600.getClass(), "next", null);
        setField(term334600, term334600.getClass(), "first", null);
        setField(term334600, term334600.getClass(), "last", null);
        setField(term334600, term334600.getClass(), "propListHead", null);
        setIntField(term334600, term334600.getClass(), "sourcePosition", 0);
        setField(term334600, term334600.getClass(), "jsType", null);
        setField(term334600, term334600.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term333376;
        args[1] = term333468;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term333376, term334598));
        assertTrue(recursiveEquals(term333468, term334600));
        assertTrue(recursiveEquals(retValue, true));
    }

};


