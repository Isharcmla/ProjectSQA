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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471074;
     Object term472471;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471074 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term471074, term471074.getClass(), "type", 111);
        term472471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term472471, term472471.getClass(), "number", 0.0);
        setIntField(term472471, term472471.getClass(), "type", 111);
        setField(term472471, term472471.getClass(), "next", null);
        setField(term472471, term472471.getClass(), "first", null);
        setField(term472471, term472471.getClass(), "last", null);
        setField(term472471, term472471.getClass(), "propListHead", null);
        setIntField(term472471, term472471.getClass(), "sourcePosition", 0);
        setField(term472471, term472471.getClass(), "jsType", null);
        setField(term472471, term472471.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term471074;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term471074, term472471));
        assertTrue(recursiveEquals(retValue, true));
    }

};


