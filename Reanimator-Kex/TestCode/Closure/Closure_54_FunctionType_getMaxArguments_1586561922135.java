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

public class FunctionType_getMaxArguments_1586561922135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68405;
     Object term68511;

    public FunctionType_getMaxArguments_1586561922135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term68499, term68499.getClass(), "parameters", null);
        setField(term68405, term68405.getClass(), "call", term68499);
        term68511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term68512, term68512.getClass(), "parameters", null);
        setField(term68512, term68512.getClass(), "returnType", null);
        setBooleanField(term68512, term68512.getClass(), "returnTypeInferred", false);
        setBooleanField(term68512, term68512.getClass(), "resolved", false);
        setField(term68512, term68512.getClass(), "resolveResult", null);
        setField(term68512, term68512.getClass(), "registry", null);
        setField(term68511, term68511.getClass(), "call", term68512);
        setField(term68511, term68511.getClass(), "prototype", null);
        setField(term68511, term68511.getClass(), "prototypeSlot", null);
        setField(term68511, term68511.getClass(), "kind", null);
        setField(term68511, term68511.getClass(), "typeOfThis", null);
        setField(term68511, term68511.getClass(), "source", null);
        setField(term68511, term68511.getClass(), "implementedInterfaces", null);
        setField(term68511, term68511.getClass(), "extendedInterfaces", null);
        setField(term68511, term68511.getClass(), "subTypes", null);
        setField(term68511, term68511.getClass(), "templateTypeName", null);
        setField(term68511, term68511.getClass(), "className", null);
        setField(term68511, term68511.getClass(), "properties", null);
        setBooleanField(term68511, term68511.getClass(), "nativeType", false);
        setField(term68511, term68511.getClass(), "implicitPrototypeFallback", null);
        setField(term68511, term68511.getClass(), "ownerFunction", null);
        setBooleanField(term68511, term68511.getClass(), "prettyPrint", false);
        setBooleanField(term68511, term68511.getClass(), "visited", false);
        setField(term68511, term68511.getClass(), "docInfo", null);
        setBooleanField(term68511, term68511.getClass(), "unknown", false);
        setBooleanField(term68511, term68511.getClass(), "resolved", false);
        setField(term68511, term68511.getClass(), "resolveResult", null);
        setField(term68511, term68511.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term68405, args);
        assertTrue(recursiveEquals(term68405, term68511));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


