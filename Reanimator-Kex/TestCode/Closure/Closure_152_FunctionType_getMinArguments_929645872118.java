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
import java.lang.Object;

public class FunctionType_getMinArguments_929645872118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64279;
     Object term64593;

    public FunctionType_getMinArguments_929645872118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64373, term64373.getClass(), "parameters", null);
        setField(term64279, term64279.getClass(), "call", term64373);
        term64593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64594, term64594.getClass(), "parameters", null);
        setField(term64594, term64594.getClass(), "returnType", null);
        setBooleanField(term64594, term64594.getClass(), "returnTypeInferred", false);
        setBooleanField(term64594, term64594.getClass(), "resolved", false);
        setField(term64594, term64594.getClass(), "resolveResult", null);
        setField(term64594, term64594.getClass(), "registry", null);
        setField(term64593, term64593.getClass(), "call", term64594);
        setField(term64593, term64593.getClass(), "prototype", null);
        setField(term64593, term64593.getClass(), "kind", null);
        setField(term64593, term64593.getClass(), "typeOfThis", null);
        setField(term64593, term64593.getClass(), "source", null);
        setField(term64593, term64593.getClass(), "implementedInterfaces", null);
        setField(term64593, term64593.getClass(), "subTypes", null);
        setField(term64593, term64593.getClass(), "templateTypeName", null);
        setField(term64593, term64593.getClass(), "className", null);
        setField(term64593, term64593.getClass(), "properties", null);
        setBooleanField(term64593, term64593.getClass(), "nativeType", false);
        setField(term64593, term64593.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term64593, term64593.getClass(), "prettyPrint", false);
        setBooleanField(term64593, term64593.getClass(), "visited", false);
        setField(term64593, term64593.getClass(), "docInfo", null);
        setBooleanField(term64593, term64593.getClass(), "unknown", false);
        setBooleanField(term64593, term64593.getClass(), "resolved", false);
        setField(term64593, term64593.getClass(), "resolveResult", null);
        setField(term64593, term64593.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term64279, args);
        assertTrue(recursiveEquals(term64279, term64593));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


