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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431274;
     Object term431366;
     Object term432327;
     Object term432328;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term431274, term431274.getClass(), "type", 111);
        term431366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431366, term431366.getClass(), "type", 12);
        term432327 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term432327, term432327.getClass(), "str", null);
        setIntField(term432327, term432327.getClass(), "type", 12);
        setField(term432327, term432327.getClass(), "next", null);
        setField(term432327, term432327.getClass(), "first", null);
        setField(term432327, term432327.getClass(), "last", null);
        setField(term432327, term432327.getClass(), "propListHead", null);
        setIntField(term432327, term432327.getClass(), "sourcePosition", 0);
        setField(term432327, term432327.getClass(), "jsType", null);
        setField(term432327, term432327.getClass(), "parent", null);
        term432328 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term432328, term432328.getClass(), "number", 0.0);
        setIntField(term432328, term432328.getClass(), "type", 111);
        setField(term432328, term432328.getClass(), "next", null);
        setField(term432328, term432328.getClass(), "first", null);
        setField(term432328, term432328.getClass(), "last", null);
        setField(term432328, term432328.getClass(), "propListHead", null);
        setIntField(term432328, term432328.getClass(), "sourcePosition", 0);
        setField(term432328, term432328.getClass(), "jsType", null);
        setField(term432328, term432328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term431274;
        args[1] = term431366;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term431274, term432327));
        assertTrue(recursiveEquals(term431366, term432328));
        assertTrue(recursiveEquals(retValue, true));
    }

};


