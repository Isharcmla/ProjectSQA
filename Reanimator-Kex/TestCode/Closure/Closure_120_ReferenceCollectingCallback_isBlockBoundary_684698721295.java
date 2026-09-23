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

public class ReferenceCollectingCallback_isBlockBoundary_684698721295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60976;
     Object term61568;

    public ReferenceCollectingCallback_isBlockBoundary_684698721295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60976, term60976.getClass(), "type", 108);
        term61568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term61568, term61568.getClass(), "number", 0.0);
        setIntField(term61568, term61568.getClass(), "type", 108);
        setField(term61568, term61568.getClass(), "next", null);
        setField(term61568, term61568.getClass(), "first", null);
        setField(term61568, term61568.getClass(), "last", null);
        setField(term61568, term61568.getClass(), "propListHead", null);
        setIntField(term61568, term61568.getClass(), "sourcePosition", 0);
        setField(term61568, term61568.getClass(), "jsType", null);
        setField(term61568, term61568.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60976;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term60976, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


