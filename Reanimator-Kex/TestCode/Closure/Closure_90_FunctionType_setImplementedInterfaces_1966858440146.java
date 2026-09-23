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

public class FunctionType_setImplementedInterfaces_1966858440146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77390;
     Object term77444;
     Object term77733;
     Object term77735;

    public FunctionType_setImplementedInterfaces_1966858440146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term77444 = new LinkedList();
        term77733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term77734 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term77733, term77733.getClass(), "call", null);
        setField(term77733, term77733.getClass(), "prototype", null);
        setField(term77733, term77733.getClass(), "kind", null);
        setField(term77733, term77733.getClass(), "typeOfThis", null);
        setField(term77733, term77733.getClass(), "source", null);
        setField(term77734, term77734.getClass(), "asList", null);
        setField(term77733, term77733.getClass(), "implementedInterfaces", term77734);
        setField(term77733, term77733.getClass(), "subTypes", null);
        setField(term77733, term77733.getClass(), "templateTypeName", null);
        setField(term77733, term77733.getClass(), "className", null);
        setField(term77733, term77733.getClass(), "properties", null);
        setBooleanField(term77733, term77733.getClass(), "nativeType", false);
        setField(term77733, term77733.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term77733, term77733.getClass(), "prettyPrint", false);
        setBooleanField(term77733, term77733.getClass(), "visited", false);
        setField(term77733, term77733.getClass(), "docInfo", null);
        setBooleanField(term77733, term77733.getClass(), "unknown", false);
        setBooleanField(term77733, term77733.getClass(), "resolved", false);
        setField(term77733, term77733.getClass(), "resolveResult", null);
        setField(term77733, term77733.getClass(), "registry", null);
        term77735 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term77444;
        callMethod(klass, "setImplementedInterfaces", argTypes, term77390, args);
        assertTrue(recursiveEquals(term77390, term77733));
        assertTrue(recursiveEquals(term77444, term77735));
    }

};


