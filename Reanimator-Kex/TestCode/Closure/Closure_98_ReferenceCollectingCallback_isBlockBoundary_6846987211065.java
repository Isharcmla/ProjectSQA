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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296071;
     Object term296671;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term296071, term296071.getClass(), "type", 100);
        term296671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term296671, term296671.getClass(), "number", 0.0);
        setIntField(term296671, term296671.getClass(), "type", 100);
        setField(term296671, term296671.getClass(), "next", null);
        setField(term296671, term296671.getClass(), "first", null);
        setField(term296671, term296671.getClass(), "last", null);
        setField(term296671, term296671.getClass(), "propListHead", null);
        setIntField(term296671, term296671.getClass(), "sourcePosition", 0);
        setField(term296671, term296671.getClass(), "jsType", null);
        setField(term296671, term296671.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term296071;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term296071, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


