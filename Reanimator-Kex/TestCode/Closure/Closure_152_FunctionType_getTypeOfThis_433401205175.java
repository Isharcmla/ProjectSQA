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

public class FunctionType_getTypeOfThis_433401205175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89187;
     Object term89308;
     Object term89296;

    public FunctionType_getTypeOfThis_433401205175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term89187, term89187.getClass(), "typeOfThis", term89287);
        term89308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term89308, term89308.getClass(), "call", null);
        setField(term89308, term89308.getClass(), "prototype", null);
        setField(term89308, term89308.getClass(), "kind", null);
        setField(term89309, term89309.getClass(), "call", null);
        setField(term89309, term89309.getClass(), "prototype", null);
        setField(term89309, term89309.getClass(), "kind", null);
        setField(term89309, term89309.getClass(), "typeOfThis", null);
        setField(term89309, term89309.getClass(), "source", null);
        setField(term89309, term89309.getClass(), "implementedInterfaces", null);
        setField(term89309, term89309.getClass(), "subTypes", null);
        setField(term89309, term89309.getClass(), "templateTypeName", null);
        setField(term89309, term89309.getClass(), "className", null);
        setField(term89309, term89309.getClass(), "properties", null);
        setBooleanField(term89309, term89309.getClass(), "nativeType", false);
        setField(term89309, term89309.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89309, term89309.getClass(), "prettyPrint", false);
        setBooleanField(term89309, term89309.getClass(), "visited", false);
        setField(term89309, term89309.getClass(), "docInfo", null);
        setBooleanField(term89309, term89309.getClass(), "unknown", false);
        setBooleanField(term89309, term89309.getClass(), "resolved", false);
        setField(term89309, term89309.getClass(), "resolveResult", null);
        setField(term89309, term89309.getClass(), "registry", null);
        setField(term89308, term89308.getClass(), "typeOfThis", term89309);
        setField(term89308, term89308.getClass(), "source", null);
        setField(term89308, term89308.getClass(), "implementedInterfaces", null);
        setField(term89308, term89308.getClass(), "subTypes", null);
        setField(term89308, term89308.getClass(), "templateTypeName", null);
        setField(term89308, term89308.getClass(), "className", null);
        setField(term89308, term89308.getClass(), "properties", null);
        setBooleanField(term89308, term89308.getClass(), "nativeType", false);
        setField(term89308, term89308.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89308, term89308.getClass(), "prettyPrint", false);
        setBooleanField(term89308, term89308.getClass(), "visited", false);
        setField(term89308, term89308.getClass(), "docInfo", null);
        setBooleanField(term89308, term89308.getClass(), "unknown", false);
        setBooleanField(term89308, term89308.getClass(), "resolved", false);
        setField(term89308, term89308.getClass(), "resolveResult", null);
        setField(term89308, term89308.getClass(), "registry", null);
        term89296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term89296, term89296.getClass(), "call", null);
        setField(term89296, term89296.getClass(), "prototype", null);
        setField(term89296, term89296.getClass(), "kind", null);
        setField(term89296, term89296.getClass(), "typeOfThis", null);
        setField(term89296, term89296.getClass(), "source", null);
        setField(term89296, term89296.getClass(), "implementedInterfaces", null);
        setField(term89296, term89296.getClass(), "subTypes", null);
        setField(term89296, term89296.getClass(), "templateTypeName", null);
        setField(term89296, term89296.getClass(), "className", null);
        setField(term89296, term89296.getClass(), "properties", null);
        setBooleanField(term89296, term89296.getClass(), "nativeType", false);
        setField(term89296, term89296.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89296, term89296.getClass(), "prettyPrint", false);
        setBooleanField(term89296, term89296.getClass(), "visited", false);
        setField(term89296, term89296.getClass(), "docInfo", null);
        setBooleanField(term89296, term89296.getClass(), "unknown", false);
        setBooleanField(term89296, term89296.getClass(), "resolved", false);
        setField(term89296, term89296.getClass(), "resolveResult", null);
        setField(term89296, term89296.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term89187, args);
        assertTrue(recursiveEquals(term89187, term89308));
        assertTrue(recursiveEquals(retValue, term89296));
    }

};


