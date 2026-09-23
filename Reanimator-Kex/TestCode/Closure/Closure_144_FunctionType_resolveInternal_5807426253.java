package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145530;
     Object term145593;

    public FunctionType_resolveInternal_5807426253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term145582 = new ArrayList();
        term145530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term145530, term145530.getClass(), "resolveResult", null);
        setBooleanField(term145530, term145530.getClass(), "resolved", false);
        setField(term145530, term145530.getClass(), "call", null);
        setField(term145530, term145530.getClass(), "prototype", null);
        setField(term145530, term145530.getClass(), "typeOfThis", null);
        setField(term145530, term145530.getClass(), "implementedInterfaces", term145582);
        ArrayList term145594 = new ArrayList();
        term145593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term145593, term145593.getClass(), "leastSupertypeVisitor", null);
        setField(term145593, term145593.getClass(), "greatestSubtypeVisitor", null);
        setField(term145593, term145593.getClass(), "call", null);
        setField(term145593, term145593.getClass(), "prototype", null);
        setField(term145593, term145593.getClass(), "kind", null);
        setField(term145593, term145593.getClass(), "typeOfThis", null);
        setField(term145593, term145593.getClass(), "source", null);
        setField(term145593, term145593.getClass(), "implementedInterfaces", term145594);
        setField(term145593, term145593.getClass(), "subTypes", null);
        setField(term145593, term145593.getClass(), "templateTypeName", null);
        setField(term145593, term145593.getClass(), "className", null);
        setField(term145593, term145593.getClass(), "properties", null);
        setField(term145593, term145593.getClass(), "implicitPrototype", null);
        setBooleanField(term145593, term145593.getClass(), "nativeType", false);
        setBooleanField(term145593, term145593.getClass(), "prettyPrint", false);
        setBooleanField(term145593, term145593.getClass(), "visited", false);
        setField(term145593, term145593.getClass(), "docInfo", null);
        setBooleanField(term145593, term145593.getClass(), "unknown", false);
        setBooleanField(term145593, term145593.getClass(), "resolved", false);
        setField(term145593, term145593.getClass(), "resolveResult", null);
        setField(term145593, term145593.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term145530, args);
        assertTrue(recursiveEquals(term145530, term145593));
    }

};


