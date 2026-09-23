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

public class FunctionType_setPrototype_1918602805177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80291;
     Object term80578;

    public FunctionType_setPrototype_1918602805177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term80578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term80578, term80578.getClass(), "call", null);
        setField(term80578, term80578.getClass(), "prototype", null);
        setField(term80578, term80578.getClass(), "kind", null);
        setField(term80578, term80578.getClass(), "typeOfThis", null);
        setField(term80578, term80578.getClass(), "source", null);
        setField(term80578, term80578.getClass(), "implementedInterfaces", null);
        setField(term80578, term80578.getClass(), "subTypes", null);
        setField(term80578, term80578.getClass(), "templateTypeName", null);
        setField(term80578, term80578.getClass(), "className", null);
        setField(term80578, term80578.getClass(), "properties", null);
        setField(term80578, term80578.getClass(), "implicitPrototype", null);
        setBooleanField(term80578, term80578.getClass(), "nativeType", false);
        setBooleanField(term80578, term80578.getClass(), "visited", false);
        setField(term80578, term80578.getClass(), "docInfo", null);
        setBooleanField(term80578, term80578.getClass(), "unknown", false);
        setBooleanField(term80578, term80578.getClass(), "resolved", false);
        setField(term80578, term80578.getClass(), "resolveResult", null);
        setField(term80578, term80578.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term80291, args);
        assertTrue(recursiveEquals(term80291, term80578));
        assertTrue(recursiveEquals(retValue, false));
    }

};


