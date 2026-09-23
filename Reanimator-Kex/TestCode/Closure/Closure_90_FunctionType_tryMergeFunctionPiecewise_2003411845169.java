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

public class FunctionType_tryMergeFunctionPiecewise_2003411845169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89004;
     Object term89338;
     Object term89560;
     Object term89564;

    public FunctionType_tryMergeFunctionPiecewise_2003411845169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89168, term89168.getClass(), "first", term89238);
        setField(term89098, term89098.getClass(), "parameters", term89168);
        setField(term89004, term89004.getClass(), "call", term89098);
        term89338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89502, term89502.getClass(), "first", null);
        setField(term89432, term89432.getClass(), "parameters", term89502);
        setField(term89338, term89338.getClass(), "call", term89432);
        term89560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89562, term89562.getClass(), "type", 0);
        setField(term89562, term89562.getClass(), "next", null);
        setIntField(term89563, term89563.getClass(), "type", 0);
        setField(term89563, term89563.getClass(), "next", null);
        setField(term89563, term89563.getClass(), "first", null);
        setField(term89563, term89563.getClass(), "last", null);
        setField(term89563, term89563.getClass(), "propListHead", null);
        setIntField(term89563, term89563.getClass(), "sourcePosition", 0);
        setField(term89563, term89563.getClass(), "jsType", null);
        setField(term89563, term89563.getClass(), "parent", null);
        setField(term89562, term89562.getClass(), "first", term89563);
        setField(term89562, term89562.getClass(), "last", null);
        setField(term89562, term89562.getClass(), "propListHead", null);
        setIntField(term89562, term89562.getClass(), "sourcePosition", 0);
        setField(term89562, term89562.getClass(), "jsType", null);
        setField(term89562, term89562.getClass(), "parent", null);
        setField(term89561, term89561.getClass(), "parameters", term89562);
        setField(term89561, term89561.getClass(), "returnType", null);
        setBooleanField(term89561, term89561.getClass(), "returnTypeInferred", false);
        setBooleanField(term89561, term89561.getClass(), "resolved", false);
        setField(term89561, term89561.getClass(), "resolveResult", null);
        setField(term89561, term89561.getClass(), "registry", null);
        setField(term89560, term89560.getClass(), "call", term89561);
        setField(term89560, term89560.getClass(), "prototype", null);
        setField(term89560, term89560.getClass(), "kind", null);
        setField(term89560, term89560.getClass(), "typeOfThis", null);
        setField(term89560, term89560.getClass(), "source", null);
        setField(term89560, term89560.getClass(), "implementedInterfaces", null);
        setField(term89560, term89560.getClass(), "subTypes", null);
        setField(term89560, term89560.getClass(), "templateTypeName", null);
        setField(term89560, term89560.getClass(), "className", null);
        setField(term89560, term89560.getClass(), "properties", null);
        setBooleanField(term89560, term89560.getClass(), "nativeType", false);
        setField(term89560, term89560.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89560, term89560.getClass(), "prettyPrint", false);
        setBooleanField(term89560, term89560.getClass(), "visited", false);
        setField(term89560, term89560.getClass(), "docInfo", null);
        setBooleanField(term89560, term89560.getClass(), "unknown", false);
        setBooleanField(term89560, term89560.getClass(), "resolved", false);
        setField(term89560, term89560.getClass(), "resolveResult", null);
        setField(term89560, term89560.getClass(), "registry", null);
        term89564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term89565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term89566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89566, term89566.getClass(), "type", 0);
        setField(term89566, term89566.getClass(), "next", null);
        setField(term89566, term89566.getClass(), "first", null);
        setField(term89566, term89566.getClass(), "last", null);
        setField(term89566, term89566.getClass(), "propListHead", null);
        setIntField(term89566, term89566.getClass(), "sourcePosition", 0);
        setField(term89566, term89566.getClass(), "jsType", null);
        setField(term89566, term89566.getClass(), "parent", null);
        setField(term89565, term89565.getClass(), "parameters", term89566);
        setField(term89565, term89565.getClass(), "returnType", null);
        setBooleanField(term89565, term89565.getClass(), "returnTypeInferred", false);
        setBooleanField(term89565, term89565.getClass(), "resolved", false);
        setField(term89565, term89565.getClass(), "resolveResult", null);
        setField(term89565, term89565.getClass(), "registry", null);
        setField(term89564, term89564.getClass(), "call", term89565);
        setField(term89564, term89564.getClass(), "prototype", null);
        setField(term89564, term89564.getClass(), "kind", null);
        setField(term89564, term89564.getClass(), "typeOfThis", null);
        setField(term89564, term89564.getClass(), "source", null);
        setField(term89564, term89564.getClass(), "implementedInterfaces", null);
        setField(term89564, term89564.getClass(), "subTypes", null);
        setField(term89564, term89564.getClass(), "templateTypeName", null);
        setField(term89564, term89564.getClass(), "className", null);
        setField(term89564, term89564.getClass(), "properties", null);
        setBooleanField(term89564, term89564.getClass(), "nativeType", false);
        setField(term89564, term89564.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term89564, term89564.getClass(), "prettyPrint", false);
        setBooleanField(term89564, term89564.getClass(), "visited", false);
        setField(term89564, term89564.getClass(), "docInfo", null);
        setBooleanField(term89564, term89564.getClass(), "unknown", false);
        setBooleanField(term89564, term89564.getClass(), "resolved", false);
        setField(term89564, term89564.getClass(), "resolveResult", null);
        setField(term89564, term89564.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term89338;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term89004, args);
        assertTrue(recursiveEquals(term89004, term89560));
        assertTrue(recursiveEquals(term89338, term89564));
        assertTrue(recursiveEquals(retValue, null));
    }

};


