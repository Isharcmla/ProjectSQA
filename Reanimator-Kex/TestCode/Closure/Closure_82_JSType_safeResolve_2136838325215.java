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

public class JSType_safeResolve_2136838325215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32274;
     Object term32381;
     Object term32378;

    public JSType_safeResolve_2136838325215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term32368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setBooleanField(term32274, term32274.getClass(), "resolved", true);
        setField(term32274, term32274.getClass(), "resolveResult", term32368);
        term32381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term32382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term32381, term32381.getClass(), "parameters", null);
        setField(term32381, term32381.getClass(), "returnType", null);
        setBooleanField(term32381, term32381.getClass(), "returnTypeInferred", false);
        setBooleanField(term32381, term32381.getClass(), "resolved", true);
        setField(term32382, term32382.getClass(), "parameters", null);
        setField(term32382, term32382.getClass(), "returnType", null);
        setBooleanField(term32382, term32382.getClass(), "returnTypeInferred", false);
        setBooleanField(term32382, term32382.getClass(), "resolved", false);
        setField(term32382, term32382.getClass(), "resolveResult", null);
        setField(term32382, term32382.getClass(), "registry", null);
        setField(term32381, term32381.getClass(), "resolveResult", term32382);
        setField(term32381, term32381.getClass(), "registry", null);
        term32378 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term32378, term32378.getClass(), "parameters", null);
        setField(term32378, term32378.getClass(), "returnType", null);
        setBooleanField(term32378, term32378.getClass(), "returnTypeInferred", false);
        setBooleanField(term32378, term32378.getClass(), "resolved", false);
        setField(term32378, term32378.getClass(), "resolveResult", null);
        setField(term32378, term32378.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term32274;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term32274, term32381));
        assertTrue(recursiveEquals(retValue, term32378));
    }

};


