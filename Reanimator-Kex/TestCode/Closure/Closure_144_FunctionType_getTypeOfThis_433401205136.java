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

public class FunctionType_getTypeOfThis_433401205136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72118;
     Object term72396;
     Object term72384;

    public FunctionType_getTypeOfThis_433401205136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72118, term72118.getClass(), "typeOfThis", term72218);
        term72396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72396, term72396.getClass(), "call", null);
        setField(term72396, term72396.getClass(), "prototype", null);
        setField(term72396, term72396.getClass(), "kind", null);
        setField(term72397, term72397.getClass(), "call", null);
        setField(term72397, term72397.getClass(), "prototype", null);
        setField(term72397, term72397.getClass(), "kind", null);
        setField(term72397, term72397.getClass(), "typeOfThis", null);
        setField(term72397, term72397.getClass(), "source", null);
        setField(term72397, term72397.getClass(), "implementedInterfaces", null);
        setField(term72397, term72397.getClass(), "subTypes", null);
        setField(term72397, term72397.getClass(), "templateTypeName", null);
        setField(term72397, term72397.getClass(), "className", null);
        setField(term72397, term72397.getClass(), "properties", null);
        setField(term72397, term72397.getClass(), "implicitPrototype", null);
        setBooleanField(term72397, term72397.getClass(), "nativeType", false);
        setBooleanField(term72397, term72397.getClass(), "prettyPrint", false);
        setBooleanField(term72397, term72397.getClass(), "visited", false);
        setField(term72397, term72397.getClass(), "docInfo", null);
        setBooleanField(term72397, term72397.getClass(), "unknown", false);
        setBooleanField(term72397, term72397.getClass(), "resolved", false);
        setField(term72397, term72397.getClass(), "resolveResult", null);
        setField(term72397, term72397.getClass(), "registry", null);
        setField(term72396, term72396.getClass(), "typeOfThis", term72397);
        setField(term72396, term72396.getClass(), "source", null);
        setField(term72396, term72396.getClass(), "implementedInterfaces", null);
        setField(term72396, term72396.getClass(), "subTypes", null);
        setField(term72396, term72396.getClass(), "templateTypeName", null);
        setField(term72396, term72396.getClass(), "className", null);
        setField(term72396, term72396.getClass(), "properties", null);
        setField(term72396, term72396.getClass(), "implicitPrototype", null);
        setBooleanField(term72396, term72396.getClass(), "nativeType", false);
        setBooleanField(term72396, term72396.getClass(), "prettyPrint", false);
        setBooleanField(term72396, term72396.getClass(), "visited", false);
        setField(term72396, term72396.getClass(), "docInfo", null);
        setBooleanField(term72396, term72396.getClass(), "unknown", false);
        setBooleanField(term72396, term72396.getClass(), "resolved", false);
        setField(term72396, term72396.getClass(), "resolveResult", null);
        setField(term72396, term72396.getClass(), "registry", null);
        term72384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term72384, term72384.getClass(), "call", null);
        setField(term72384, term72384.getClass(), "prototype", null);
        setField(term72384, term72384.getClass(), "kind", null);
        setField(term72384, term72384.getClass(), "typeOfThis", null);
        setField(term72384, term72384.getClass(), "source", null);
        setField(term72384, term72384.getClass(), "implementedInterfaces", null);
        setField(term72384, term72384.getClass(), "subTypes", null);
        setField(term72384, term72384.getClass(), "templateTypeName", null);
        setField(term72384, term72384.getClass(), "className", null);
        setField(term72384, term72384.getClass(), "properties", null);
        setField(term72384, term72384.getClass(), "implicitPrototype", null);
        setBooleanField(term72384, term72384.getClass(), "nativeType", false);
        setBooleanField(term72384, term72384.getClass(), "prettyPrint", false);
        setBooleanField(term72384, term72384.getClass(), "visited", false);
        setField(term72384, term72384.getClass(), "docInfo", null);
        setBooleanField(term72384, term72384.getClass(), "unknown", false);
        setBooleanField(term72384, term72384.getClass(), "resolved", false);
        setField(term72384, term72384.getClass(), "resolveResult", null);
        setField(term72384, term72384.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term72118, args);
        assertTrue(recursiveEquals(term72118, term72396));
        assertTrue(recursiveEquals(retValue, term72384));
    }

};


