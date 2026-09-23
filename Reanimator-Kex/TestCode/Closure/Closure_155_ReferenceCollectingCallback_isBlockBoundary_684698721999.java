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

public class ReferenceCollectingCallback_isBlockBoundary_684698721999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253989;
     Object term254081;
     Object term254501;
     Object term254503;

    public ReferenceCollectingCallback_isBlockBoundary_684698721999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term254081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term254173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term254081, term254081.getClass(), "type", 100);
        setField(term254081, term254081.getClass(), "first", term254173);
        term254501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term254502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term254501, term254501.getClass(), "number", 0.0);
        setIntField(term254501, term254501.getClass(), "type", 100);
        setField(term254501, term254501.getClass(), "next", null);
        setDoubleField(term254502, term254502.getClass(), "number", 0.0);
        setIntField(term254502, term254502.getClass(), "type", 0);
        setField(term254502, term254502.getClass(), "next", null);
        setField(term254502, term254502.getClass(), "first", null);
        setField(term254502, term254502.getClass(), "last", null);
        setField(term254502, term254502.getClass(), "propListHead", null);
        setIntField(term254502, term254502.getClass(), "sourcePosition", 0);
        setField(term254502, term254502.getClass(), "jsType", null);
        setField(term254502, term254502.getClass(), "parent", null);
        setField(term254501, term254501.getClass(), "first", term254502);
        setField(term254501, term254501.getClass(), "last", null);
        setField(term254501, term254501.getClass(), "propListHead", null);
        setIntField(term254501, term254501.getClass(), "sourcePosition", 0);
        setField(term254501, term254501.getClass(), "jsType", null);
        setField(term254501, term254501.getClass(), "parent", null);
        term254503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term254503, term254503.getClass(), "number", 0.0);
        setIntField(term254503, term254503.getClass(), "type", 0);
        setField(term254503, term254503.getClass(), "next", null);
        setField(term254503, term254503.getClass(), "first", null);
        setField(term254503, term254503.getClass(), "last", null);
        setField(term254503, term254503.getClass(), "propListHead", null);
        setIntField(term254503, term254503.getClass(), "sourcePosition", 0);
        setField(term254503, term254503.getClass(), "jsType", null);
        setField(term254503, term254503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term253989;
        args[1] = term254081;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term253989, term254501));
        assertTrue(recursiveEquals(term254081, term254503));
        assertTrue(recursiveEquals(retValue, true));
    }

};


