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

public class FunctionType_resolveInternal_5807426291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173392;
     Object term173461;

    public FunctionType_resolveInternal_5807426291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term173444 = new ArrayList();
        term173392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term173392, term173392.getClass(), "resolveResult", null);
        setBooleanField(term173392, term173392.getClass(), "resolved", false);
        setField(term173392, term173392.getClass(), "call", null);
        setField(term173392, term173392.getClass(), "prototype", null);
        setField(term173392, term173392.getClass(), "typeOfThis", null);
        setField(term173392, term173392.getClass(), "implementedInterfaces", term173444);
        ArrayList term173462 = new ArrayList();
        term173461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term173461, term173461.getClass(), "leastSupertypeVisitor", null);
        setField(term173461, term173461.getClass(), "greatestSubtypeVisitor", null);
        setField(term173461, term173461.getClass(), "call", null);
        setField(term173461, term173461.getClass(), "prototype", null);
        setField(term173461, term173461.getClass(), "kind", null);
        setField(term173461, term173461.getClass(), "typeOfThis", null);
        setField(term173461, term173461.getClass(), "source", null);
        setField(term173461, term173461.getClass(), "implementedInterfaces", term173462);
        setField(term173461, term173461.getClass(), "subTypes", null);
        setField(term173461, term173461.getClass(), "templateTypeName", null);
        setField(term173461, term173461.getClass(), "className", null);
        setField(term173461, term173461.getClass(), "properties", null);
        setBooleanField(term173461, term173461.getClass(), "nativeType", false);
        setField(term173461, term173461.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term173461, term173461.getClass(), "prettyPrint", false);
        setBooleanField(term173461, term173461.getClass(), "visited", false);
        setField(term173461, term173461.getClass(), "docInfo", null);
        setBooleanField(term173461, term173461.getClass(), "unknown", false);
        setBooleanField(term173461, term173461.getClass(), "resolved", false);
        setField(term173461, term173461.getClass(), "resolveResult", null);
        setField(term173461, term173461.getClass(), "registry", null);
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
        callMethod(klass, "resolveInternal", argTypes, term173392, args);
        assertTrue(recursiveEquals(term173392, term173461));
    }

};


