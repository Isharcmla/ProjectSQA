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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345985;
     Object term346077;
     Object term346466;
     Object term346468;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345985 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term346077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term346077, term346077.getClass(), "type", 100);
        setField(term346077, term346077.getClass(), "first", term346169);
        term346466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term346466, term346466.getClass(), "number", 0.0);
        setIntField(term346466, term346466.getClass(), "type", 100);
        setField(term346466, term346466.getClass(), "next", null);
        setDoubleField(term346467, term346467.getClass(), "number", 0.0);
        setIntField(term346467, term346467.getClass(), "type", 0);
        setField(term346467, term346467.getClass(), "next", null);
        setField(term346467, term346467.getClass(), "first", null);
        setField(term346467, term346467.getClass(), "last", null);
        setField(term346467, term346467.getClass(), "propListHead", null);
        setIntField(term346467, term346467.getClass(), "sourcePosition", 0);
        setField(term346467, term346467.getClass(), "jsType", null);
        setField(term346467, term346467.getClass(), "parent", null);
        setField(term346466, term346466.getClass(), "first", term346467);
        setField(term346466, term346466.getClass(), "last", null);
        setField(term346466, term346466.getClass(), "propListHead", null);
        setIntField(term346466, term346466.getClass(), "sourcePosition", 0);
        setField(term346466, term346466.getClass(), "jsType", null);
        setField(term346466, term346466.getClass(), "parent", null);
        term346468 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term346468, term346468.getClass(), "number", 0.0);
        setIntField(term346468, term346468.getClass(), "type", 0);
        setField(term346468, term346468.getClass(), "next", null);
        setField(term346468, term346468.getClass(), "first", null);
        setField(term346468, term346468.getClass(), "last", null);
        setField(term346468, term346468.getClass(), "propListHead", null);
        setIntField(term346468, term346468.getClass(), "sourcePosition", 0);
        setField(term346468, term346468.getClass(), "jsType", null);
        setField(term346468, term346468.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term345985;
        args[1] = term346077;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term345985, term346466));
        assertTrue(recursiveEquals(term346077, term346468));
        assertTrue(recursiveEquals(retValue, true));
    }

};


