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

public class FunctionType_getMaxArguments_1586561922121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64727;
     Object term64833;

    public FunctionType_getMaxArguments_1586561922121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64821, term64821.getClass(), "parameters", null);
        setField(term64727, term64727.getClass(), "call", term64821);
        term64833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64834, term64834.getClass(), "parameters", null);
        setField(term64834, term64834.getClass(), "returnType", null);
        setBooleanField(term64834, term64834.getClass(), "returnTypeInferred", false);
        setBooleanField(term64834, term64834.getClass(), "resolved", false);
        setField(term64834, term64834.getClass(), "resolveResult", null);
        setField(term64834, term64834.getClass(), "registry", null);
        setField(term64833, term64833.getClass(), "call", term64834);
        setField(term64833, term64833.getClass(), "prototype", null);
        setField(term64833, term64833.getClass(), "kind", null);
        setField(term64833, term64833.getClass(), "typeOfThis", null);
        setField(term64833, term64833.getClass(), "source", null);
        setField(term64833, term64833.getClass(), "implementedInterfaces", null);
        setField(term64833, term64833.getClass(), "subTypes", null);
        setField(term64833, term64833.getClass(), "templateTypeName", null);
        setField(term64833, term64833.getClass(), "className", null);
        setField(term64833, term64833.getClass(), "properties", null);
        setBooleanField(term64833, term64833.getClass(), "nativeType", false);
        setField(term64833, term64833.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term64833, term64833.getClass(), "prettyPrint", false);
        setBooleanField(term64833, term64833.getClass(), "visited", false);
        setField(term64833, term64833.getClass(), "docInfo", null);
        setBooleanField(term64833, term64833.getClass(), "unknown", false);
        setBooleanField(term64833, term64833.getClass(), "resolved", false);
        setField(term64833, term64833.getClass(), "resolveResult", null);
        setField(term64833, term64833.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term64727, args);
        assertTrue(recursiveEquals(term64727, term64833));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


