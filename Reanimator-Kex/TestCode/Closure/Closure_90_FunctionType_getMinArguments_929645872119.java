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

public class FunctionType_getMinArguments_929645872119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65344;
     Object term66212;

    public FunctionType_getMinArguments_929645872119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term65438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term65438, term65438.getClass(), "parameters", null);
        setField(term65344, term65344.getClass(), "call", term65438);
        term66212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term66213, term66213.getClass(), "parameters", null);
        setField(term66213, term66213.getClass(), "returnType", null);
        setBooleanField(term66213, term66213.getClass(), "returnTypeInferred", false);
        setBooleanField(term66213, term66213.getClass(), "resolved", false);
        setField(term66213, term66213.getClass(), "resolveResult", null);
        setField(term66213, term66213.getClass(), "registry", null);
        setField(term66212, term66212.getClass(), "call", term66213);
        setField(term66212, term66212.getClass(), "prototype", null);
        setField(term66212, term66212.getClass(), "kind", null);
        setField(term66212, term66212.getClass(), "typeOfThis", null);
        setField(term66212, term66212.getClass(), "source", null);
        setField(term66212, term66212.getClass(), "implementedInterfaces", null);
        setField(term66212, term66212.getClass(), "subTypes", null);
        setField(term66212, term66212.getClass(), "templateTypeName", null);
        setField(term66212, term66212.getClass(), "className", null);
        setField(term66212, term66212.getClass(), "properties", null);
        setBooleanField(term66212, term66212.getClass(), "nativeType", false);
        setField(term66212, term66212.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term66212, term66212.getClass(), "prettyPrint", false);
        setBooleanField(term66212, term66212.getClass(), "visited", false);
        setField(term66212, term66212.getClass(), "docInfo", null);
        setBooleanField(term66212, term66212.getClass(), "unknown", false);
        setBooleanField(term66212, term66212.getClass(), "resolved", false);
        setField(term66212, term66212.getClass(), "resolveResult", null);
        setField(term66212, term66212.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term65344, args);
        assertTrue(recursiveEquals(term65344, term66212));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


