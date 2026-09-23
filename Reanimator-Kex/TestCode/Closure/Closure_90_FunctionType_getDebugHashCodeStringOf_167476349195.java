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

public class FunctionType_getDebugHashCodeStringOf_167476349195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101661;
     Object term101673;
     Object term101674;

    public FunctionType_getDebugHashCodeStringOf_167476349195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term101673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101673, term101673.getClass(), "call", null);
        setField(term101673, term101673.getClass(), "prototype", null);
        setField(term101673, term101673.getClass(), "kind", null);
        setField(term101673, term101673.getClass(), "typeOfThis", null);
        setField(term101673, term101673.getClass(), "source", null);
        setField(term101673, term101673.getClass(), "implementedInterfaces", null);
        setField(term101673, term101673.getClass(), "subTypes", null);
        setField(term101673, term101673.getClass(), "templateTypeName", null);
        setField(term101673, term101673.getClass(), "className", null);
        setField(term101673, term101673.getClass(), "properties", null);
        setBooleanField(term101673, term101673.getClass(), "nativeType", false);
        setField(term101673, term101673.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term101673, term101673.getClass(), "prettyPrint", false);
        setBooleanField(term101673, term101673.getClass(), "visited", false);
        setField(term101673, term101673.getClass(), "docInfo", null);
        setBooleanField(term101673, term101673.getClass(), "unknown", false);
        setBooleanField(term101673, term101673.getClass(), "resolved", false);
        setField(term101673, term101673.getClass(), "resolveResult", null);
        setField(term101673, term101673.getClass(), "registry", null);
        term101674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101674, term101674.getClass(), "call", null);
        setField(term101674, term101674.getClass(), "prototype", null);
        setField(term101674, term101674.getClass(), "kind", null);
        setField(term101674, term101674.getClass(), "typeOfThis", null);
        setField(term101674, term101674.getClass(), "source", null);
        setField(term101674, term101674.getClass(), "implementedInterfaces", null);
        setField(term101674, term101674.getClass(), "subTypes", null);
        setField(term101674, term101674.getClass(), "templateTypeName", null);
        setField(term101674, term101674.getClass(), "className", null);
        setField(term101674, term101674.getClass(), "properties", null);
        setBooleanField(term101674, term101674.getClass(), "nativeType", false);
        setField(term101674, term101674.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term101674, term101674.getClass(), "prettyPrint", false);
        setBooleanField(term101674, term101674.getClass(), "visited", false);
        setField(term101674, term101674.getClass(), "docInfo", null);
        setBooleanField(term101674, term101674.getClass(), "unknown", false);
        setBooleanField(term101674, term101674.getClass(), "resolved", false);
        setField(term101674, term101674.getClass(), "resolveResult", null);
        setField(term101674, term101674.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term101661;
        Object retValue = callMethod(klass, "getDebugHashCodeStringOf", argTypes, term101661, args);
        assertTrue(recursiveEquals(term101661, term101673));
        assertTrue(recursiveEquals(term101661, term101674));
        assertTrue(recursiveEquals(retValue, "me"));
    }

};


