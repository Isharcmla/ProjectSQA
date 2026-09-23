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

public class FunctionType_getParameters_1663846364119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64485;
     Object term64608;
     Object term64607;

    public FunctionType_getParameters_1663846364119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64579, term64579.getClass(), "parameters", null);
        setField(term64485, term64485.getClass(), "call", term64579);
        term64608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64609, term64609.getClass(), "parameters", null);
        setField(term64609, term64609.getClass(), "returnType", null);
        setBooleanField(term64609, term64609.getClass(), "returnTypeInferred", false);
        setBooleanField(term64609, term64609.getClass(), "resolved", false);
        setField(term64609, term64609.getClass(), "resolveResult", null);
        setField(term64609, term64609.getClass(), "registry", null);
        setField(term64608, term64608.getClass(), "call", term64609);
        setField(term64608, term64608.getClass(), "prototype", null);
        setField(term64608, term64608.getClass(), "kind", null);
        setField(term64608, term64608.getClass(), "typeOfThis", null);
        setField(term64608, term64608.getClass(), "source", null);
        setField(term64608, term64608.getClass(), "implementedInterfaces", null);
        setField(term64608, term64608.getClass(), "subTypes", null);
        setField(term64608, term64608.getClass(), "templateTypeName", null);
        setField(term64608, term64608.getClass(), "className", null);
        setField(term64608, term64608.getClass(), "properties", null);
        setBooleanField(term64608, term64608.getClass(), "nativeType", false);
        setField(term64608, term64608.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term64608, term64608.getClass(), "prettyPrint", false);
        setBooleanField(term64608, term64608.getClass(), "visited", false);
        setField(term64608, term64608.getClass(), "docInfo", null);
        setBooleanField(term64608, term64608.getClass(), "unknown", false);
        setBooleanField(term64608, term64608.getClass(), "resolved", false);
        setField(term64608, term64608.getClass(), "resolveResult", null);
        setField(term64608, term64608.getClass(), "registry", null);
        term64607 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term64485, args);
        assertTrue(recursiveEquals(term64485, term64608));
        assertTrue(recursiveEquals(retValue, term64607));
    }

};


