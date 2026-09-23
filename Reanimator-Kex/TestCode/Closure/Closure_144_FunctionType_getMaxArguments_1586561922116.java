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

public class FunctionType_getMaxArguments_1586561922116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62505;
     Object term63517;

    public FunctionType_getMaxArguments_1586561922116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term62599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term62599, term62599.getClass(), "parameters", null);
        setField(term62505, term62505.getClass(), "call", term62599);
        term63517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term63518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term63518, term63518.getClass(), "parameters", null);
        setField(term63518, term63518.getClass(), "returnType", null);
        setBooleanField(term63518, term63518.getClass(), "returnTypeInferred", false);
        setBooleanField(term63518, term63518.getClass(), "resolved", false);
        setField(term63518, term63518.getClass(), "resolveResult", null);
        setField(term63518, term63518.getClass(), "registry", null);
        setField(term63517, term63517.getClass(), "call", term63518);
        setField(term63517, term63517.getClass(), "prototype", null);
        setField(term63517, term63517.getClass(), "kind", null);
        setField(term63517, term63517.getClass(), "typeOfThis", null);
        setField(term63517, term63517.getClass(), "source", null);
        setField(term63517, term63517.getClass(), "implementedInterfaces", null);
        setField(term63517, term63517.getClass(), "subTypes", null);
        setField(term63517, term63517.getClass(), "templateTypeName", null);
        setField(term63517, term63517.getClass(), "className", null);
        setField(term63517, term63517.getClass(), "properties", null);
        setField(term63517, term63517.getClass(), "implicitPrototype", null);
        setBooleanField(term63517, term63517.getClass(), "nativeType", false);
        setBooleanField(term63517, term63517.getClass(), "prettyPrint", false);
        setBooleanField(term63517, term63517.getClass(), "visited", false);
        setField(term63517, term63517.getClass(), "docInfo", null);
        setBooleanField(term63517, term63517.getClass(), "unknown", false);
        setBooleanField(term63517, term63517.getClass(), "resolved", false);
        setField(term63517, term63517.getClass(), "resolveResult", null);
        setField(term63517, term63517.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term62505, args);
        assertTrue(recursiveEquals(term62505, term63517));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


