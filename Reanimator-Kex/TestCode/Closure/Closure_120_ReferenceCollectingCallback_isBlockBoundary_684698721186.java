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

public class ReferenceCollectingCallback_isBlockBoundary_684698721186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34366;
     Object term34458;
     Object term34693;
     Object term34694;

    public ReferenceCollectingCallback_isBlockBoundary_684698721186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term34458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term34458, term34458.getClass(), "type", 12);
        term34693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34693, term34693.getClass(), "number", 0.0);
        setIntField(term34693, term34693.getClass(), "type", 12);
        setField(term34693, term34693.getClass(), "next", null);
        setField(term34693, term34693.getClass(), "first", null);
        setField(term34693, term34693.getClass(), "last", null);
        setField(term34693, term34693.getClass(), "propListHead", null);
        setIntField(term34693, term34693.getClass(), "sourcePosition", 0);
        setField(term34693, term34693.getClass(), "jsType", null);
        setField(term34693, term34693.getClass(), "parent", null);
        term34694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term34694, term34694.getClass(), "number", 0.0);
        setIntField(term34694, term34694.getClass(), "type", 0);
        setField(term34694, term34694.getClass(), "next", null);
        setField(term34694, term34694.getClass(), "first", null);
        setField(term34694, term34694.getClass(), "last", null);
        setField(term34694, term34694.getClass(), "propListHead", null);
        setIntField(term34694, term34694.getClass(), "sourcePosition", 0);
        setField(term34694, term34694.getClass(), "jsType", null);
        setField(term34694, term34694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term34366;
        args[1] = term34458;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term34366, term34693));
        assertTrue(recursiveEquals(term34458, term34694));
        assertTrue(recursiveEquals(retValue, false));
    }

};


