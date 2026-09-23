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
import java.util.LinkedList;
import java.lang.Object;

public class FunctionType_setImplementedInterfaces_1966858440175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87931;
     Object term87985;
     Object term88059;
     Object term88061;

    public FunctionType_setImplementedInterfaces_1966858440175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term87985 = new LinkedList();
        term88059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term88060 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term88059, term88059.getClass(), "call", null);
        setField(term88059, term88059.getClass(), "prototype", null);
        setField(term88059, term88059.getClass(), "kind", null);
        setField(term88059, term88059.getClass(), "typeOfThis", null);
        setField(term88059, term88059.getClass(), "source", null);
        setField(term88060, term88060.getClass(), "asList", null);
        setField(term88059, term88059.getClass(), "implementedInterfaces", term88060);
        setField(term88059, term88059.getClass(), "subTypes", null);
        setField(term88059, term88059.getClass(), "templateTypeName", null);
        setField(term88059, term88059.getClass(), "className", null);
        setField(term88059, term88059.getClass(), "properties", null);
        setField(term88059, term88059.getClass(), "implicitPrototype", null);
        setBooleanField(term88059, term88059.getClass(), "nativeType", false);
        setBooleanField(term88059, term88059.getClass(), "prettyPrint", false);
        setBooleanField(term88059, term88059.getClass(), "visited", false);
        setField(term88059, term88059.getClass(), "docInfo", null);
        setBooleanField(term88059, term88059.getClass(), "unknown", false);
        setBooleanField(term88059, term88059.getClass(), "resolved", false);
        setField(term88059, term88059.getClass(), "resolveResult", null);
        setField(term88059, term88059.getClass(), "registry", null);
        term88061 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term87985;
        callMethod(klass, "setImplementedInterfaces", argTypes, term87931, args);
        assertTrue(recursiveEquals(term87931, term88059));
        assertTrue(recursiveEquals(term87985, term88061));
    }

};


