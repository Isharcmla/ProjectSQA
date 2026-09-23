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

public class ReferenceCollectingCallback_isBlockBoundary_684698721214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40717;
     Object term40809;
     Object term40927;
     Object term40928;

    public ReferenceCollectingCallback_isBlockBoundary_684698721214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term40809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40809, term40809.getClass(), "type", 12);
        term40927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40927, term40927.getClass(), "number", 0.0);
        setIntField(term40927, term40927.getClass(), "type", 12);
        setField(term40927, term40927.getClass(), "next", null);
        setField(term40927, term40927.getClass(), "first", null);
        setField(term40927, term40927.getClass(), "last", null);
        setField(term40927, term40927.getClass(), "propListHead", null);
        setIntField(term40927, term40927.getClass(), "sourcePosition", 0);
        setField(term40927, term40927.getClass(), "jsType", null);
        setField(term40927, term40927.getClass(), "parent", null);
        term40928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term40928, term40928.getClass(), "str", null);
        setIntField(term40928, term40928.getClass(), "type", 0);
        setField(term40928, term40928.getClass(), "next", null);
        setField(term40928, term40928.getClass(), "first", null);
        setField(term40928, term40928.getClass(), "last", null);
        setField(term40928, term40928.getClass(), "propListHead", null);
        setIntField(term40928, term40928.getClass(), "sourcePosition", 0);
        setField(term40928, term40928.getClass(), "jsType", null);
        setField(term40928, term40928.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term40717;
        args[1] = term40809;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term40717, term40927));
        assertTrue(recursiveEquals(term40809, term40928));
        assertTrue(recursiveEquals(retValue, false));
    }

};


