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

public class ReferenceCollectingCallback_isBlockBoundary_684698721914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235243;
     Object term235335;
     Object term235540;
     Object term235541;

    public ReferenceCollectingCallback_isBlockBoundary_684698721914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235243, term235243.getClass(), "type", 111);
        term235335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term235335, term235335.getClass(), "type", 12);
        term235540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term235540, term235540.getClass(), "number", 0.0);
        setIntField(term235540, term235540.getClass(), "type", 12);
        setField(term235540, term235540.getClass(), "next", null);
        setField(term235540, term235540.getClass(), "first", null);
        setField(term235540, term235540.getClass(), "last", null);
        setField(term235540, term235540.getClass(), "propListHead", null);
        setIntField(term235540, term235540.getClass(), "sourcePosition", 0);
        setField(term235540, term235540.getClass(), "jsType", null);
        setField(term235540, term235540.getClass(), "parent", null);
        term235541 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term235541, term235541.getClass(), "number", 0.0);
        setIntField(term235541, term235541.getClass(), "type", 111);
        setField(term235541, term235541.getClass(), "next", null);
        setField(term235541, term235541.getClass(), "first", null);
        setField(term235541, term235541.getClass(), "last", null);
        setField(term235541, term235541.getClass(), "propListHead", null);
        setIntField(term235541, term235541.getClass(), "sourcePosition", 0);
        setField(term235541, term235541.getClass(), "jsType", null);
        setField(term235541, term235541.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term235243;
        args[1] = term235335;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term235243, term235540));
        assertTrue(recursiveEquals(term235335, term235541));
        assertTrue(recursiveEquals(retValue, true));
    }

};


