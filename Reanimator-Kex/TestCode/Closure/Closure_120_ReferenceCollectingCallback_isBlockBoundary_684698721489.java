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

public class ReferenceCollectingCallback_isBlockBoundary_684698721489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134083;
     Object term134175;
     Object term134190;
     Object term134191;

    public ReferenceCollectingCallback_isBlockBoundary_684698721489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term134083, term134083.getClass(), "type", 111);
        term134175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term134175, term134175.getClass(), "type", 12);
        term134190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term134190, term134190.getClass(), "number", 0.0);
        setIntField(term134190, term134190.getClass(), "type", 12);
        setField(term134190, term134190.getClass(), "next", null);
        setField(term134190, term134190.getClass(), "first", null);
        setField(term134190, term134190.getClass(), "last", null);
        setField(term134190, term134190.getClass(), "propListHead", null);
        setIntField(term134190, term134190.getClass(), "sourcePosition", 0);
        setField(term134190, term134190.getClass(), "jsType", null);
        setField(term134190, term134190.getClass(), "parent", null);
        term134191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term134191, term134191.getClass(), "number", 0.0);
        setIntField(term134191, term134191.getClass(), "type", 111);
        setField(term134191, term134191.getClass(), "next", null);
        setField(term134191, term134191.getClass(), "first", null);
        setField(term134191, term134191.getClass(), "last", null);
        setField(term134191, term134191.getClass(), "propListHead", null);
        setIntField(term134191, term134191.getClass(), "sourcePosition", 0);
        setField(term134191, term134191.getClass(), "jsType", null);
        setField(term134191, term134191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term134083;
        args[1] = term134175;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term134083, term134190));
        assertTrue(recursiveEquals(term134175, term134191));
        assertTrue(recursiveEquals(retValue, true));
    }

};


