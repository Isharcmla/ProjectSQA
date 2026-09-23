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

public class FunctionType_setImplementedInterfaces_1966858440190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95663;
     Object term95717;
     Object term96044;
     Object term96046;

    public FunctionType_setImplementedInterfaces_1966858440190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term95717 = new LinkedList();
        term96044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term96045 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term96044, term96044.getClass(), "call", null);
        setField(term96044, term96044.getClass(), "prototype", null);
        setField(term96044, term96044.getClass(), "kind", null);
        setField(term96044, term96044.getClass(), "typeOfThis", null);
        setField(term96044, term96044.getClass(), "source", null);
        setField(term96045, term96045.getClass(), "asList", null);
        setField(term96044, term96044.getClass(), "implementedInterfaces", term96045);
        setField(term96044, term96044.getClass(), "subTypes", null);
        setField(term96044, term96044.getClass(), "templateTypeName", null);
        setField(term96044, term96044.getClass(), "className", null);
        setField(term96044, term96044.getClass(), "properties", null);
        setBooleanField(term96044, term96044.getClass(), "nativeType", false);
        setField(term96044, term96044.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term96044, term96044.getClass(), "prettyPrint", false);
        setBooleanField(term96044, term96044.getClass(), "visited", false);
        setField(term96044, term96044.getClass(), "docInfo", null);
        setBooleanField(term96044, term96044.getClass(), "unknown", false);
        setBooleanField(term96044, term96044.getClass(), "resolved", false);
        setField(term96044, term96044.getClass(), "resolveResult", null);
        setField(term96044, term96044.getClass(), "registry", null);
        term96046 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term95717;
        callMethod(klass, "setImplementedInterfaces", argTypes, term95663, args);
        assertTrue(recursiveEquals(term95663, term96044));
        assertTrue(recursiveEquals(term95717, term96046));
    }

};


